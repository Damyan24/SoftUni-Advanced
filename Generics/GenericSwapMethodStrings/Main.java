package Generics.GenericSwapMethodStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<Integer> items = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            int num = scan.nextInt();
            items.add(num);
        }

        Swap <Integer> swap = new Swap<>(items);

        int firstIndex = scan.nextInt();
        int secondIndex = scan.nextInt();

        swap.swap(firstIndex,secondIndex);






        for (Integer s:
             items) {
            System.out.println(swap.toString(s));
        }
    }
}
