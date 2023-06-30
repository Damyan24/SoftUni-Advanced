package SetsAndMaps;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lines = Integer.parseInt(scan.nextLine());
        TreeSet<String> unique = new TreeSet<>();

        for(int i = 0 ; i < lines ; i++){
            String [] data = scan.nextLine().split("\\s+");

            Collections.addAll(unique, data);
        }

        for (String chemical:unique) {
            System.out.print(chemical + " ");
        }
    }
}
