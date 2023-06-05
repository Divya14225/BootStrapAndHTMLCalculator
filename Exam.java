public class Exam{
    public static void sum(int a,int b){
        System.out.println(a+"+"+b+"=");
        System.out.println(a+b);
    } 
    public static void sum(int a,int b,int c){
        System.out.println(a+"+"+b+"+"+c+"=");
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        int a=1,b=20,c=30;
        sum(a,b);
        sum(a,b,c);
        sum(a,c);
    }
}