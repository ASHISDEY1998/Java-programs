import java.util.*;
public class DesariumNumberWithMeth {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int a=sc.nextInt();
	boolean b=isDesarium(a);
	if(b==true)
		System.out.println(a+" is a Desarium number");
	else
		System.out.println(a+" is not a Desarium number");
}

 static boolean isDesarium(int a) {
	 int t=a;
		 int x=countDigits(t);
	 
	 int sum=0;
	 do {
		 int r=t%10;
		 sum=sum+pow(r,x);
		 t=t/10;
		 x--;
		 
	 }while(t!=0);
	 if(a==sum)
		 return true;
	 else 
	return false;
	
}
 
 
 static int pow(int r, int x) {
	 int pow=1;
for(int i=1;i<=x;i++)
{
	pow=pow*r;
}
	 return pow;
}
 
 static int countDigits(int a) {
	 int count =0;
	  	do {
	  		a=a/10;
	  		count++;
	  	}while(a!=0);
	 	return count;
	 }
}
