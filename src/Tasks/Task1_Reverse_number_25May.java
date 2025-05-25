package Tasks;

public class Task1_Reverse_number_25May
{
    public static void main(String[] args)
    {
        int num=3456;
        int rev=0;
        int num1=0;


        for(;num>0;num=num/10)
        {
            num1=num%10;
            rev=rev*10+num1;
        }
        System.out.println(rev);
    }
}
