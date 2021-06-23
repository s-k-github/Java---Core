package day5_1_pack2;

import day5_1_pack1.Student;
public class Batch 
{
	private int rollNo=0;
	private String name="";
	private int totalMarks=0;
	private String grade="";
	private String batch="";

	private void setTotalMarks()
	{
		this.totalMarks=Student.getTotalMarks();
	}
	private void setGrade()
	{
		this.grade=Student.getGrade();
	}
	public void accept()
	{
		System.out.print("\nPlease enter your batch detail: ");
		batch=Student.sc.next();
		
		this.rollNo=Student.rollNo;
		this.name=Student.name;
		setTotalMarks();
		setGrade();
		
		Student.sc.close();
	}
	public void display()
	{
		System.out.print("\nBatch Class Data: \nBatch:\tRollNo\tName\tTotalMarks\tGrade\n"+batch+"\t"+rollNo+"\t"+name+"\t"+totalMarks+"\t\t"+grade+"\n----------------------------------------------------------------------------------------------\n");
	}
}
/*
RollNo: 1212
Name: Supriya Kolhe
Total Marks: 99

Student Class Data: 
RollNo	Name	TotalMarks	Grade
1212	Supriya Kolhe	99		F
----------------------------------------------------------------------------------------------

Please enter your batch detail: BLTCOE12

Batch Class Data: 
Batch:	RollNo	Name	TotalMarks	Grade
BLTCOE12	1212	Supriya Kolhe	99		F
----------------------------------------------------------------------------------------------
*/
