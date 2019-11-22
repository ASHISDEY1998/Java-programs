import java.util.*;
public class DigitInNumberWithMethod {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int a=sc.nextInt();
	int b=findNumberOfDigits(a);
	System.out.println("Number of digits in "+a+" Is "+b);
	System.out.println("Number of digits in "+a+" Is "+findNumberOfDigits(a));
}
static int findNumberOfDigits(int a)
{
	int count=0;
	do
	{
		a=a/10;
		count++;
	}while(a!=0);
	return count;
}
}
