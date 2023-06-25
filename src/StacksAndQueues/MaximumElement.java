package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(int i = 0 ; i < n ; i++){
            String [] comands = scan.nextLine().split(" ");
            int command = Integer.parseInt(comands[0]);
            switch (command){
                case 1:
                    stack.push(Integer.parseInt(comands[1]));

                    break;
                case 2:
                    stack.pop();

                    break;
                case 3:
                    int max = 0;
                    for(Integer integer : stack){
                        if(integer > max){
                            max = integer;
                        }
                    }

                    System.out.println(max);
                    break;

            }
        }
    }
}
