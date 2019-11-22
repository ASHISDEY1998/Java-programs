import java.util.*;

public class List3Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Three number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a<b&&a<c)
			System.out.println(a+" Is Smallest");
		else if(b<c)
			System.out.println(b+" Is Smallest");
		else
			System.out.println(c+" IS smallest");
	}
}
