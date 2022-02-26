package me.devkrish;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input1 = Console.getIntArray("Enter the values of first array, space separated: ", scanner);
        int[] input2 = Console.getIntArray("Enter the values of second array, space separated: ", scanner);
        scanner.close();

        Set<Integer> merged = IntStream.of(input1).boxed().collect(Collectors.toSet());
        merged.addAll(IntStream.of(input2).boxed().toList());

        int[] sorted = merged.stream()
                .sorted()
                .mapToInt(n -> n)
                .toArray();

        System.out.print("Result: ");
        System.out.println(Arrays.toString(sorted));
    }
}
