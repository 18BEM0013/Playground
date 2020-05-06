import java.util.*;
class Main
{
  public static int ncomp(int n, int m)
  {
    if(n>m)
      return n;
    else
      return m;
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int o=sc.nextInt();
    int p=ncomp(n,m);
    int q=ncomp(p,o);
    System.out.print(q);
  }
}