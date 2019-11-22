import java.util.*;
public class array3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of people");
	int n=sc.nextInt();
	System.out.println("Enter the capacity of elivator");
	int m=sc.nextInt();
	double sum=0;
	double ar[]=new double[n];
	System.out.println("Enter the weight of "+n+" persons ");
	
	for(int i=0;i< ar.length;i++)
	{
		ar[i]=sc.nextDouble();
	}
	
	for(int i=0;i< ar.length;i++)
	{
		sum=sum+ar[i];
	}
	if(sum<=m)
		System.out.println("Elivator allowed to work");
	else
		System.out.println("Elivator not allowed to work");
}
}
