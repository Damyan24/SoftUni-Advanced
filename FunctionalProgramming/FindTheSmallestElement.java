package FunctionalProgramming;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement {
    public static  void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] numsStr = scan.nextLine().split("\\s+");

        List<Integer> nums = new ArrayList<>();


        nums = Arrays.stream(numsStr).map(Integer::parseInt).collect(Collectors.toList());


        Function<List<Integer>,Integer> findMin = Collections::min;

        System.out.println(nums.lastIndexOf(findMin.apply(nums)));

    }
}
