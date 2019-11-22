
public class Matrix4 {
public static void main(String[] args) {
	Matrix mt=new Matrix();
	System.out.println("Read matrix");
	int a[][]=mt.readMatrix();
	
	int c=mt.sumEleMat(a);
	System.out.println("Sum of element is "+c);
}
}
