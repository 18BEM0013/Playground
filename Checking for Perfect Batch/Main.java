import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int sum1=0,sum2=0,sum3=0;
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
    for(int i=0;i<3;i++)
      sum1+=arr[i];
    for(int i=3;i<6;i++)
       sum2+=arr[i];
    if(n>6)
    {for(int i=6;i<9;i++)
    sum3+=arr[i];
    }
    if(sum1==sum2 || sum2==sum3)
      System.out.print("Perfect Batch");
    else
      System.out.print("Not a Perfect Batch");
    
  }
}