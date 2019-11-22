
public class Matrix14 {
public static void main(String[] args) {
	Matrix mt=new Matrix();
	System.out.println("Read matrix");
	int a[][]=mt.readMatrix();
	System.out.println("Entered Matrix is : ");
	mt.dispMat(a);
	
	int c[]=mt.rowWiseSmallest(a);
	
	for (int i = 0; i < c.length; i++) {
		System.out.println(i+1+" th row smallest element is "+c[i]);
	}
}
}
