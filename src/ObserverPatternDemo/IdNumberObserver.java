package ObserverPatternDemo;

public class IdNumberObserver implements IObserver 
{
	private Student student;
	
	public IdNumberObserver()
	{
		
	}
	
	public void update(Student student) 
	{
		System.out.println("Student's id number is now " + student.getIdNumber());
		System.out.println();
	}

}
