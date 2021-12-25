public class U5_ExceptionHandling_1 {
    public static void main(String args[]) {
        try {
            // code that may raise exception
            int data = 100 / 0;
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero.");
        }
        // rest code of the program
        System.out.println("rest of the code...");
    }
}