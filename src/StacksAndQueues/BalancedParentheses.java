package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        String[] parenthesis = scan.nextLine().split("");
        ArrayDeque<String> closing = new ArrayDeque<>();
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < parenthesis.length; i++) {
            String current = parenthesis[i];
            if (current.equals("{") || current.equals("(") || current.equals("[")) {
                stack.push(current);
            } else if (current.equals("}") || current.equals(")") || current.equals("]")) {
                closing.offer(current);
            }
        }

        boolean balanced = false;


        if (closing.size() == stack.size()) {
            while (closing.size() != 0 && stack.size() != 0) {
                String opening = stack.pop();
                String close = closing.poll();
                if (opening.equals("(") && close.equals(")") || opening.equals("[") && close.equals("]") || opening.equals("{") && close.equals("}")) {
                    balanced = true;
                } else {
                    balanced = false;
                    break;
                }
            }
            if (balanced) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }else {
            System.out.println("NO");
        }
    }
}