package ObserverPatternDemo;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("Garett", "Chang", 123456, "changgar@shu.edu");
		
		IdNumberObserver idObserver =  new IdNumberObserver();
		FirstNameObserver firstNameObserver = new FirstNameObserver();
		
		student.attachObserver(idObserver);
		student.attachObserver(firstNameObserver);
		
		student.setFirstName("Garrett");
		student.setIdNumber(54321);
		
	}

}
