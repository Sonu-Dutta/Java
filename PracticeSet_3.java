// Q.1) Write a Java program to convert a string to lowercase.

//Q.2) Write a Java program to replace spaces with underscores.

//Q.3) Write a Java program to fill in a letter template which looks like below:
// // letter = Dear <|name|>, Thanks a lot

// // Replace <|name|> with a string (some name)

// Q.4) Write a Java program to detect double and triple spaces in a string.

//Q.5)  Write a program to format the following letter using escape sequence characters.
// Letter = Dear Harry, This Java Course is nice. Thanks


import java.util.Scanner;
public class PracticeSet_3 {
    public static void main(String[] args) {
        // Ques.1
        // //String name = "Jack Parker";
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter a text : ");
        // String name=sc.nextLine();
        // name = name.toLowerCase();
        // System.out.println(name);

        // Ques.2
        // String text = "To My     Friend";
        // text = text.replace(" ", "_");
        // System.out.println(text);

        // Ques.3

        // String letter = "Dear <|name|>, Thanks a lot!";
        // letter = letter.replace("<|name|>", "Sachin");
        // System.out.println(letter);

        // Ques.4
        // String myString = "This string contains double and  triple   spaces";
        // System.out.println(myString.indexOf("  "));
        // System.out.println(myString.indexOf("   "));

        // Ques.5
        String myLetter = "Dear Harry,\n\tThis Java Course is Nice.\nThanks!";
        System.out.println(myLetter);
    }
}
