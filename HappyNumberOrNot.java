import java.util.*;
public class HappyNumberOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		boolean rs=isHappy(n);
		if(rs)
			System.out.println(n+" is Happy number");
		else
			System.out.println(n+" is not a Happy number");
	}

	private static boolean isHappy(int x) {
		while(x>9)
		{
			int sum=0;
			do
			{
				int r=x%10;
				sum=sum+(r*r);
				x=x/10;
			}while(x!=0);
			x=sum;
		}
		return x==1||x==7;	
	}
}
