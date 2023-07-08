package IteratorsAndComparators.ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        String line = scan.nextLine();

        while (!line.equals("END")) {
            Person newP = new Person(line.split(" ")[0], Integer.parseInt(line.split(" ")[1]), line.split(" ")[2]);
            people.add(newP);

            line = scan.nextLine();
        }

        int indexOfComparablePerson = Integer.parseInt(scan.nextLine()) - 1;

        Person comparablePerson = people.get(indexOfComparablePerson);
        int count = 0;

            int index = 0;
        for (Person person : people) {
            if (index != indexOfComparablePerson) {
                count = comparablePerson.compareTo(person);
            }
            index++;
        }

            if (count == 0) {
                System.out.println("No matches");
            } else {
                System.out.printf("%d %d %d", count + 1, people.size() - count - 1, people.size());
            }


        }
    }

