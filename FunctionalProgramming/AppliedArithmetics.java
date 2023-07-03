package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] nums = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::valueOf).toArray();

        String command = scan.nextLine();


        Function <Integer , Integer> increment = n -> n + 1;
        Function <Integer , Integer> subtract = n -> n - 1;
        Function<Integer,Integer>multiply = n->n*2;

        Consumer<int[]>print = arr -> Arrays.stream(arr).forEach(n -> System.out.print(n + " "));


        while (!command.equals("end")){

            if(command.equals("add")){
               nums = Arrays.stream(nums).map(increment::apply).toArray();
            }else if(command.equals("subtract")){
                nums = Arrays.stream(nums).map(subtract::apply).toArray();
            } else if (command.equals("multiply")) {
                nums = Arrays.stream(nums).map(multiply::apply).toArray();
            }else if(command.equals("print")) {
                print.accept(nums);
            }

            command = scan.nextLine();
        }
    }
}
