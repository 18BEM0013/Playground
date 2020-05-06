import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int n1= sc.nextInt();
      int n2=n1;
      int n=n1;
      int counter=0;
      while(n>0)
      {
        n=n/10;
        counter++;
      }
      int p=counter;

    int sum=0;
      
      while(n2>0)
      {
        int digit=n2%10;
        sum+= Math.pow(digit,p);
        n2=n2/10;
      }
      if(n1==sum)
      System.out.print("Armstrong Number");
      
      else
        System.out.print("Not a Armstrong Number");
      
    }
}