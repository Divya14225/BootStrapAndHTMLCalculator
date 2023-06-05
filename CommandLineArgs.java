public class CommandLineArgs{
   public static void main(String args[]){
      System.out.println("First argument is:"+args[0]);
      System.out.println("Second argument is:"+args[1]);
      if(args[0].equals(args[1]))
      {
           System.out.println("Both arguments are same");
      }
      else{
        System.out.println("Both arguments are different");
      }
    }
}
