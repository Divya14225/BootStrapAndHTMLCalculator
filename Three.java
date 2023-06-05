public class Three{
void sum three(){
int v1=10,v2=20,v3=30;
int sum=v1+v2+v3;
System.out.println("Sum of three values:"+sum);
}
}
public class five extends three{
void sum five{
int v1=10,v2=20,v3=30,v4=40,v5=50;
int sum=v1+v2+v3+v4+v5;
System.out.println("Sum of the five values");
}
}
public class inheritance test{
public static void main(String args[]){
five d=new five();
d.sum_three();
d.sum_five();
}
}

