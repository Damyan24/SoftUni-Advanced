package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction {

    public static void main(String[] args) {
        String [] num = new Scanner(System.in).nextLine().split(" ");

       int [] nums = new int [num.length];
       
       for(int i = 0 ; i < nums.length;i++){
           nums[i] = Integer.parseInt(num[i]);
       }

        Function<int[], Object> findMin = arr -> Arrays.stream(arr).min().getAsInt();

        System.out.println(findMin.apply(nums));





    }


}
