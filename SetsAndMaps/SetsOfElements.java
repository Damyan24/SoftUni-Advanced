package SetsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String data = scan.nextLine();

        if (data.length() != 0) {
            String[] nums = data.split("\\s+");

            int firstN = Integer.parseInt(nums[0]);
            int secondN = Integer.parseInt(nums[1]);

            Set<Integer> first = new LinkedHashSet<>();
            Set<Integer> second = new LinkedHashSet<>();

            for (int i = 0; i < firstN; i++) {
                first.add(Integer.parseInt(scan.nextLine()));
            }


            for (int i = 0; i < secondN; i++) {
                int num = Integer.parseInt(scan.nextLine());
                second.add(num);
            }


            for (int i : first) {
                if(second.contains(i)){
                    System.out.print(i + " ");
                }
            }

        }
    }
}
