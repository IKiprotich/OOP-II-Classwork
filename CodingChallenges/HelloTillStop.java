import java.util.*;

class HelloUntilStop {
    Scanner sc = new Scanner(System.in);

    // Outputs hello when the user wants to
    void showHello() {
        String choice; // Guard variable

        System.out.println("For Hello, type 'h' anything else to stop");

        choice = sc.next(); // Set guard variable

        while ("h".equals(choice)) { // Check guard variable
            System.out.println("Hello");

            choice = sc.next(); // Update guard variable
        }
    }

    public static void main(String[] args) {
        HelloUntilStop helloUntilStop = new HelloUntilStop();
        helloUntilStop.showHello();
    }
}