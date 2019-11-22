
public class Matrix16 {
public static void main(String[] args) {
	Matrix mt=new Matrix();
	System.out.println("Read squre matrix");
	int a[][]=mt.readMatrix();
	System.out.println("Entered Matrix is : ");
	mt.dispMat(a);
	
	int c[]=mt.digonalyBiggest(a);
	
	for (int i = 0; i < 2; i++) {
		System.out.println(" Primery digonal biggest element is "+c[i]);
	}
}
}
