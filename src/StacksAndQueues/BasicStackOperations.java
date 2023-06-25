package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] info = scan.nextLine().split(" ");

        int n = Integer.parseInt(info[0]);
        int s = Integer.parseInt(info[1]);
        int check = Integer.parseInt(info[2]);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        String[] nums = scan.nextLine().split(" ");

        for (int i = 0; i < n - s; i++) {
            stack.push(Integer.parseInt(nums[i]));
        }

        if (stack.contains(check)) {
            System.out.println(true);
        } else {
            if (stack.size() != 0) {
                int min = check;
                for (Integer num : stack) {
                    if (num < min) {
                        min = num;
                    }
                }
                System.out.println(min);
            }else {
                System.out.println(0);
            }

        }
    }
}
