
public class main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Person p=new Person();
		Person.sleep();

		Person.Student s=new Person.Student();
		s.study();
		String subject="computer science";
		
		
		Person.Teacher obj=new Person.Teacher();
		obj.teach("Umar Hayat","Computer science");
		
		obj.teach("Imran ","Math");
		
		Person.Teacher umar=new Person.Teacher();
		umar.teach(subject);
		
		Person.Teacher imran=new Person.Teacher();
		imran.teach("Math");//passing the subject as string
	}
	

}
