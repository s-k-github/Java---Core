package day5_3;

public class Day5_3_Date 
{
	int day, month,year;
	
	public Day5_3_Date() 
	{
		this.day = 1;
		this.month = 1;
		this.year = 2000;
	}
	
	
	public Day5_3_Date(int day,int month,int year) 
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	private boolean checkYearFormat(int year) 
	{
		int countOfdigit = 0;
		while(year!= 0) {
			countOfdigit++;
			year/=10;
		}
		if(countOfdigit == 4)
			return true;
		else
			return false;
	}
	public void setDay(int day) 
	{
		if(day > 31 || day < 1)
			return;
		this.day = day;
	}
	public void setMonth(int month) 
	{
		if(month > 12 || month < 1) 
		{
			return;
		}
		this.month = month;
	}
	public void setYear(int year) 
	{
		if(checkYearFormat(year))
			this.year = year;
		else
			return;
	}
	public int getDay() 
	{
		return this.day;
	}
	public int getMonth() 
	{
		return month;
	}
	public int getYear() 
	{
		return year;
	}
	public void displayDate() 
	{
		System.out.println(this.day +"/"+this.month +"/"+this.year);
	}
}
/*Default Constructor ->
1/1/2000

Paremeterised Constructor->
23/7/1997
*/
