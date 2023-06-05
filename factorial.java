import java.util.Scanner;
public class factorial{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter any number");
    int num=sc.nextInt();
    int factorial=fact(num);
    System.out.println("factorial of any number is"+factorial);
    }
    static int fact(int n)
    {
        int output;
        if(n==1)
        {
         return 1;
        }
        output=fact(n-1)*n;
        return output;
    }
}
