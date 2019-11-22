import java.util.*;
public class arrayWithArrayOperation25 {
	public static void main(String[] args) {
	ArrayOperation ao=new ArrayOperation();
	int a[]=ao.readArr();
	System.out.println("Entered Array Element are: ");
	ao.writeArr(a);
	
	int c=ao.CountSpecial(a);
	System.out.println("Number of special 2 digit number are "+c);
}
}