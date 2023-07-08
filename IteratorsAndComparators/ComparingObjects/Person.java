package IteratorsAndComparators.ComparingObjects;

import java.util.List;

public class Person implements Comparable<Person> {
    private String name;

    private int age;

    private String town;

    private int count = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }


    @Override
    public int compareTo(Person o) {
        if(o.getName().equals(name) && o.getAge() == age && o.getTown().equals(town)){
            count++;
        }

        return count;
    }
}

