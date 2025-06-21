package Testquestions_21_06;

import java.util.Scanner;

//a == b: false a > b: true a < b: false (a > b) && (a > 0): true (a < b) || (a > 0): true !(a > b): false
public class Challenge7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scanner.nextInt();
        System.out.println("Enter the second number");
        int b = scanner.nextInt();
        System.out.println("Enter the third number");
        int c = scanner.nextInt();
        if(a>b&&a>c)
        {
            System.out.println("Largest number is:"+a);
        }
        else if (b>c)
        {
            System.out.println("Largest number is:"+b);
        }
         else
         {
             System.out.println("Largest number is:"+c);
        }

    }
}