import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    for(int i=1;i<=n;i++)
    {
      for(int c=1;c<=i;c++)
        System.out.print(i);
      System.out.print("\n");
    }
  }
}