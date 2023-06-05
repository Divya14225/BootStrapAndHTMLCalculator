import java.util.*;
public class bubblesort {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={10,34,28,22};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp; 
                }
            }
        }
        printArray(arr);
    }
}
