package _02_Answers;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("In this program we are gonna find the Simple Interest");
        Scanner in = new Scanner(System.in);
        //input
        System.out.println("Enter the Principal");
        int P = in.nextInt();
        System.out.println("Enter the Time");
        int T = in.nextInt();
        System.out.println("Enter the Rate ");
        float R = in.nextInt();
        float SI = P*T*R;
        //output
        System.out.println("The Simple Interest is : "+SI);
    }
}
