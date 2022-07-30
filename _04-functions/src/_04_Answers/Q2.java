package _04_Answers;

//Define a program to find out whether a given number is even or odd.

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("Let's find out the number is odd or even using a function");
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (odd_even(n)){
            System.out.println("The number is even");
        }else {
            System.out.println("The number is odd");
        }
    }

    public static boolean odd_even(int n){
        return n % 2 == 0;
    }
}
