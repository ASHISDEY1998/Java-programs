
public class Matrix2 {
public static void main(String[] args) {
	Matrix mt=new Matrix();
	System.out.println("Read matrix");
	int a[][]=mt.readMatrix();
	
	int c=mt.bigMat(a);
	System.out.println("Biggest element is "+c);
}
}
