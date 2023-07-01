package SetsAndMaps;

import java.util.*;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();
        TreeMap<String, LinkedHashMap<String,Integer>> users = new TreeMap<>();
        while (!line.equals("end")){
            String[]info = line.split("\\s+");

            String ip = info[0].split("=")[1];

            String user = info[2].split("=")[1];

           if(users.containsKey(user)){
               if(users.get(user).containsKey(ip)){
                   LinkedHashMap<String,Integer> newVal = users.get(user);
                   int occurences = newVal.get(ip) + 1;

                   newVal.put(ip,occurences);

                   users.put(user,newVal);
               }else {
                   LinkedHashMap<String,Integer> newVal = users.get(user);
                   newVal.put(ip,1);

                   users.put(user,newVal);
               }
           }else {
               LinkedHashMap<String,Integer> newVal = new LinkedHashMap<>();
               newVal.put(ip,1);

               users.put(user,newVal);
           }




            line = scan.nextLine();
        }

        for(Map.Entry<String,LinkedHashMap<String,Integer>> entry : users.entrySet()){
            System.out.println(entry.getKey()+":");
            LinkedHashMap<String , Integer> ips = entry.getValue();

                int counter = 1;
            for(Map.Entry<String,Integer>entry1 : ips.entrySet()){
                if(counter != ips.size()) {
                    System.out.print(entry1.getKey() + " => " + entry1.getValue() + ", ");
                }else {
                    System.out.print(entry1.getKey() + " => " + entry1.getValue()+".\n");
                }
                counter++;
            }
        }
    }
}
