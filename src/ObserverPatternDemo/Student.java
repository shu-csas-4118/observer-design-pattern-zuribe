package ObserverPatternDemo;
import java.util.ArrayList;


public class Student 
{
	private String firstName;
	private String lastName;
	private String email;
	private int idNumber;
	private ArrayList<IObserver> observers;
	private ArrayList<Course> courses = new ArrayList<Course>();
	
	public Student (String firstName, String lastName, int idNumber, String email, ArrayList<Course> courses)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.email = email;
		this.courses = courses;
		this.observers = new ArrayList<IObserver>();
	}
	
	public Student()
	{
		this.observers = new ArrayList<IObserver>();
	}
	
	//SETTERS AND GETTERS
	public void setFirstName (String firstName)
	{
		this.firstName = firstName;
		this.observers.get(0).update(this);
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
		this.observers.get(1).update(this);

	}
	
	public String getLastName() 
	{
		return this.lastName;
	}
	
	public void setIdNumber(int idNumber) 
	{
		this.idNumber = idNumber;
		this.observers.get(2).update(this);
	}	
	
	public int getIdNumber() 
	{
		return this.idNumber;
	}
	
	public void setEmail(String email) 
	{
		this.email = email;
		this.observers.get(3).update(this);
	}
	
	public String getEmail() 
	{
		return this.email;
	}
	
	public ArrayList<Course> getCourses()
	{
		return this.courses;
	}
	
	public void addCourse(Course course)
	{
		this.courses.add(course);
		this.observers.get(4).update(this);
	}
	
	public void removeCourse(Course course)
	{
		this.courses.remove(course);
		this.observers.get(4).update(this);
	}
	
	public void printStudentCourses()
	{
		for(Course c: this.courses)
		{
			c.printCourse();
		}
	}
	
	public void printStudentDetails()
	{
		System.out.println("Students first name: " + this.getFirstName());
		System.out.println("Students last name: " + this.getLastName());
		System.out.println("Students id number: " + this.getIdNumber());
		System.out.println("Students email: " + this.getEmail());
		System.out.println("Students courses:");
		printStudentCourses();
		System.out.println();
	}
	
	//OBSERVER METHODS
	public void attachObserver(IObserver observer)
	{
		this.observers.add(observer);
	}
	
	public void notifyAllObservers()
	{
		for(IObserver observer: this.observers)
		{
			observer.update(this);
		}
	}
}
