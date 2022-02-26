package me.devkrish;

import me.devkrish.console.Input;
import me.devkrish.console.Output;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input1 = Input.getIntArray("Enter the values of first array, space separated", scanner);
        int[] input2 = Input.getIntArray("Enter the values of second array, space separated", scanner);
        scanner.close();

        Set<Integer> merged = IntStream.of(input1).boxed().collect(Collectors.toSet());
        merged.addAll(IntStream.of(input2).boxed().toList());

        int[] sorted = merged.stream()
                .sorted()
                .mapToInt(n -> n)
                .toArray();

        Output.printWithLabel("Result", Arrays.toString(sorted));
    }
}
