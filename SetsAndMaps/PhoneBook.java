package SetsAndMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String,String> phoneNums = new LinkedHashMap<>();

        Scanner scan = new Scanner(System.in);

        String info = scan.nextLine();

        while (!info.equals("search")){
            String name = info.split("-")[0];
            String number = info.split("-")[1];

            phoneNums.put(name ,number);

            info = scan.nextLine();
        }


        String search = scan.nextLine();

        while (!search.equals("stop")){

            if(phoneNums.containsKey(search)){
                System.out.println(search + " -> " + phoneNums.get(search));
            }else {
                System.out.println("Contact " + search + " does not exist.");
            }

            search = scan.nextLine();
        }
    }
}
