
public class FibonacyWithin100 {
	public static void main(String[] args) {
		
		int c=findFibonacy(100);
		
		System.out.println(c);
}
	private static int findFibonacy(int n) {
		int f1=0,f2=1,f3;
		int count =0;
	
		while(f1<=n)
		{
			f3=f1+f2;
			f1=f2;
			f2=f3;
			count++;
		}
		return count;
	}
}
