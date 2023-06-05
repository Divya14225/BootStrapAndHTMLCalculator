import java.util.Scanner;
public class String{
    public static void main(String[] args) {
        String states[]=new String[5];
        int i;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<5;i++){
        System.out.println("Enter the states:");
        states[i]=sc.nextLine();
        }
        System.out.println("State name:");
        for(i=0;i<5;i++){
            System.out.println(states[i]);
            }
    }
}