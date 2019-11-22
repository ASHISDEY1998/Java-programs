import java.util.*;
public class AreaOfRectangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length and Width of the Squre");
		int a=sc.nextInt();
		int b=sc.nextInt();
		findArea(a,b);
	}
	static void findArea(int x,int y)
	{
		System.out.println("Length of Rectangle is "+x);
		System.out.println("Width of Rectangle is "+x);
		int area=x*y;
		int pmtr=2*(x+y);
		System.out.println("Area of Rectangle is "+area);
		System.out.println("perimeter of Rectangle is "+pmtr);
	}
}
