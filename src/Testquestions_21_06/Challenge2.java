package Testquestions_21_06;

import java.util.Scanner;

public class Challenge2
{
    public static void main(String[] args)
    {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scanner.nextInt();
        System.out.println("Enter the first number");
        int b = scanner.nextInt();
        System.out.println("Addition:"+(a+b));
        System.out.println("Subtraction:"+(a-b));
        System.out.println("Multiplication:"+(a*b));
        System.out.println("Division:"+(a/b));
        System.out.println("Division:"+(a%b));
    }
}
