package IteratorsAndComparators.StrategyPattern;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Set<Person> Person1 = new HashSet<>();
        Set<Person> Person2 = new HashSet<>();

        for(int i = 0 ; i < n ; i++){
            String [] info = scan.nextLine().split(" ");
            Person person = new Person(info[0],Integer.parseInt(info[1]));
            Person1.add(person);
            Person2.add(person);
        }

      NameComparator nemo = new NameComparator();

        Person1.stream().sorted(nemo).forEach(p -> {
            System.out.println(p.getName() + " " + p.getAge());
        });

        AgeComparator agecom = new AgeComparator();

        Person2.stream().sorted(agecom).forEach(p->{
            System.out.println(p.getName() + " " + p.getAge());
        });


    }
}
