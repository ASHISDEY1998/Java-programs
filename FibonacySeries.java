import java.util.*;
public class FibonacySeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range of fibonacy number");
		int n=sc.nextInt();
		
		findFibonacy(n);
	}

	private static int findFibonacy(int n) {
		int f1=0,f2=1;
		while (n>0)
		{
			System.out.println(f1);
			int f3=f1+f2;
			f1=f2;
			f2=f3;
			n--;
		}
		return 0;
	}
	
}
