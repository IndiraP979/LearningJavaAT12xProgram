package Testquestions_21_06;

import java.util.Scanner;


public class Challenge8
{
    public static void main(String[] args)
    {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter te year");
        int year = scanner.nextInt();
        if(year%4==0)
        {
            System.out.println(+year+"is a leap year");
        }
        else
        {
            System.out.println(+year+"is not a leap year");
        }

    }
}
