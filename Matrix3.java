
public class Matrix3 {
public static void main(String[] args) {
	Matrix mt=new Matrix();
	System.out.println("Read matrix");
	int a[][]=mt.readMatrix();
	
	int c[]=mt.countEO(a);
	System.out.println("Number of even element "+c[0]);
	System.out.println("Number of odd element "+c[1]);
}
}
