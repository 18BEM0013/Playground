import java.util.*;
class Main
{
  public static int power(int n,int m)
  {
    int prod=1;
    for(int i=1;i<=m;i++)
    prod*=n;
    return prod;
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
  
    int n= sc.nextInt();
    int m=sc.nextInt();
    int p=power(n,m);
    System.out.print(p);
  }
}