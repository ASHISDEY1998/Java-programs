import java.util.*;
public class arrayWithArrayOperation17
{
	public static void main(String[] args)
	{
	ArrayOperation ao=new ArrayOperation();
	System.out.println("Enter  1st  Array Element are: ");
	int a[]=ao.readArr();
	System.out.println("Enter  2nd  Array Element are: ");
	int b[]=ao.readArr();
	System.out.print("Entered Array Element are: ");
	ao.writeArr(a);
	System.out.print("Entered Array Element are: ");
	ao.writeArr(b);
	
	int co[]=ao.combineArray(a,b);
	System.out.print("Combine array element are");
	ao.writeArr(co);
	
	}
}
