import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// Array List for Student
		ArrayList<Student> studentsRegister = new ArrayList<Student>();

		Department ComputerScience = new Department();
		Professor professor1 = new Professor(ComputerScience);
		professor1.setName("professor1");
		Course COIS2240 = new Course(professor1);
		Course COIS2300 = new Course(professor1);
		COIS2240.setID(2240);
		COIS2300.setID(2300);

		// Student Class
		Student anonymous = new Student();
		anonymous.setName("Anonymous");
		anonymous.setID(12345);
		studentsRegister.add(anonymous);

		// Undergrad Students
	
		Undergraduate student1 = new Undergraduate();
		student1.setName("student1");
		student1.setID(07724);
		student1.addCourse(COIS2240);
		student1.addCourse(COIS2300);

		studentsRegister.add(student1);

		// Honor Undergraduate Students
		Honors JohanLiebert = new Honors();
		JohanLiebert.setName("Johan Liebert");
		JohanLiebert.setID(07604);
		studentsRegister.add(JohanLiebert);

		// Graduates Student
		Graduate GusFrig = new Graduate();
		GusFrig.setID(07406);
		GusFrig.setName("Gus Frig");

		studentsRegister.add(GusFrig);

		// PhDs Student
		PhD JoeSmith = new PhD();
		JoeSmith.setID(07502);
		JoeSmith.setName("Joe Smith");

		studentsRegister.add(JoeSmith);

		// Masters Student
		Masters Bob = new Masters();
		Bob.setID(42069);
		Bob.setName("Bobby Stickman");

		studentsRegister.add(Bob);

		// Prints out the Students Array
		for (int i = 0; i < studentsRegister.size(); i++)
			System.out.println(studentsRegister.get(i) + "\n");

	}

}
