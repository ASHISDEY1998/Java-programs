
public class Matrix9 {
public static void main(String[] args) {
	Matrix mt=new Matrix();
	System.out.println("Read matrix");
	int a[][]=mt.readMatrix();
	System.out.println("Entered Matrix is : ");
	mt.dispMat(a);
	
	int b[][]=mt.rotate90degleftMat(a);
	System.out.println("Roteted 90deg left matrix is : ");
	mt.dispMat(b);
	int c[][]=mt.rotate90degrightMat(a);
	System.out.println("Roteted 90deg right matrix is : ");
	mt.dispMat(c);
}
}
