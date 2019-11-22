public class CountStrongNumberWithin10000 {
	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=10000;i++)
		{	
		boolean b=isStrong(i);
		if(b==true)
			count++;
		}
		System.out.println(count);
	}
	static boolean isStrong(int x)
	{
		int t=x;
		int sum=0;
		do {
			int r=x%10;
			sum=sum+fact(r);
			x=x/10;
		}while(x!=0);
		
		if(t==sum)
			return true;
		else 
			return false;
		
	}
	static int fact(int y)
	{
		int fact=1;
		for(int i=1;i<=y;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	}


