import java.util.*;
public class array5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of person");
	int n=sc.nextInt();
	System.out.println("Enter "+n+" persons Weight");
	int ar[]=new int[n];

	for(int i=0;i< ar.length;i++)
	{
		ar[i]=sc.nextInt();
	}
	for(int i = 1; i < ar.length; ++i)
    {
       
		 if (ar[0] > ar[i])
	          ar[0] = ar[i];
    }
	System.out.println("lest Weight is "+ar[0]);
}
}
