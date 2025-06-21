package Testquestions_21_06;

import java.util.Scanner;
//a == b: false a > b: true a < b: false (a > b) && (a > 0): true (a < b) || (a > 0): true !(a > b): false
public class Challenge3
{
    public static void main(String[] args)
    {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scanner.nextInt();
        System.out.println("Enter the first number");
        int b = scanner.nextInt();
        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println((a > b) && (a > 0));
        System.out.println((a < b) || (a > 0));
        System.out.println(!(a > b));
    }
}
