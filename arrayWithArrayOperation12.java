import java.util.*;
public class arrayWithArrayOperation12 {
public static void main(String[] args) {
	ArrayOperation ao=new ArrayOperation();
	int a[]=ao.readArr();
	System.out.println("Entered array Element: ");
	ao.writeArr(a);
	
	int c= ao.countPalindrome(a);
	System.out.println("number of plaindrom: "+c);
}
}
