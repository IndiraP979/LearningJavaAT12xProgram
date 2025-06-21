package Testquestions_21_06;

import java.util.Scanner;

//a == b: false a > b: true a < b: false (a > b) && (a > 0): true (a < b) || (a > 0): true !(a > b): false
public class Challenge6
{
    public static void main(String[] args)
    {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = scanner.nextInt();
        if(a>0)
        {
            System.out.println("positive");
        }
        else if (a==0)
        {
            System.out.println("Zero");

        }
         else
        {
            System.out.println("Negative");
        }

    }
}
