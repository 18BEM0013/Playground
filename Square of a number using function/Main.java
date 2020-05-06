import java.util.Scanner;
class Main
{
  public static int sqre(int n)
  {
    int prod=n*n;
    return prod;
  }
	public static void main (String[] args)
    {
	Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
       int sq= sqre(n);
      System.out.print(sq);
	} 
}