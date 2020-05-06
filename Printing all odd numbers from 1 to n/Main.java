import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      for(int count=0;count<=n;count++)
      {
       if(count%2==1)
          System.out.println(count);
      }
	
	}
}