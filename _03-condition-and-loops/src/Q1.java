import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Area of circle");
        double pi = 3.14;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius");
        double r = in.nextDouble();
        double area = pi*r*r;
        System.out.println("Area of a circle is "+area);
    }
}