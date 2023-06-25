package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] nums = scan.nextLine().split(" ");

        ArrayDeque<String> numbers = new ArrayDeque<>();
        for(int i = 0; i  < nums.length; i++){
            numbers.push(nums[i]);
        }

        while (numbers.size() > 0){
            System.out.print(numbers.pop()+" ");
        }

        }
    }

