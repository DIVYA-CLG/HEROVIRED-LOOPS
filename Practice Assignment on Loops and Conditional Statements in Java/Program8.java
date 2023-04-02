import java.util.*;
class Program8
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p,q,r;
        System.out.print("num1=");
        p=sc.nextInt();
        System.out.print("num2=");
        q=sc.nextInt();
        System.out.print("num3=");
        r=sc.nextInt();
        int big=( r > (p > q ? p : q) ? r: ((p > q) ? p : q));
        int small=(r < (p < q ? p : q) ? r : ((p < q) ? p : q));  
        System.out.println("The Smallest Number:"+small);
        System.out.println("The Largest Number:"+big);
        System.out.println("Average of all three numbers:"+(p+q+r)/3);

    }
}