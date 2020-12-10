class Student
{  
	float fees=40000;  
}//parent class ends
class Computer extends Student
{  
	int study_material=3000;  
	public static void main(String args[])
	{  
		Computer p=new Computer();  
		System.out.println("Computer student fees is:"+p.fees);  
		System.out.println("Study material charges for computer student is:"+p.study_material);  
	}//maine method ends
}//child class ends

/*OUTPUT:-
Computer student fees is:40000
Study material charges for computer student is: 3000
*/