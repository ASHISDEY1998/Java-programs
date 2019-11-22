import java.util.Scanner;
public class array11 {
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
	int s=biggestOfArray(ar);
	System.out.println("Biggest is "+s);
}

private static int biggestOfArray(int [] x) {
	
	for(int i=0;i< x.length;i++)
	{
		 if (x[0]  < x[i])
	          x[0] = x[i];
	}
	return x[0];
}
}
