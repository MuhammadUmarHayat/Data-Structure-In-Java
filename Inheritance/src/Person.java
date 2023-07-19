
public class Person
{
	private String name;
	private int age;
	private String address;
	
	public Person()
	{
		name="";
		age=0;
		address="";	
	}
public Person(String n,int a,String add)
{
		name=n;
		age=a;
		address=add;
	}


public void setName(String n) 
{
	name=n;
}
public void setAge(int a) 
{
	
	age=a;
}
public void setAddress(String add) 
{
	address=add;
}

public String getName() {return name;}
public int getAge() {return age;}
public String getAddress() {return address;}


public String toString()
{
    return ("Name :" + name + "-"
            + "Age :" + age+"-"+ "Address: "+address);
}


}//end

