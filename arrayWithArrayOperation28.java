import java.util.*;
public class arrayWithArrayOperation28 {
	public static void main(String[] args) {
	ArrayOperation ao=new ArrayOperation();
	int a[]=ao.readArr();
	System.out.println("Entered array Element: ");
	ao.writeArr(a);
	
	int fsmall=a[0],ssmall=a[1];
	
	for (int i = 0; i < a.length; i++) {
		if(a[i]<fsmall)
		{
			ssmall=fsmall;
			fsmall=a[i];
		}
		else if(a[i]<ssmall)
			ssmall=a[i];
	}
	System.out.println("First smallest number is "+fsmall);
	System.out.println("Second smallest number is "+ssmall);
}
}
