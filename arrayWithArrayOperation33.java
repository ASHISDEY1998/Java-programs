
public class arrayWithArrayOperation33 {
	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		int a[]=ao.readArr();
		System.out.println("Entered array Element: ");
		ao.writeArr(a);
		
	 int b[]=ao.swapPairs(a);
	 ao.writeArr(b);
	
}
}
