package day5_1_pack3;
import day5_1_pack1.Student;
import day5_1_pack2.Batch;
public class TestStudent 
{
	public static void main(String[] args) 
	{
		Student s=new Student();
		s.accept();
		s.display();
		
		Batch b=new Batch();
		b.accept();
		b.display();
	}

}
