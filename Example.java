public class Example{
    public static void main(String args[]){
        int num1=10,num2=5,num3=7;
        if (num1>=num2 && num1>=num3)
        {
            System.out.println(num1+" is maximum");
        }
        else if (num2>=num1 && num2>=num3){
            System.out.println(num2 +"is maximum");
        }
        else{
            System.out.println(num3 +"is maximum");
        }
    }
}