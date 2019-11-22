import java.util.Scanner;

public class EvenOddBitwise {
	
		public static void main(String[] args)
		{
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the number");
			int n=sc.nextInt();
			if((n&1)==0)
				System.out.println(n+"Is a even number");
			else
				System.out.println(n+"is a odd number");
		}
	
}
