import java.util.Scanner;
public class Equation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any three numbers:");
        double a=sc.nextFloat();
        double b=sc.nextFloat();
        double c=sc.nextFloat();
        double det=b*b-4ac;
        if (det>0):
        System.out.println("root1,root2 are real");
        else if(det==0):
        System.out.println("root1,root2 are real and equal");
        else:
        System.out.println("roo1 is real,root2 is imaginary");
    }
}