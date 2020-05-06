import java.util.Scanner;
class Main{
  public static int sod(int y)
  {
    int sum=0;
    for(int i=0;i<=y;i++)
      sum+=i;
    return sum;
  }
	public static void main (String[] args){
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      int sum=sod(n);
      System.out.print(sum);
	}
}