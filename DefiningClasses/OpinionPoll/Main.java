package DefiningClasses.OpinionPoll;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        TreeMap<String,Integer>people = new TreeMap<>();

        for(int i = 0 ; i < n ; i++) {
            String[] info = scan.nextLine().split(" ");

            Person man = new Person();
            man.setName(info[0]);
            man.setage(Integer.parseInt(info[1]));
            if (man.getAge() > 30) {
                people.put(man.getName(), man.getAge());
            }
        }


        for(Map.Entry<String,Integer>entry:people.entrySet()){
            System.out.println(entry.getKey() +" - "+ entry.getValue());
        }





    }
}
