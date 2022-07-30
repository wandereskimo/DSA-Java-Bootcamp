package _04_Answers;

import java.util.Scanner;

//Write a program to print the sum of two numbers entered by user by defining your own method.
public class Q4 {
    public static void main(String[] args) {
        System.out.println("Sum of two numbers using function method");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = in.nextInt();
        System.out.println("Enter the second number");
        int num2 = in.nextInt();
        System.out.println("Sum of two numbers "+sum(num1,num2));

    }
    public static int sum(int num1,int num2){
        return num1 + num2;
    }
}
