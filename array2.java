import java.util.*;
public class array2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter how many values you have.");
	int n=sc.nextInt();
	int ar[]=new int[n];
	System.out.println("Enter "+n+" values");
	for(int i=0;i< ar.length;i++)
	{
		ar[i]=sc.nextInt();
	}
	System.out.println("Array element are entered");
	for(int i=0;i< ar.length;i++)
	{
		System.out.println(i+" index value is "+ar[i]);
	}
}
}
