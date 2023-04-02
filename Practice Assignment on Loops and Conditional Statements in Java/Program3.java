import java.util.*;
class Program3 {
public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
 System.out.print("numA= " );
 int numA =sc.nextInt();
 System.out.print("numB= ");
 int numB=sc.nextInt();
int temp;
temp = numA;
numA=numB;
numB=temp;
 
        
        System.out.println("numA=" + numA);
        System.out.println("numB=" + numB);       
       

        

    }
}