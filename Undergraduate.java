import java.util.ArrayList;

public class Undergraduate extends Student {

	// Extra Attributes
	private String previousSecondarySchool;

	// CONSTRUCTOR

	public Undergraduate() {
		super();
	}

	public Undergraduate(ArrayList<Course> courses, String name, int iD, Department department) {
		super(courses, name, iD, department);

	}

	public String getPreviousSecondarySchool() {
		return previousSecondarySchool;
	}

	public void setPreviousSecondarySchool(String previousSecondarySchool) {
		this.previousSecondarySchool = previousSecondarySchool;
	}

	@Override
	public String toString() {
		return "Undergraduate Student - Name: " + getName() + ", ID: " + getID() + ", Previous Secondary Education: "
				+ getPreviousSecondarySchool() + ",\nCourses: " + printCourses();
	}

}