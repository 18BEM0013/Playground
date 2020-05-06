import java.util.Scanner;
public class Main{
  public static int gcd(int n, int m)
  {
    int p=0;
    if(n>m)
    {
      for(int i=m;i>=1;i--)
      {
        if(n%i==0 && m%i==0)
        {
        p=i;
          break;
        }
      }
    }
    else
    {
      for(int i=n;i>=1;i--)
      {
        if(n%i==0 && m%i==0)
        {
           p=i;
          break;
        }
      }
    }
    return p;
  }
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      int o=sc.nextInt();
      int p= gcd(n,m);
      int q=gcd(o,p);
      System.out.print(q);
    }
}