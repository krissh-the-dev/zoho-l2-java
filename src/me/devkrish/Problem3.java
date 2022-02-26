package me.devkrish;

import me.devkrish.console.Input;
import me.devkrish.console.Output;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String input = Input.getLine("Enter the input", scanner);
        scanner.close();

        Map<Character, Byte> lettersCount = new HashMap<>();

        for (var character: input.toCharArray()) {
            lettersCount.putIfAbsent(character, (byte) 0);
            lettersCount.replace(character, (byte)(lettersCount.get(character) +1));
        }

        for (var entry: lettersCount.entrySet()) {
            Output.printWithLabel(entry.getKey().toString(), entry.getValue().toString());
        }
    }
}
