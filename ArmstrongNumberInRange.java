import java.util.*;
public class ArmstrongNumberInRange {
public static void main(String[] args) {
	for(int n=100;n<=999;n++)
	{
		int z=n;
		int sum=0;
		do
		{
			int i=z%10;
			sum=sum+i*i*i;
			z=z/10;
		}while(z!=0);
		
		if(n==sum)
			System.out.println(n);
	}
}
}
