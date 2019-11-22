import java.util.*;
public class DecimalToOctal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Decimal number");
		int n=sc.nextInt();
		
		String b=decToBin(n);
		
		System.out.println("octal of "+n+" is " +b);
		
	}
	static String decToBin(int dec)
	{
		String oct="";
		do{
			int r=dec%8;
			oct=r+oct;
			dec=dec/8;
		}while(dec!=0);
		return oct;
		
	}
}
