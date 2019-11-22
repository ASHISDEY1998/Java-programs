
public class arrayWithArrayOperation35 {
	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		int a[]=ao.readArr();
		System.out.println("Entered array Element: ");
		ao.writeArr(a);
		
	 int b=ao.highSumOfPairs(a);
	 System.out.println("Sum of biggest pair"+b);
}
}