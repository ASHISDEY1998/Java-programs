import java.util.*;
public class ArmstrongBetween1000 {
	public static void main(String[] args) {
		int count =0;
		for(int i=1;i<=1000;i++)
		{
			boolean m=isArmStrong(i);
			if(m==true)
				count++;
		}
		System.out.println(count);
}
	static boolean isArmStrong(int a) {
		 int t=a;
		 int x=countDigits(t);
		 int sum=0;
		 do {
			 int r=t%10;
			 sum=sum+pow(r,x);
			 t=t/10;
			 
		 }while(t!=0);
		 if(a==sum)
			 return true;
		 else 
		return false;
	}
	 
	 
	 static int pow(int r, int x) {
		 int pow=1;
	for(int i=1;i<=x;i++)
	{
		pow=pow*r;
	}
		 return pow;
	}
	 

	static int countDigits(int a) {
	int count =0;
	 	do {
	 		a=a/10;
	 		count++;
	 	}while(a!=0);
		return count;
	}
}
