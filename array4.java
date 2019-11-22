import java.util.*;
public class array4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of integer uou want to enter");
	int n=sc.nextInt();
	System.out.println("Enter "+n+" number");
	int ar[]=new int[n];
	for(int i=0;i< ar.length;i++)
	{
		ar[i]=sc.nextInt();
	}
	for(int i = 1; i < ar.length; ++i)
    {
       
       if(ar[0] < ar[i])
           ar[0] = ar[i];
    }
	System.out.println("Greatest number is "+ar[0]);
}
}
