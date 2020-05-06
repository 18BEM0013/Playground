import java.util.Scanner;
class Main {
	public static void main (String[] args){
	 Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int temp;
      int sum=0;
       
      while(n>0)
        {
          temp=n%10;
          n=n/10;
          sum=sum+temp;
          
        }
      System.out.print(sum);
      
        
          
	}
}