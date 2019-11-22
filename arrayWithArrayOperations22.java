import java.util.*;
public class arrayWithArrayOperations22 {
	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		System.out.println("Enter  1st  Array Element are: ");
		int a[]=ao.readArr();
		System.out.println("Enter  2nd  Array Element are: ");
		int b[]=ao.readArr();
		System.out.print("Entered Array Element are: ");
		ao.writeArr(a);
		System.out.print("Entered Array Element are: ");
		ao.writeArr(b);
		
		boolean tf=ao.isDuplicate(a,b);
		if(tf==true)
			System.out.println("Both are same array");
		else
			System.out.println("Both are different array");
		
	}
}
