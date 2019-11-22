import java.util.*;
public class InNumbarSetedBitWithMethod {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int a=sc.nextInt();
	int b=countSetedBits(a);
		System.out.println("Decimal equivalent of "+a+" is "+b);
}

 static int countSetedBits(int a) {
	 int sum=0,count=0;
	 do {
		 int r=a%2;
		 if(r==1)
			 count++;
		 a=a/2;
		 
		 
	 }while(a!=0);
	 return count;
}
}
