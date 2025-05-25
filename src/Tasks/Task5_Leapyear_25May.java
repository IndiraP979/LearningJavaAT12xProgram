package Tasks;

import java.util.Scanner;

public class Task5_Leapyear_25May
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year to check it is leap year or not");
        int year=sc.nextInt();

        if(year%4==0)
        {
            System.out.println("This is a leap year");
        }
        else

        {
            System.out.println("This is not a leap year");
        }
    }
}
