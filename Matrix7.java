
public class Matrix7 {
public static void main(String[] args) {
	Matrix mt=new Matrix();
	System.out.println("Read matrix");
	int a[][]=mt.readMatrix();
	System.out.println("Entered Matrix is : ");
	mt.dispMat(a);
	
	int c[][]=mt.reverseRowMat(a);
	System.out.println("Reversed Row matrix is : ");
	mt.dispMat(c);
}
}
