import java.util.*;
public class array7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of fruit items");
	int n=sc.nextInt();
	double sum=0;
	
	System.out.println("Enter "+n+" number of fruit price");
	double ar[]=new double[n];
	for(int i=0;i< ar.length;i++)
	{
		ar[i]=sc.nextDouble();
	}
	for(int i=0;i< ar.length;i++)
	{
		sum=sum+ar[i];
	}
	System.out.println("Total bill "+sum);
}
}
