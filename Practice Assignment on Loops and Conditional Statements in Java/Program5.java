import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch='y';
        while(ch=='y' || ch=='Y'){
            System.out.println("Menu based app - Unit conversion for Distance");
            System.out.println("1.CM to M\n"+"2.M to KM\n"+"3.KM to M\n"+"4.M to CM");
            System.out.print("Enter your menu- ");
            int n=sc.nextInt();
            switch(n){
                case 1:
                {
                    System.out.print("Please enter the CM Value:");
                    float cm=sc.nextFloat();
                    float m=cm/100;
                    System.out.println(cm+"CM = "+m+"M" );
                    break;
                }
                case 2:
                {
                    System.out.print("Please enter the M Value:");
                    float m=sc.nextFloat();
                    float km=m/1000;
                    System.out.println(m+"M = "+km+"KM" );
                    break;
                }
                case 3:
                {
                    System.out.print("Please enter the KM Value:");
                    float km=sc.nextFloat();
                    float m=km*1000;
                    System.out.println(km+"KM = "+m+"M" );
                    break;
                }
                case 4:
                {
                    System.out.print("Please enter the M Value:");
                    float m=sc.nextFloat();
                    float cm=m*100;
                    System.out.println(m+"M = "+cm+"CM" );
                    break;
                }
                default:
                System.out.println("Invalid Case");
            }
            System.out.print("Do you want to continue:");
            ch=sc.next().charAt(0);
        }
    }
}
