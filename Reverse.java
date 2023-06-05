import java.io.*;
import java.util.Scanner;
public class Reverse{
    public static void main(String[] args) {
        String str="Divya",nstr="";
        char ch;
        System.out.println("Original word");
        System.out.println("Divya");
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            nstr=ch+nstr;
        }
        System.out.println("Reversed word"+ nstr);
    }
}