package me.devkrish;

import me.devkrish.console.Input;

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int[] moneyInHouses = Input.getIntArray("Enter money in each house, separated by space", scanner);

        int moneyInOddHouses = 0, moneyInEvenHouses = 0;
        for (int i = 0; i < moneyInHouses.length; i++) {
            if(i % 2 == 0) moneyInOddHouses += moneyInHouses[i];
            else moneyInEvenHouses += moneyInHouses[i];
        }

        if(moneyInEvenHouses > moneyInOddHouses)
            System.out.println("Rob houses with EVEN door number");
        else if(moneyInOddHouses > moneyInEvenHouses)
            System.out.println("Rob houses with ODD door numbers");
        else
            System.out.println("DWTFYW");
    }
}
