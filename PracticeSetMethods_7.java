// Q.1) Write a Java method to print the multiplication table of a number n.
// Q.2) Write a program using functions to print the following pattern:
    // *
    // **
    // ***
    // ****
// Q.3) Write a recursive function to calculate the sum of first n natural numbers.
// Q.4) Write a function to print the following pattern:
//     ****
//     ***
//     **
//     *
// Q.5) Write a function to print the nth term of the Fibonacci series using recursion.
// Q.6) Write a function to find the average of a set of numbers passed as arguments.
// Q.7) Repeat problem 4 using Recursion.
// Q.8) Repeat problem 2 using Recursion.
// Q.9) Write a function to convert Celsius temperature into Fahrenheit.
// Q.10) Repeat problem 3 using an iterative approach.


public class PracticeSetMethods_7 {
        static void multiplication(int n) {
            for (int i = 1; i <= 10; i++) {
                System.out.format("%d X %d = %d\n", n, i, n * i);
            }
        }
    
        static void pattern1(int n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i+1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        
        static int sumRec(int n) {
            if (n == 1) {
                return 1;
            }
            return n + sumRec(n - 1);
        }
         
        static void patternQ4(int n) {
            for (int i = n; i>0; i--) {
                for (int j = i; j >0 ; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        static int fib(int n) {
            /* if(n==1){
                return 0;
            }
            else if(n==2){
                return 1;
            } */
            if (n == 1 || n == 2) {
                return n - 1;
            } 
            else {
                return fib(n - 1) + fib(n - 2);
            }
        }

        static void pattern1_rec(int n) {
            if (n > 0) {
                pattern1_rec(n - 1);
                for (int i = 0; i < n; i++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    
        
    
        
    
        public static void main(String[] args) {
            // Problem 1
            // multiplication(7);
    
            // Problem 2
            // pattern1(4);
    
            // Problem 3
            // int c = sumRec(10);
            // System.out.println(c);

            // Problem 4
            // patternQ4(4);
    
            // Problem 5
            // fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
            // int result = fib(9);
            // System.out.println(result);
    
            // Problem 8
           //pattern1_rec(6);
    
        
    }
}
