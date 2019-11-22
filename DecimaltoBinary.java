import java.util.*;
public class DecimaltoBinary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Decimal number");
		int n=sc.nextInt();
		
		String b=decToBin(n);
		
		System.out.println("Binary of "+n+" is " +b);
		
	}
	static String decToBin(int dec)
	{
		String bin="";
		do{
			int r=dec%2;
			bin=r+bin;
			dec=dec/2;
		}while(dec!=0);
		return bin;
		
	}
}
