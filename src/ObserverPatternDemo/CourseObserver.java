package ObserverPatternDemo;

public class CourseObserver implements IObserver 
{
	private Student student;
	
	public CourseObserver ()
	{
		
	}
	
	public void update(Student student)
	{
		System.out.println("Student's courses are now: ");
		student.printStudentCourses();
		System.out.println();
	}

}
