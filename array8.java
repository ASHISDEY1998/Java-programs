import java.util.*;
public class array8 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter how many number you want to check");
	int n=sc.nextInt();
	int ecount=0;
	int ocount=0;
	System.out.println("Enter "+n+" numbers");
	double ar[]=new double[n];
	for(int i=0;i< ar.length;i++)
	{
		ar[i]=sc.nextDouble();
	}
	for(int i=0;i< ar.length;i++)
	{
		if(ar[i]%2==0)
			ecount++;
		else
			ocount++;
	}
	System.out.println("Number of even number "+ecount);
	System.out.println("Number of odd number "+ocount);
	
}
}
