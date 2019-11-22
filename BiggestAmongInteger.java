import java.util.Scanner;

public class BiggestAmongInteger {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number");
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		int g=(x>y)?x:y;
		System.out.println(g+"is biggest number");
	}
}
