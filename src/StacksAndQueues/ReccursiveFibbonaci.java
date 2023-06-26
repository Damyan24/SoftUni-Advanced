package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReccursiveFibbonaci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        ArrayDeque<Integer> nums = new ArrayDeque<>();
        nums.offer(1);
        nums.offer(1);


        if(number == 0){
            System.out.println(0);
        }else {

        for (int i = 1; i < number; i++) {
                    nums.offer(nums.poll() + nums.peek());

        }
        nums.poll();

        for (Integer num:nums
             ) {
            System.out.println(num);
        }
    }
}
}