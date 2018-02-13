package ObserverPatternDemo;

public class EmailObserver implements IObserver 
{
	private Student student;
	
	public EmailObserver()
	{
		
	}
	
	public void update(Student student) 
	{
		System.out.println("Student's email is now " + student.getEmail());
		System.out.println();
	}

}
