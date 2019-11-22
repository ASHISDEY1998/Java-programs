import java.util.*;
public class array10 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of numbers you want to add");
	int n=sc.nextInt();
	System.out.println("Enter "+n+" number ");
	int ar[]=new int[n];
	for(int i=0;i< ar.length;i++)
	{
		ar[i]=sc.nextInt();
	}
	int s=sumOfArray(ar);
	System.out.println("Sum is "+s);
}

private static int sumOfArray(int [] x) {
	int sum=0;
	for(int i=0;i< x.length;i++)
		sum=sum+x[i];
	return sum;
}
}
