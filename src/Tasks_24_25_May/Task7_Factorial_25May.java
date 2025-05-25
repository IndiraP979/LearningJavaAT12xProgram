package Tasks_24_25_May;

import java.util.Scanner;

public class Task7_Factorial_25May
{
    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the number for factorial");
            int num=sc.nextInt();
            int fact=1;
            if(num==0)
           {
               System.out.println("factorial is "+fact);
           }
           else
            {
                for (int i=num;i>0;i--)
                {
                    fact=fact*i;
                }

                System.out.println("factorial is "+fact);


            }





    }
}
