import java.util.Scanner;
public class Calculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any two numbers");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        char operator=sc.next().charAt(0);
        System.out.print("Enter any operator ('+','-','*','/')");;
        double result;
        switch (operator) {
            case '+':
                result=a+b;
                break;
            case '-':
                result=a-b;
                break;
            case '*':
                result=a*b;
                break;
            case '/':
                result=a/b;
                break;        
            default:
            System.out.printf("Error! operator is not correct");
            return;
        }
            System.out.printf("%.1f %c %.1f=%.1f",a,operator,b,result);
    }
}