package SetsAndMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        TreeMap<Character , Integer> occurences = new TreeMap<>();

        String line = scan.nextLine();

        for(int i = 0 ; i < line.length(); i++){
            if(occurences.containsKey(line.charAt(i))){
                occurences.put(line.charAt(i),occurences.get(line.charAt(i)) + 1);
            }else {
                occurences.put(line.charAt(i),1);
            }
        }

        for (Map.Entry<Character , Integer> entry:occurences.entrySet()) {
            System.out.println(entry.getKey()+": " + entry.getValue() + " time/s");
        }

    }
}
