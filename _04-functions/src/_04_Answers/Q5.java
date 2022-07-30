package _04_Answers;

//Define a method that returns the product of two numbers entered by user.

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        System.out.println("Product of two numbers using method");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first number");
        int num1 = in.nextInt();
        System.out.println("Enter your second number");
        int num2 = in.nextInt();
        System.out.println("Product of two numbers are : "+product(num1,num2));

    }

    public static int product(int num1, int num2){
        return num1*num2;
    }
}
