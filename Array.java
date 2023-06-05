import java.util.Scanner;
public class Array{
    public static void main(String args[]){
        int arr[]=new int[5];
        int i;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<5;i++){
        System.out.println("Enter any number");
        arr[i]=sc.nextInt();
        }
        System.out.println("The students marks are:");
        for(i=0;i<5;i++){
            System.out.println(arr[i]);
        }
        
    }
}