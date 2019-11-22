import java.util.*;
public class BiggestAmong3Number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any three number");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		
		int a=(x>y && x>z)?x:(y>z)?y:z;
		System.out.println(a+"Is greatest number");
	}
}
