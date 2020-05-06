import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
    int max=0,index=0;
    if(arr[0]>arr[1])
      max=arr[0];
    else
      max=arr[1];
    for(int i=2;i<n;i++)
    {
      if(arr[i]>max)
      {    max=arr[i];
    index=i;
    }
  }System.out.print(index);
  }
}