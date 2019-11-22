import java.util.*;
public class Bmi {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your hight and Waight ");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		
		calculateBmi(a,b);
	}
static void calculateBmi(double x,double y)
{
	System.out.println("Hight is "+x);
	System.out.println("Weight is "+y);
	
	double bmi=y/(x*x);
	System.out.println("Your Body Mass Index is "+bmi);
}

}
