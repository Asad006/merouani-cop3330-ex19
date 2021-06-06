package org.example;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Asad merouani
 */


import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();

        app.getBmiResul(scanner);
    }

    private void getBmiResul(Scanner scanner) {
        float weight = 0, height = 0;
        double bmi;
        try {
            System.out.println("Enter you weight in (lbs)");
            weight = Float.parseFloat(scanner.nextLine());

            System.out.println("Enter you height in (in)");
            height = Float.parseFloat(scanner.nextLine());
        } catch (Exception e) {
            System.out.println(" Invalid entry.");
        }

        bmi = (weight / (height * height)) * 703;

        System.out.printf("Your BMI is %.2f \n", bmi);

        if (bmi > 25) {
            System.out.println("You are overweight. You should see your doctor.");
        } else if (bmi < 18.5) {
            System.out.println("You are underweight. You should see your doctor.");
        } else {
            System.out.println("You are within the ideal weight range.");
        }

    }
}
