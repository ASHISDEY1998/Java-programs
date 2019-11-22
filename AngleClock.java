import java.util.*;

public class AngleClock {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Emter Hower and minute");
		int hr=sc.nextInt();
		int min=sc.nextInt();
		
		double mangle=6*min;
		double hangle=30*hr+min*0.5;
		
		double angle=0.0;
		
		if(mangle>hangle)
		{
			angle=mangle-hangle;
		}
		else
			angle=hangle-mangle;
		
		System.out.println("1st angle is "+angle);
		System.out.println("2nd angle is "+(360-angle));
	}
}
