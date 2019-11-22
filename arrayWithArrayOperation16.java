import java.util.*;
public class arrayWithArrayOperation16 {
public static void main(String[] args) {
	ArrayOperation ao=new ArrayOperation();
	int a[]=ao.readArr();
	System.out.println("Entered Array Element are: ");
	ao.writeArr(a);
	
	int c[]=ao.countEO(a);
	System.out.println("number of even number is "+c[0]);
	System.out.println("number of odd number is "+c[1]);
}
}
