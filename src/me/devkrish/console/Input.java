package me.devkrish.console;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static int[] getIntArray(String question, Scanner scanner) {
        System.out.print(question + ": ");
        return Arrays.stream(
                        scanner.nextLine().split(" ")
                ).mapToInt(Integer::parseInt)
                .toArray();
    }

    public static String[] getStringArray(String question, Scanner scanner) {
        System.out.print(question + ": ");
        return scanner.nextLine().split(" ");
    }

    public static String getLine(String question, Scanner scanner) {
        System.out.print(question + ": ");
        return scanner.nextLine();
    }
}
