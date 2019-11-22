
public class Matrix6 {
public static void main(String[] args) {
	Matrix mt=new Matrix();
	System.out.println("Read matrix");
	int a[][]=mt.readMatrix();
	System.out.println("Entered Matrix is : ");
	mt.dispMat(a);
	
	int c[][]=mt.transposeMat(a);
	System.out.println("Transposed matrix is : ");
	mt.dispMat(c);
}
}
