public class series
{
static double sum(int x,int n)
{
double i,total=1.0,multi=x;
System.out.println("1");
for(i=1;i<n;i++)
{
total=total+multi;
System.out.println(multi);
System.out.print("");
multi=multi*x;
}
System.out.println();
return total;
}
public static void main(String args[])
{
int x=3; 
int n=5;
System.out.printf("%.2f",sum(x,n));
}
}