import java.util.*;
public class arrayWithArrayOperation34 {
public static void main(String[] args) {
	ArrayOperation ao=new ArrayOperation();
	int a[]=ao.readArr();
	System.out.println("Entered array Element: ");
	ao.writeArr(a);
	Scanner sc=new Scanner(System.in);
	System.out.println("Pass The sum you want to find");
	int b=sc.nextInt();
	
      ao.sumOfPairs(a,b);
}
}
