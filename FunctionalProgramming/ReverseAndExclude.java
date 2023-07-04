package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAndExclude {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] nums = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int divisibleBy = Integer.parseInt(scan.nextLine());

        nums = Arrays.stream(nums).filter(n -> n % divisibleBy != 0).toArray();

        for(int i = nums.length - 1 ; i >= 0 ; i--){
            System.out.print(nums[i] + " ");
        }
    }
}
