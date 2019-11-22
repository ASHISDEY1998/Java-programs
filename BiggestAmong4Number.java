import java.util.*;

public class BiggestAmong4Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Four number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		
		if(a>b&&a>c&&a>d)
			System.out.println(a+" Is greatest");
		else if(b>c&&b>d)
			System.out.println(b+" Is greatest");
		else if(c>d)
			System.out.println(c+" Is greatest");
		else
			System.out.println(d+" Is greatest");
		
	}
}
