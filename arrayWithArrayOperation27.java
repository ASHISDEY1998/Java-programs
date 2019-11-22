import java.util.*;
public class arrayWithArrayOperation27 {
public static void main(String[] args) {
	ArrayOperation ao=new ArrayOperation();
	int a[]=ao.readArr();
	System.out.println("Entered array Element: ");
	ao.writeArr(a);
	
	int fbig=a[0],sbig=a[1];
	
	for (int i = 0; i < a.length; i++) {
		if(a[i]>fbig)
		{
			sbig=fbig;
			fbig=a[i];
		}
		else if(a[i]>sbig)
			sbig=a[i];
	}
	System.out.println("First Biggest number is "+fbig);
	System.out.println("Second biggest number is "+sbig);
	
}
}
