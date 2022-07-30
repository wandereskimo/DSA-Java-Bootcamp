package _04_Answers;

//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("What's your Age ?");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        if (Is_eligible(age)){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");
        }

    }

        public static boolean Is_eligible(int age){
            return age >= 18;
    }

}
