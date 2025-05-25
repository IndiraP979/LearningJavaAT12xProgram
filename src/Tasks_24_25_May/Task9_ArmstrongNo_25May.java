package Tasks_24_25_May;

import java.util.Scanner;

public class Task9_ArmstrongNo_25May
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check whether it is armstrong or not");
        int num=sc.nextInt();
        int j=num;
        double total=0;
        int length= String.valueOf(Math.abs(num)).length();
        for(;num>0;num=num/10)
        {
            double num1=num%10;
            double result= Math.pow(num1,length);
            total= total+result;

        }
      if(total==j)
      {
          System.out.println("This is armstrong number");
      }
        else {
          System.out.println("Number is not armstrong");
      }

    }
}
