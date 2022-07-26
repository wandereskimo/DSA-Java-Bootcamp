package _02_Answers;
//Input currency in rupees and output in USD

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        System.out.println("Enter the amount in rupees ");
        Scanner in = new Scanner(System.in);
        float inr = in.nextFloat();
        float usd = inr/80;
        System.out.println("USD = "+usd);
    }
}
