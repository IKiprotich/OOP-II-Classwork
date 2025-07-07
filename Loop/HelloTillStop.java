package Loop;

import java.util.Scanner;
public class HelloTillStop {
    public static void main(String[] args) {
        SayHello sayHello = new SayHello();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the letter 'h' to output 'hello '");
        String choice=sc.next();
        sayHello.showHello(choice, sc);
    }
}
class SayHello {

    void showHello(String choice, Scanner sc) {




        while ("h".equals(choice)){
            System.out.println("Hello");
            choice=sc.next();
        }

    }

}