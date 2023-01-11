public class ExceptionExample2 {
    public static void main(String[] args) {

        int a = 5, b = 0;

        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

    }
}

//  java.lang.ArithmeticException: / by zero
//	at ExceptionExample2.main(ExceptionExample2.java:9)
