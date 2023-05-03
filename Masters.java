import java.util.ArrayList;

public class Masters extends Graduate implements Research {

	// CONSTRUCTOR

	public Masters() {
		super();
	}

	public Masters(ArrayList<Course> courses, String name, int iD, Department department, String previousDegrees,
			String previousPostSecondary) {
		super(courses, name, iD, department, previousDegrees, previousPostSecondary);

	}

	public void researchOperation(String subject) {
		System.out.println(subject);
	}

	// To String
	@Override
	public String toString() {
		return "Masters Student - Name: " + getName() + ", ID: " + getID() + ", PreviousDegrees: "
				+ getPreviousDegrees() + ", Previous PostSecondary Education: " + getPreviousPostSecondary()
				+ ",\nCourses: " + printCourses();
	}

}
