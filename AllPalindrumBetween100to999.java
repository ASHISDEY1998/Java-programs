import java.util.*;
public class AllPalindrumBetween100to999 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		
		for(int i=100;i<=999;i++)
		{
			boolean m=isPalindrum(i);
			if(m==true)
				System.out.println(i);
		}
}
	private static boolean isPalindrum(int a) {
		int rev=0;
		int y=a;
		do {
			int x=a%10;
			rev=rev*10+x;
			a=a/10;
		}while(a!=0);
		if(y==rev)
			return true;
		else
		return false;
	}
}
