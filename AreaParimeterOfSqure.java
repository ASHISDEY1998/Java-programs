import java.util.*;
public class AreaParimeterOfSqure {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of the Squre");
	int a=sc.nextInt();
	findArea(a);
}

static void findArea(int x)
{
	System.out.println("Length And Width of Squre is"+x);
	int area=x*x;
	int pmtr=4*x;
	System.out.println("Area of Squre is "+area);
	System.out.println("perimeter of Squre is "+pmtr);
}
}
