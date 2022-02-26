package me.devkrish;

import me.devkrish.console.Input;

import java.util.*;

public class Problem4 {
    final static List<Character> OPERATORS = new ArrayList<>(Arrays.asList('+', '-', '*', '/'));
    static List<Character> ALPHANUMERIC = new ArrayList<>(Arrays.asList(
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
            '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '(', ')'
            ));

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String mathExpr = Input.getLine("Enter the expression", scanner);
        scanner.close();

        Stack<Character> stack = new Stack<>();

        boolean isValid = true;

        for (int i = 0; i < mathExpr.length() && isValid; i++) {
            char symbol = mathExpr.charAt(i);

            if(symbol == '(') stack.push(symbol);
            else if(symbol == ')') {
                if(stack.isEmpty()) isValid = false;
                else stack.pop();
            }

            if(OPERATORS.contains(symbol)) {
                if(i-1 < 0 || i+1 >mathExpr.length()-1) isValid = false;
                else if(!ALPHANUMERIC.contains(mathExpr.charAt(i - 1))
                        || !ALPHANUMERIC.contains(mathExpr.charAt(i+1))) isValid = false;
            }
        }

        if (!stack.isEmpty() || !isValid) System.out.println("Invalid");
        else System.out.println("Valid");
    }
}
