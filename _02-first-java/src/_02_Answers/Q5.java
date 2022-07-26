package _02_Answers;
//Take 2 numbers as input and print the largest number

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers , let's find out which one is greater");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        if(num1>num2){
            System.out.println(num1+" is greater");
        }else{
            System.out.println(num2+" is greater");
        }
    }
}
