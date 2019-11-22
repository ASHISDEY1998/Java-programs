import java.util.*;
public class arrayWithArrayOperation14 {
public static void main(String[] args) {
	ArrayOperation ao=new ArrayOperation();
	int a[]=ao.readArr();
	System.out.println("Entered Array Element are: ");
	ao.writeArr(a);
	
	int c=ao.CountStrong(a);
	System.out.println("Number of Strong number are "+c);
}
}
