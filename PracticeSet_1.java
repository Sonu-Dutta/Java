
// Q.1) Write a program to sum three numbers in Java.

// Q.2) Write a program to calculate CGPA using marks of three subjects (out of 100)

// Q.3) Write a Java program that asks the user to enter his/her name and greets them with -> Hello <name>, have a good day <- text.

// Q.4) Write a Java program to convert Kilometers to miles.

// Q.5) Write a Java program to detect whether a number entered by the user is an integer or not.


import java.util.Scanner;

public class PracticeSet_1 {
    public static void main(String[] args) {

        //Ques.1

        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter first no: ");
        // int no1=sc.nextInt();
        // System.out.println("Enter second no: ");
        // int no2=sc.nextInt();
        // System.out.println("Enter third no: ");
        // int no3=sc.nextInt();
        // int sum=no1+no2+no3;
        // System.out.println("Sum is : "+ sum);

        // Ques.2
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter marks of subject 1 : ");
        // float subject1 =sc.nextFloat();
        // System.out.println("Enter marks of subject 2 : ");
        // float subject2 =sc.nextFloat();
        // System.out.println("Enter marks of subject 3 : ");
        // float subject3 =sc.nextFloat();
        // float cgpa = (subject1 + subject2 +subject3)/30;
        // System.out.println("The cgpa of 3 subjects is "+cgpa);

        //Ques.3
        // System.out.println("What is your name");
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // System.out.println("Hello " + name + " have a good day!");

        // Ques.4


        //Ques.5
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
        
    }
}
