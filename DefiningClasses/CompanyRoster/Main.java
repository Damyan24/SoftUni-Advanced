package DefiningClasses.CompanyRoster;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<Employee> employees = new ArrayList<>();


        HashMap<String, Department> deps = new HashMap<>();


        for (int i = 0; i < n; i++) {
            String[] info = scan.nextLine().split(" ");

            String name = info[0];
            double salary = Double.parseDouble(info[1]);
            String position = info[2];
            String department = info[3];


            Employee emp = new Employee(name, salary, position, department);
            if (info.length == 4) {
                emp.setEmail("n/a");
                emp.setAge(-1);
            } else if (info.length == 6) {
                emp.setEmail(info[4]);
                emp.setAge(Integer.parseInt(info[5]));
            } else {
                if (info[4].contains("@")) {
                    emp.setEmail(info[4]);
                    emp.setAge(-1);
                } else {
                    emp.setEmail("n/a");
                    emp.setAge(Integer.parseInt(info[4]));
                }
            }


            if (deps.containsKey(department)) {

                Department current = deps.get(department);
                List<Employee> currentEmployee = current.getWorkers();
                currentEmployee.add(emp);
                current.setWorkers(currentEmployee);
                deps.put(department, current);
            } else {
                List<Employee> newList = new ArrayList<>();
                newList.add(emp);
                Department newDep = new Department();
                newDep.setWorkers(newList);

                deps.put(department, newDep);
            }

        }

        double average = 0;
        String department = "";


        for (Map.Entry<String, Department> entry : deps.entrySet()) {
            double currentAvg = 0;
            Department current = entry.getValue();
            List<Employee> workers = current.getWorkers();

            double sum = workers.stream().mapToDouble(Employee::getSalary).sum();

            currentAvg = sum / workers.size();

            if (currentAvg > average) {
                average = currentAvg;
                department = entry.getKey();
            }
        }

        System.out.println("Highest Average Salary: " + department);
        for (Map.Entry<String, Department> entry : deps.entrySet()) {

            if(entry.getKey().equals(department)){
                List<Employee>highestPaid = entry.getValue().getWorkers();

               List<Employee> sorted = highestPaid.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());
                for (Employee emp:sorted) {
                    emp.toString();
                }
            }
        }
    }
}