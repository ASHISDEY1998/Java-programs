
public class date1 {
public static void main(String[] args) {
	Date d1= new Date(18,5,1945);
	Date d2= new Date(18,8,1968);
	
	int days=d2.noOfDays()-d1.noOfDays();
	System.out.println(days);
}
}
