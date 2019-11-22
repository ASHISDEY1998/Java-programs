
public class Matrix1 {
public static void main(String[] args) {
	Matrix mt=new Matrix();
	System.out.println("Read 1st matrix");
	int a[][]=mt.readMatrix();
	System.out.println("Read 2nd matrix");
	int b[][]=mt.readMatrix();
	System.out.println("1st matrix : ");
	mt.dispMat(a);
	System.out.println("2st matrix : ");
	mt.dispMat(b);
	
	int c[][]=mt.addMat(a, b);
	if(c==null)
		System.out.println("Addition faild !!");
	else
	{
		System.out.println("Added matrix is :");
		mt.dispMat(c);
	}
}
}
