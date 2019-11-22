import java.util.*;
public class DecimalToHexWithAsci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Decimal number");
		int n=sc.nextInt();
		
		String b=decToHex(n);
		
		System.out.println("hexadecimal of "+n+" is " +b);
		
	}
	static String decToHex(int dec)
	{
		String hex="";
		do{
			int r=dec%16;
			if(r<10)
			hex=r+hex;
			else
			{
			hex=(char)(r+55)+hex;//asci value of 10 to 15 plus+55 is A to F
			}
				
			dec=dec/16;
		}while(dec!=0);
		return hex;
		
	}
}
