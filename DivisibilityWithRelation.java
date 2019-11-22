import java.util.*;
public class DivisibilityWithRelation {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter an Integer");
	int i=sc.nextInt();

	if (i%3==0 && i%5==0)
	{
		System.out.println("Sanju weds Gita");
	}
	else if (i%5==0)
	{
		System.out.println("Gita");
	}
	else if (i%3==0)
	{
		System.out.println("Sanju");
	}
	else
	{
		System.out.println("Breakup");
	}
}
}
