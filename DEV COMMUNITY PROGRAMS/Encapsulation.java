public class Encapsulation
{
  //Declaring variables as private
  private String EmployeeName;
  private String EmployeeJob;
  private int EmployeeAge;

  //'public' Setter and Getter Methods
  public void setName(String EmployeeName)
  {
    this.EmployeeName = EmployeeName;
  }
  public String getName()
  {
    return EmployeeName;
  }

  public void setJob(String EmployeeJob)
  {
    this.EmployeeJob = EmployeeJob;
  }
  public String getJob()
  {
    return EmployeeJob;
  }

  public void setAge(int EmployeeAge)
  {
    this.EmployeeAge = EmployeeAge;
  }
  public int getAge()
  {
    return EmployeeAge;
  }

  public static void main (String[] args)
  {
	//creating object
    Encapsulation e = new Encapsulation();

    // setting values through setter methods
    e.setName("SUPRIYA KOLHE");
    e.setAge(22);
    e.setJob("SOFTWARE DEVELOPER");

    // Displaying values through Getter methods
    System.out.println("Name of the employee: " + e.getName());
    System.out.println("Age of the employee: " + e.getAge());
    System.out.println("Job of the employee: " + e.getJob());
  }//PSVM ends
}//Encapsulation class ends

/*
Name of the employee: SUPRIYA KOLHE
Age of the employee: 22
Job of the employee: SOFTWARE DEVELOPER
*/