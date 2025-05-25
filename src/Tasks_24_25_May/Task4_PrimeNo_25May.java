package Tasks_24_25_May;

import java.util.Scanner;

public class Task4_PrimeNo_25May
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to check weather it is prime or not");
        int num=sc.nextInt();
        int i,result=0;
        if(num==1){
            System.out.println("Number is not a prime number");
        }
        else{

            for(i=1;i<num;i++)
        {
          if(num%i==0)
          {
              result++;
          }}
       if (result>1) {
           System.out.println("Entered number is not a prime number");
       }
          else
          {
              System.out.println("Number is a prime number");
          }

       }

    }}


