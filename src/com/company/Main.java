package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double fahrenheit;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a temperature number: ");
        fahrenheit = scan.nextDouble();
        scan.nextLine(); //Remember to follow every int, double, or long with the nextLine() method to avoid errors.

        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit +" degrees Fahrenheit to Celsius is " + celsius + " degree Celsius.");
    }
}
