package Tasks;

import java.util.Scanner;

public class Task6_Fabonacciseries_25May
{
    public static void main(String[] args)
    {
        int a=0,b=1,Result=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the fabonacci series till:");
        int num=sc.nextInt();
        for(int i=0;i<=num;i++)
        {
            System.out.println(a);
            Result=a+b;
            a=b;
            b=Result;

        }
    }
}
