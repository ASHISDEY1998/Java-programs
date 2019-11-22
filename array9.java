import java.util.*;
public class array9 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter how many number you want to check");
	int n=sc.nextInt();
	int countprime=0;
	int ar[]=new int[n];
	System.out.println("Enter "+n+" numbers");
	
	for(int i=0;i< ar.length;i++)
	{
		ar[i]=sc.nextInt();
	}
	for(int i=0;i< ar.length;i++)
	{
		boolean rs=isprime(ar[i]);
		if(rs==true)	
		countprime++;
	}
	System.out.println("Number of even number "+countprime);
}
static boolean isprime(double d) {
	int i=2;
	while(i<=d/2)
	{
		if(d%i==0)
			return false;
		i++;
	}
	return true;
}
}
