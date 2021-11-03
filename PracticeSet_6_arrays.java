
// Q.1) Create an array of 5 floats and calculate their sum.

// Q.2) Write a program to find out whether a given integer is present in an array or not.

// Q.3) Calculate the average marks from an array containing marks of all students in physics
// using a for-each loop.

// Q.4) Create a Java program to add two matrices of size 2x3.

// Q.5) Write a Java program to reverse an array.

// Q.6) Write a Java program to find the maximum element in an array.

// Q.7) Write a Java program to find the minimum element in a Java array.

// Q.8) Write a Java program to find whether an array is sorted or not.

import java.util.Scanner;
public class PracticeSet_6_arrays {
    public static void main(String[] args) {
 
        // Practice Problem 1
        // float [] marks = {95.7f, 267.8f, 613.4f, 199.2f, 198.6f};
        // float sum = 0;
        // for(float element:marks){
        //     sum = sum + element;
        // }
        // System.out.println("The value of sum is " + sum);


        // Practice Problem 2
        // int [] marks = {45, 67, 63, 99, 100};
        // int num = 99;
        // boolean isInArray = false;
        // for(int element:marks){
        //     if(num==element){
        //         isInArray = true;
        //         break;
        //     }
        // }
        // if(isInArray){
        //     System.out.println("The value is present in the array which is : "+ num);
        // }
        // else{
        //     System.out.println("The value is not present in the array");
        // }


        // Practice Problem 3

        // float [] marks = {99.7f, 97.8f, 89.4f, 99.2f, 100.0f};
        // float sum = 0;
        // for(float element:marks){
        //     sum = sum + element;
        // }
        // System.out.println("The value of average marks in Physics is " + sum/marks.length);


        // Practice Problem 4
        // int [][] mat1 = {{10, 22, 13},
        //                  {41, 50, 61}};
        // int [][] mat2 = {{12, 26, 13},
        //                  {35, 71, 19}};
        // int [][] result = {{0, 0, 0},
        //                    {0, 0, 0}};
        // System.out.println("The addition of matrices is : ");
        // //Printing the elements of a 2-D Array
        // for (int i=0;i<mat1.length;i++){ 
        //     for (int j=0;j<mat1[i].length;j++) {
        //         result[i][j] = mat1[i][j] + mat2[i][j];
        //         System.out.print(result[i][j] + " ");
                
        //     }
        //     System.out.println(""); // Prints a new line
        // }

        // Practice Problem 5
        // int [] arr = {9, 21, 32, 45, 65, 34, 67};
        // int l = arr.length;
        // int n = Math.floorDiv(l, 2);
        // int temp;

        // for(int i=0; i<n; i++){
        //     temp = arr[i];
        //     arr[i] = arr[l-i-1];
        //     arr[l-i-1] = temp;
        // }

        // for(int element: arr){
        //     System.out.print(element + " ");
        // }

        // Practice Problem 6
        //int [] arr = {10, 21, 3, 45, 5, 34, 7};
        //int max = Integer.MIN_VALUE;
        // //int max=arr[0];
        // for(int e: arr){
        //     if(e>max){
        //         max = e;
        //     }
        // }
        // System.out.println("the value of the maximum element in this array is: "+ max);

        // Practice Problem 6
        // System.out.println(Integer.MIN_VALUE);
        // System.out.println(Integer.MAX_VALUE);
        
        // // Practice Problem 7
        boolean isSorted = true;
        //int [] arr = {19, 2, 43, 14, 5, 34, 7};
        int [] arr={1,2,3,4};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }
    }
}
