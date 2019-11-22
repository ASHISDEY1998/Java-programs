import java.util.*;
public class array6 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of person's age you wnt to enter");
	int n=sc.nextInt();
	double sum=0;
	double avg=0;
	System.out.println("Enter "+n+" persons Age");
	double ar[]=new double[n];
	for(int i=0;i< ar.length;i++)
	{
		ar[i]=sc.nextDouble();
	}
	for(int i=0;i< ar.length;i++)
	{
		sum=sum+ar[i];
		avg=sum/n;
		
	}
	System.out.println("Avg of "+n+" Students age is "+avg);
}
}
