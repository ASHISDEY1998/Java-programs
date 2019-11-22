import java.util.*;
public class arrayWithArrayOperation13 {
public static void main(String[] args) {
	ArrayOperation ao=new ArrayOperation();
	int a[]=ao.readArr();
	System.out.println("Entered array Element: ");
	ao.writeArr(a);
	
	int s=ao.SumofPrime(a);
	System.out.println("Sum of fiven prime number is "+s);
}
}
