package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("Please enter your data;");
            Ingredients ingredients = new Ingredients(scanner.nextInt(), scanner.nextLine());
            sum = ingredients.getPrise() + sum;
        }

        Smoothie smoothie = new Smoothie(sum + (sum * 30) / 100);
        System.out.println("The prise of smoothie is " + smoothie.getPrise());
    }
}