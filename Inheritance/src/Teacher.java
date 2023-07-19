
public class Teacher extends Person
{
	private String Qualification;
	
public	Teacher(String q)
	{
		Qualification=q;
	}
	
public Teacher(String name, int age, String address,String q) 
{
super(name,age,address);

Qualification=q;

}


	String getQualification()
	{
		return Qualification;
	}
	
	public String toString()
	{
	    return (super.toString()+" Qualification: "+Qualification);
	}
}
