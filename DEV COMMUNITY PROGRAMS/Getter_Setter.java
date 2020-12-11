class Student
   private String year=2019;
   private String collegeName = "LTCOE";
   public String getYear() 
   {
	    return Year;
   }
   protected void setYear(String Year) 
   {
	    this.Year = Year;
   }
   protected String getCollegeName() 
   {
	    return collegeName;
   }
   protected void setCollegeName(String collegeName) 
   {
	    this.collegeName = collegeName;
   }
   void does()
   {
	    System.out.println("Internship");
   }
}

public class JavaExample extends Student{
   String mainSubject = "Chemistry";
   public static void main(String args[]){
	JavaExample obj = new JavaExample();
	
	System.out.println(obj.getCollegeName());
	System.out.println(obj.getYear());
	System.out.println(obj.mainSubject);
	obj.does();
   }
}

/*OUTPUT:
LTCOE
2019
Chemistry
Internship
*/
