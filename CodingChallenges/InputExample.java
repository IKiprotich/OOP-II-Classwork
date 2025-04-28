package codingchallenges;

import java.util.Scanner;


class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input AND CONNNECT TO THE CONSOLE

        System.out.print("Enter your name: "); // Prompt the user for their name
        String name = scanner.nextLine(); // Read a string input

        System.out.print("Enter your age: "); // Prompt the user for their age
        int age = scanner.nextInt(); // Read an integer input

        System.out.print("Enter your height in meters: "); // Prompt the user for their height
        double height = scanner.nextDouble(); // Read a double input

        System.out.println("Hello, " + name + "! You are " + age + " years old and " + height + " meters tall."); // Print the collected information

        scanner.close(); // Close the scanner
    }
}

