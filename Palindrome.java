import java.io.*;
import java.util.Scanner;
public class Palindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string");
        String str=sc.nextLine();
        String reverse=sc.nextLine();
        for(int i=0;i<str.length();i++){
            reverse=reverse+str.charAt(i);
            if(str.equals(reverse)){
                System.out.println("Entered string is a panlindrome");
            }
            else
            System.out.println("Entered string is not a palindrome");
        }
        
    }
}