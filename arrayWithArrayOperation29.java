
public class arrayWithArrayOperation29 {
	public static void main(String[] args) {
		ArrayOperation ao=new ArrayOperation();
		int a[]=ao.readArr();
		System.out.println("Entered array Element: ");
		ao.writeArr(a);
		
	 a=ao.insertElement(a,39,2);
	 ao.writeArr(a);
}
}
