package _02_Answers;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("Hi Im a mini calculator, Enter two numbers and an operator i will give you the answer");
        System.out.println("Enter your first number");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        System.out.println("Enter your operator");
        char op = in.next().trim().charAt(0);
        System.out.println("Enter your second number");
        int num2= in.nextInt();
        int ans= 0;
        if (op == '+'){
             ans= num1+num2;
        }
        if (op == '-'){
             ans= num1-num2;
        }
        if (op == '*'){
             ans= num1*num2;
        }
        if (op == '/'){
             ans= num1/num2;
        }
        if (op == '%'){
             ans=num1%num2;
        }

        System.out.println("The answer is : "+ans);
    }
}
