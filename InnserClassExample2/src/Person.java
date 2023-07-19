
 public class Person 
{
public static 	String name;
public static 	int id;

public static  void eat() {System.out.println("Person is eating");}
public static  void walk() {System.out.println("Person is walking");}
public static  void sleep() {System.out.println("Person is sleeping");}


public static  class Student
{
	public void study() {System.out.println("Student is studying");}
}

public static  class Teacher
{
	public void teach(String subject) 
	    {
		System.out.println("Teacher is teaching : "+subject);
		}
	  public void teach(String name,String subject) 
    {
	System.out.println("Teacher "+name+" is teaching : "+subject);
	}
}

}//end of Person Class
