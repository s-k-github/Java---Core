package day4;

public class Day4_1_Date
{
	public static void main(String[] args) 
	{
		Date date = new Date(23,7,1997);
		date.display();
		
		Date date2 = new Date(1,1,1997);
		System.out.print("Get Methods : "+date2.getDay()+"/");
		System.out.print(date2.getMonth()+"/");
		System.out.print(date2.getYear());
		
		date2.setDay(23);
		System.out.print("\nSet Get Method : "+date2.getDay());
	}

}
class Date
{
	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) 
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() 
	{
		return day;
	}
	public void setDay(int day) 
	{
		if(day > 31 || day < 1) 
			return;
		this.day = day;
	}
	public int getMonth() 
	{
		return month;
	}
	public void setMonth(int month) 
	{
		if(month > 12 || month < 1) 
			return;
		this.month = month;
	}
	public int getYear() 
	{
		return year;
	}
	public void setYear(int year) 
	{
		if(yearCount(year) == 4)
			this.year = year;
		else 
		{
			System.out.println("invalid year");
			return;
		}
	}
	public void display()
	{
		System.out.println("Date Entered : "+this.day + "/" + this.month + "/" + this.year);
	}
	private int yearCount(int year) 
	{
		int count = 0;
		while(year != 0) 
		{
			count++;
			year/=10;
		}
		return count;
	}
}
/*Date Entered : 23/7/1997
Get Methods : 1/1/1997
Set Get Method : 23*/
