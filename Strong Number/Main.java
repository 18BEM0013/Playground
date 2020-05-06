import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int fdig=num%10;
    int temp1=num%100;
    int sdig=temp1/10;
    int tdig=num/100;
    int prod1=1, prod2=1, prod3=1;
    for(int i=1;i<=fdig;i++)
      prod1*=i;
    for(int i=1;i<=sdig;i++)
      prod2*=i;
    for(int i=1;i<=tdig;i++)
      prod3*=i;
    int sum=prod1+prod2+prod3;
     
    if(num==sum)
      System.out.print("Yes");
    else
      System.out.print("No");
  }
}
    