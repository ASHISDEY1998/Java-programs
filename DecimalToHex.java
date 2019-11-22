import java.util.*;
public class DecimalToHex {
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
				switch(r)
				{
				case 10:hex='a'+hex;
				break;
				case 11:hex='b'+hex;
				break;
				case 12:hex='c'+hex;
				break;
				case 13:hex='d'+hex;
				break;
				case 14:hex='e'+hex;
				break;
				case 15:hex='f'+hex;
				break;
				}
			}
				
			dec=dec/16;
		}while(dec!=0);
		return hex;
		
	}
}
