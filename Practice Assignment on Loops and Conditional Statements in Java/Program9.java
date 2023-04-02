import java.util.*;
class Program9{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("num=");
        int n=sc.nextInt();
        int p=0;
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                p=1;
                break;
            }
        }
        if(p==0)
        {
            System.out.println("The given number"+n+" is a Prime Number");
        }
        else
        {
            System.out.println("The given number"+n+" is NOT a Prime Number");
        }
    }
}
