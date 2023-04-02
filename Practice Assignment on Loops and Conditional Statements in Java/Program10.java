import java.util.*;
class Program10
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("stringName:");
        String s=sc.nextLine();
        int p,q;
        System.out.print("Starting index:");
        p=sc.nextInt();
        System.out.print("Ending index:");
        q=sc.nextInt();
        System.out.print("substring is:"+s.substring(p,q));

    }
}