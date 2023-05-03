import java.util.ArrayList;

public class Graduate extends Student {
	// Extra Attributes
	private String previousDegrees;
	private String previousPostSecondary;

	public Graduate() {
		super();
	}

	public Graduate(ArrayList<Course> courses, String name, int iD, Department department, String previousDegrees,
			String previousPostSecondary) {

		super(courses, name, iD, department);
		this.previousPostSecondary = previousPostSecondary;
		this.previousDegrees = previousDegrees;
	}

	// Getters and Setters
	public String getPreviousDegrees() {
		return previousDegrees;
	}

	public void setPreviousDegrees(String previousDegrees) {
		this.previousDegrees = previousDegrees;
	}

	public String getPreviousPostSecondary() {
		return previousPostSecondary;
	}

	public void setPreviousPostSecondary(String previousPostSecondary) {
		this.previousPostSecondary = previousPostSecondary;
	}

	// toString
	@Override
	public String toString() {
		return "Graduate Student - Name: " + getName() + ", ID: " + getID() + ", PreviousDegrees: "
				+ getPreviousDegrees() + ", Previous PostSecondary Education: " + getPreviousPostSecondary()
				+ ",\nCourses: " + printCourses();
	}

}
