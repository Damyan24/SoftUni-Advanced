package SetsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfRepetitions = Integer.parseInt(scan.nextLine());
        Set<String> uniqueWords = new LinkedHashSet<>();
        for(int i = 0 ; i < numberOfRepetitions; i++){
            uniqueWords.add(scan.nextLine());
        }

        for (String s:uniqueWords) {
            System.out.println(s);
        }
    }



}
