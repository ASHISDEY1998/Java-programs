
public class Matrix11 {
public static void main(String[] args) {
	Matrix mt=new Matrix();
	System.out.println("Read matrix");
	int a[][]=mt.readMatrix();
	System.out.println("Entered Matrix is : ");
	mt.dispMat(a);
	
	int c[]=mt.colomnWiseBiggest(a);
	
	for (int i = 0; i < c.length; i++) {
		System.out.println(i+1+" th colomn biggest element is "+c[i]);
	}
}
}
