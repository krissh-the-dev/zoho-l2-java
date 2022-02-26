package me.devkrish;

import java.util.Arrays;
import java.util.Scanner;

public class Console {
    public static int[] getIntArray(String s, Scanner scanner) {
        System.out.print(s);
        int input2[] = Arrays.stream(
                        scanner.nextLine().split(" ")
                ).mapToInt(Integer::parseInt)
                .toArray();

        return input2;
    }
}
