public class operators{
    public static void main(String[] args) {
        int a=3,b=5,c=7,result;
        result=((a>b)?(a>c)?a:c:(b>c)?b:c);
        System.out.println("maximum of the three numbers is",+result);
    }
}
  