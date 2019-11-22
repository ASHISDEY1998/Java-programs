import java.util.*;
public class CountOddDigitInNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number");
	int n=sc.nextInt();
	int count=0;
	
	do {
		int i=n%10;
		if(i%2!=0)
		{
			count++;
		}
		n=n/10;
	}while(n!=0);
	
	System.out.println("Number Of odd digits Present in Given Number Is "+count);
}
}
