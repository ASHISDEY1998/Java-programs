
public class Matrix5 {
public static void main(String[] args) {
	Matrix mt=new Matrix();
	System.out.println("Read matrix");
	int a[][]=mt.readMatrix();
	
	int c=mt.countPrime(a);
	System.out.println("Number of prime number is "+c);
}
}
