import java.util.*;
public class HowmanyBinaryBitsInNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int a=sc.nextInt();
	int b=countBits(a);
		System.out.println("bits are "+b);
}

 static int countBits(int a) {
	 int count=0;
	 do {
		 int r=a%2;
			 count++;
		 a=a/2;
	 }while(a!=0);
	 return count;

}
}
