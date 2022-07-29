package _04_Answers;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Enter three numbers , I will find the minimum and maximum number");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.println("the maximum number is "+max_num(a,b,c));
        System.out.println("the minimum number is "+min_num(a,b,c));
    }
    static int max_num(int a, int b, int c){
        int max = Math.max(a, b);
        if (max < c){
            max = c;
        }

        return max;
    }

    static int min_num(int a, int b, int c){
        int min = Math.min(a,b);
        if (c<min){
            min=c;
        }
        return min;
    }

}