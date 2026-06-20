// Day 01 - User Input and Output
// Takes name and age from user and prints a greeting

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask for name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Ask for age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Print greeting
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        System.out.println("Welcome to Java programming!");

        // Close scanner
        scanner.close();
    }
}
