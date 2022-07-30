package _04_Answers;

import java.util.Scanner;

//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
public class Q6 {
    public static void main(String[] args) {
        System.out.println("Let's find the circumference and area of a circle of radius entered by user by defining your own method");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius");
        double r = in.nextInt();
        System.out.println("Circumference of Circle : "+circumference(r));
        System.out.println("Area of Circle : "+area(r));
    }
    public static double circumference (double r){
        double pi = 3.14;
        return 2*pi*r;
    }
    public static double area (double r){
        double pi = 3.14;
        return pi*(r*r);
    }
}


