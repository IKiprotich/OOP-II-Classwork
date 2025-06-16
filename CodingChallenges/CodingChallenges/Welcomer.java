//Challenge number: 1
package CodingChallenges;

public class Welcomer { // this is a class declaration

    void greet() { 
        System.out.println("Hello, There!");
    }

    public static void main(String[] args) { 
        Welcomer welcomer = new Welcomer(); // create an instance of the class
        welcomer.greet(); // call the greet method
        
    }

}
