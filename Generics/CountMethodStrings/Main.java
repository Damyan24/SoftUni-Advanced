package Generics.CountMethodStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<Double> nums = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){

            nums.add(Double.parseDouble(scan.nextLine()));

        }

        Counter<Double>counter = new Counter<>(nums);

        System.out.println(counter.count(Double.parseDouble(scan.nextLine())));
    }
}
