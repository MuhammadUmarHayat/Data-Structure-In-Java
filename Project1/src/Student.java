
public class Student 
{
	//decalre the data members
	private String name;
	private int rollno;
	private String studyProgram;
	
	//constructor
	//parameterless
	public Student() 
	{
		// initialze the fields
		name="";
		rollno=0;
		studyProgram="";
		
	}
	//parameterized constructor
	public Student(String n, int r, String s) 
	{
		// assigning the values to  the fields
		name=n;
		rollno=r;
		studyProgram=s;
		
	}
	//setter function: to set the values to the data members
	public void setName(String n) 
	{
		name=n;
	}
	
	public void setRollno(int r) 
	{
		rollno=r;
	}
	
	public void setStudyprogram(String s) 
	{
		studyProgram=s;
	}
	
	//getter function : to get the values 
	public String getName() 
	{
		return name;
	}
	
	public int getRollno() 
	{
		return rollno;
	}
	public String getStudyProgram() 
	{
		return studyProgram;
	}
	
}
