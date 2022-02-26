package me.devkrish;

import me.devkrish.console.Input;
import me.devkrish.console.Output;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String[] words = Input.getStringArray("Enter the sentence", scanner);
        scanner.close();

        String smallest = words[0];
        String largest = words[0];

        for (var word: words) {
            if(word.length() < smallest.length()) smallest = word;
            if(word.length() > largest.length()) largest = word;
        }

        Output.printWithLabel("Smallest", smallest);
        Output.printWithLabel("Largest", largest);
    }
}
