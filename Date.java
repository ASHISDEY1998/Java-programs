
public class Date {
int dd;
int mm;
int yy;
int month[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};

public Date(int dd,int mm,int yy)
{
	this.dd=dd;
	this.mm=mm;
	this.yy=yy;
	if(yy%400==0||yy%4==0&&100!=0)
	{
		month[2]=29;
	}
}
public int noOfDays()
{
	int y=yy-1;
	int day=y*365;
	day=day+y/400+y/4-y/100;
	for (int i = 1; i < mm; i++) 
	
	{
		day=day+month[i];
	}
	day=day+dd;
	return day;
}
public String getDayName() 
{
	String days[]= {"Sunday","monday","Tuesday","Thursday","Friday","Saturday"};
	int d=noOfDays();
	return days[d%7];
	
}
}
