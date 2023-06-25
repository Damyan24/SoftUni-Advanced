package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueueOpearations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] info = scan.nextLine().split(" ");

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int n = Integer.parseInt(info[0]);
        int s = Integer.parseInt(info[1]);
        int x = Integer.parseInt(info[2]);

        String [] nums = scan.nextLine().split(" ");

        for(int i = s ; i < n; i++){
            queue.offer(Integer.parseInt(nums[i]));
        }

        if(queue.contains(x)){
            System.out.println(true);
        }else{
            if(queue.size() == 0){
                System.out.println(0);
            }else{
                int min = Integer.MAX_VALUE;
                for(Integer num : queue){
                    if(num < min){
                        min = num;
                    }
                }
                System.out.println(min);
            }
        }
    }
}
