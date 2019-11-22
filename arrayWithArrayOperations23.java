import java.util.*;
public class arrayWithArrayOperations23
{
	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		int a[]=ao.readArr();
		System.out.println("Entered Array Element are: ");
		ao.writeArr(a);
		
		int c[]=ao.countPosetiveNegative(a);
		System.out.println("number of +ve number is "+c[0]);
		System.out.println("number of -ve number is "+c[1]);
	}
}
