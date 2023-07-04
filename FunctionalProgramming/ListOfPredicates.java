package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class ListOfPredicates {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        BiFunction<Integer,List<Integer>,Boolean> isdivisible = ((num , list)->{
            for(int numberinList : list){
                if(num % numberinList != 0){
                    return  false;
                }
            }
            return true;
        });


        for(int i = 1 ; i <= number ; i++){
            if(isdivisible.apply(i,numbers)){
                System.out.print(i + " ");
            }
        }

    }
}
