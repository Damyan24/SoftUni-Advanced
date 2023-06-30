package SetsAndMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        HashMap<String , String> emails = new LinkedHashMap<>();
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();

        while (!name.equals("stop")){
            String email = scan.nextLine();

            if(!email.endsWith("com") && !email.endsWith("uk") && !email.endsWith("us")){
                emails.put(name , email);
            }


            name = scan.nextLine();
        }

        for(Map.Entry<String , String> entry : emails.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
