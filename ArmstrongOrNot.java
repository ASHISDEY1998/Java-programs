import java.util.*;
public class ArmstrongOrNot {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Number");
	int n=sc.nextInt();
	int z=n;
	int no=0;
	
	do {
		int i=n%10;
		no=no+i*i*i;
		n=n/10;
		}while(n!=0);
	
	if(z==no)
		System.out.println(z+" Is a Armstrong Number");
	else
		System.out.println(z+" is not a Arstrong Number");
}
}
