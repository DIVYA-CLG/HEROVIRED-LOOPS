import java.util.Scanner;

class Program2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Marks Obtained by a Student:");
        int your=sc.nextInt();
        System.out.println("Total Marks:");
        int total=sc.nextInt();
        char grade;
        double gpa;
        float per=((float)your/total)*100;
        if(per<=59){
            grade='F';
            gpa=0.0;
        }
        else if(per>59 && per<=69){
            grade='D';
            gpa=1.0;
        }
        else if(per>69 && per<=79){
            grade='C';
            gpa=2.0;
        }
        else if(per>79 && per<=89){
            grade='B';
            gpa=3.0;
        }
        else{
            grade='A';
            gpa=4.0;
        }
       System.out.println("Percentage: "+String.format("%.2f",per)+"%");
       System.out.println("Grade "+grade+" GPA="+gpa);

    }
}