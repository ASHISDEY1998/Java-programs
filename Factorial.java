import java.util.*;
public class Factorial {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number");
	int n=sc.nextInt();
	long fact=1;
	
	for(int i=2;i<=n;i++)
	{
		fact=fact*i;
	}
	
	System.out.println("factorial of "+n+" is "+fact);
	}
}
