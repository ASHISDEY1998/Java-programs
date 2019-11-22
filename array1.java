
public class array1 {
public static void main(String[] args) {
	int sum=0,ar[];
	ar= new int[5];
	
	ar[0]=12;
	ar[1]=15;
	ar[2]=56;
	ar[3]=52;
	ar[4]=57;
	for(int i=0;i< ar.length;i++)
	{
		sum=sum+ar[i];
	}
	System.out.println(sum);
}
}
