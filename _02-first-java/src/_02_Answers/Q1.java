package _02_Answers;

//1,Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Enter a number , I will find whether it is odd or even");
        //input
        Scanner in= new Scanner(System.in);
        int num = in.nextInt();
        //processing
        if (num % 2 == 0){
            System.out.println("The number you entered is 'even'");
        }
        else {
            System.out.println("The number you entered is 'odd'");
        }

    }
}