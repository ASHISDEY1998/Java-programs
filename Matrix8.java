
public class Matrix8 {
public static void main(String[] args) {
	Matrix mt=new Matrix();
	System.out.println("Read matrix");
	int a[][]=mt.readMatrix();
	System.out.println("Entered Matrix is : ");
	mt.dispMat(a);
	
	int c[][]=mt.reverseColomnMat(a);
	System.out.println("Reversed colomn matrix is : ");
	mt.dispMat(c);
}
}
