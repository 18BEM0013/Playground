import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      int count2=0;
      for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
      int e1=sc.nextInt();
      int e2=sc.nextInt();
      for(int i=0;i<n;i++)
      {
        if(e1==arr[i])
          System.out.println(i);
     
       
      }
       for(int i=0;i<n;i++)
      {
        if(e2==arr[i])
        {  System.out.println(i);
         count2++;}
       }
        if(count2==0)
          System.out.println("-1");
    }
}