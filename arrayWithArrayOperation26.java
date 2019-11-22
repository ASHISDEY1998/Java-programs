import java.util.*;
public class arrayWithArrayOperation26 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int no=sc.nextInt();
	nw(no/10000000,"Crore");
	nw(no/100000%100,"Lakh");
	nw(no/1000%100,"Thousnd");
	nw(no/100%10,"Hundred");
	nw(no%100,"");
}

private static void nw(int n, String st) {
	String one[]= {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Forteen","Fifteen","Sixteen","Seventeen","Eighteen","Ninteen"};
	String two[]= {"","","Twenty","Thrty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty"};
	
	if(n<20)
		System.out.print(one[n]);
	else
		System.out.print(two[n/10]+one[n%10]);
	
	if(n!=0)
		System.out.print(st+" ");
}
}
