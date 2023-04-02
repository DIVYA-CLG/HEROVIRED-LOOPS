import java.util.Scanner;
public class Program4 {
    public static void main(String[] args) {
        System.out.println("Menu based app - Even/Odd Checker");
        Scanner sc=new Scanner(System.in);
        char string='y';
        while(string=='y' || string=='Y'){
        System.out.print("Please enter the number:");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("The given number- "+n+" is a EVEN Number");
        }
        else{
            System.out.println("The given number- "+n+" is an ODD Number");
        }
        System.out.println("Do you want to continue");
        string=sc.next().charAt(0);
    }
    }
}
