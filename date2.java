import java.util.*;
public class date2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the date (dd mm yy)");
	int dd=sc.nextInt();
	int mm=sc.nextInt();
	int yy=sc.nextInt();
	Date d1=new Date(dd,mm,yy);
	
	
	System.out.println(d1.getDayName());
}
}


