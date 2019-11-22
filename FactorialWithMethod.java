import java.util.*;
public class FactorialWithMethod {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int a=sc.nextInt();
	int b=factorial(a);
	System.out.println(" Factorial of the number "+a+" is "+b);
}

private static int factorial(int a) {
	int fact=1;
	for(int i=1;i<=a;i++)
	{
		fact=fact*i;
	}
	return fact;
}

}
