//challenge number: 5
package CodingChallenges;

import java.util.Scanner;

class PersonalizedGreeting {
    @SuppressWarnings("FieldMayBeFinal")
    private Scanner scanner = new Scanner(System.in);

    // Method to greet the user until they decide to stop
    void greetUser() {
        System.out.println("Welcome! Type 'h' to see a friendly 'Hello' or anything else to exit.");

        while (true) {
            System.out.print("Your choice: ");
            String input = scanner.nextLine().trim(); // Read and trim user input

            if ("h".equalsIgnoreCase(input)) { 
                System.out.println("Hello!");
            } else {
                System.out.println("Goodbye! Have a great day! 👋");
                break; // exits the loop
            }
        }
    }

    public static void main(String[] args) {
        PersonalizedGreeting app = new PersonalizedGreeting();
        app.greetUser();
    }
}