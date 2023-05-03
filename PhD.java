import java.util.ArrayList;

public class PhD extends Graduate implements Research {

	// ATTRIBUTES

	// CONSTRUCTOR
	public PhD() {
		super();
	}

	public PhD(ArrayList<Course> courses, String name, int iD, Department department, String previousDegrees,
			String previousPostSecondary) {
		super(courses, name, iD, department, previousDegrees, previousPostSecondary);

	}

	public void researchOperation(String subject) {
		System.out.println(subject);
	}

	// to String
	@Override
	public String toString() {
		return "PhD Student - Name: " + getName() + ", ID: " + getID() + ", PreviousDegrees: " + getPreviousDegrees()
				+ ", Previous PostSecondary Education: " + getPreviousPostSecondary() + ",\nCourses: " + printCourses();
	}

}
