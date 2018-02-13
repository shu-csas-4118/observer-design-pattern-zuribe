package ObserverPatternDemo;

public class LastNameObserver implements IObserver 
{
	private Student student;
	
	public LastNameObserver()
	{
		
	}
	
	public void update(Student student) 
	{
		System.out.println("Student's last name is now " + student.getLastName());
		System.out.println();
	}

}
