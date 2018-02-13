package ObserverPatternDemo;

import java.util.ArrayList;

public class ObserverPatternDemo 
{
	public static void main(String[] args)
	{
		//INSTANTIATION
		Course course1 = new Course("math", 1101, 3, "James Jones");
		Course course2 = new Course("science", 1102, 3, "Jane Doe");
		Course course3 = new Course("rock", 9999, 1000, "Jim Morrison");
		Course course4 = new Course("guitar", 8888, 2308, "Jim Hendrix");
		Course course5 = new Course("awesomeness", 5555, 7891, "Chan TheMan");
		ArrayList<Course> studentCourses = new ArrayList<Course>();
		studentCourses.add(course1);
		studentCourses.add(course2);
		studentCourses.add(course3);
		
		Student student = new Student ("Zane", "Uribe", 93759273, "uribezan@shu.edu", studentCourses);
		FirstNameObserver firstNameObserver = new FirstNameObserver();
		LastNameObserver lastNameObserver = new LastNameObserver();
		IdNumberObserver idObserver = new IdNumberObserver();
		EmailObserver emailObserver = new EmailObserver();
		CourseObserver courseObserver = new CourseObserver();
		
		//Attaching Observers to the student object
		student.attachObserver(firstNameObserver);
		student.attachObserver(lastNameObserver);
		student.attachObserver(idObserver);
		student.attachObserver(emailObserver);
		student.attachObserver(courseObserver);
		
		student.printStudentDetails();	
		
		//Testing
		student.setFirstName("George");
		student.setIdNumber(12345678);
		student.setEmail("email@mail.com");
		
		student.addCourse(course4);
		student.removeCourse(course1);
	}
}
