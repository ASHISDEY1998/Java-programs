import java.util.*;
public class BinaryToDecimalWithMeth {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int a=sc.nextInt();
	int b=binToDec(a);
		System.out.println("Decimal equivalent of "+a+" is "+b);
	
}

 static int binToDec(int a) {
	 int sum=0;
	 int c=0;
	 do {
		 int r=a%10;
		 sum=sum+r*pow(2,c);
		 c++;
		 a=a/10;
	 }while(a!=0);
	 return sum;
}
 static int pow(int r, int x) {
	 int pow=1;
for(int i=1;i<=x;i++)
{
	pow=pow*r;
}
	 return pow;
}
}
