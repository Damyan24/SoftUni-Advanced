package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String [] names = scan.nextLine().split(" ");


        Predicate<String> stringLength = str -> str.length() <= n;

        Arrays.stream(names).forEach(p -> {
            if(stringLength.test(p)){
                System.out.println(p);
            }
        });
    }
}
