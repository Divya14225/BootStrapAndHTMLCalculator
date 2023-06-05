class Example1{
    public static int getMax(int []a){
        int max=a[0];
        for(int num:a){
            if(num>max)
              max=num;
        }
        return max;
    }
    public static void main(String args[]){
        int a[]={1,2,3,4};
        int max=getMax(a);
        System.out.println("max is"+max);
    }
}