package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor {
    public static void main(String[] args) {
        String [] names = new Scanner(System.in).nextLine().split("\\s+");

        Consumer<String> printer = el -> System.out.println("Sir " + el);

        Arrays.stream(names)
                .forEach(printer);

    }
}

