
public class Program1
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        Student s1=new Student("Ali",10,"BSCS");
        
        String Name =s1. getName();
        int Rollno=s1.getRollno() ;
        String StudyProgram=s1.getStudyProgram() ;
        
        
        System.out.println("Name: "+Name);
        System.out.println("Roll No :"+Rollno);
        System.out.println("Study Program :"+StudyProgram);
        
        
        Student s2=new Student();
        //assigning the values
        s2.setName("Imran") ;
        s2.setRollno(10) ;
        s2.setStudyprogram("MCS") ;
        //getting the values
        
         Name =s2. getName();
         Rollno=s2.getRollno() ;
         StudyProgram=s2.getStudyProgram() ;
        
        
        System.out.println("Name: "+Name);
        System.out.println("Roll No :"+Rollno);
        System.out.println("Study Program :"+StudyProgram);
         
        
        
        
        
	}

}
