import java.util.*;
public class CountHowmanayFactorsForN {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int i=1;
		int count=1;
		
		while(i<=n/2)
		{
			if(n%i==0)
				count++;
			i++;
		}
		
		System.out.println("Number of Deviser for "+n+" is "+count);
	}
}
