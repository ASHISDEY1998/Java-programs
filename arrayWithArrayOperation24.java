import java.util.*;
public class arrayWithArrayOperation24 {
	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		int a[]=ao.readArr();
		System.out.println("Entered Array Element are: ");
		ao.writeArr(a);
		
		int c[]=ao.sumEO(a);
		System.out.println("sum of even number is "+c[0]);
		System.out.println("sum of odd number is "+c[1]);
	}
}
