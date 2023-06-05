import java.util.Scanner;
public class Prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=sc.nextInt();
        int count=0,i;
        for(i=2;i<num;i++){
            if(num%i==0){
                count++;
                
            }
        }
        if(count==0){
            System.out.println("Entered number is a prime");
        }
        else{
            System.out.println("Entered number is composite");
        }
    }
}