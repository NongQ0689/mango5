import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("You have entered: "+number);
    }
}

//  Enter a number: 5
//  You have entered: 5

//  Enter a number: 5.0
//  Exception in thread "main" java.util.InputMismatchException
//	    at java.base/java.util.Scanner.throwFor(Scanner.java:939)
//	    at java.base/java.util.Scanner.next(Scanner.java:1594)
//	    at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
//	    at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
//	    at ExceptionExample.main(ExceptionExample.java:7)