package FunctionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CustomMinFunction {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Function<List<Integer> , Integer> getMin = Collections::min;


        System.out.println(getMin.apply(nums));





    }


}
