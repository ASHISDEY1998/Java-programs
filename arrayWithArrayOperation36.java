import java.util.*;
public class arrayWithArrayOperation36 {
	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		int a[]=ao.readArr();
		System.out.println("Entered array Element: ");
		ao.writeArr(a);
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter the number Want to find");
		int x=sc.nextInt();
		
		int t=ao.searchArray(a,x);
		System.out.println("Index of "+x+" is "+t);
}
}
