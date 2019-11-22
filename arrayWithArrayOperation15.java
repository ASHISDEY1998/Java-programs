import java.util.*;
public class arrayWithArrayOperation15 {
public static void main(String[] args) {
	ArrayOperation ao=new ArrayOperation();
	int a[]=ao.readArr();
	System.out.println("Entered Array Element are: ");
	ao.writeArr(a);
	
	int s=ao.SumElement(a);
	System.out.println("Sum Of element is "+s);
}
}
