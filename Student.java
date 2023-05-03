import java.util.*;

public class Student {
	// Attributes
	private String name;
	private int ID;
	private ArrayList<Course> courses = new ArrayList<Course>();

	// Student Associations -- Aggregation
	private Department department;

	// CONSTRUCTOR
	protected Student() {
	}

	//
	protected Student(ArrayList<Course> courses, String name, int iD, Department department) {
		super();
		this.courses = courses;
		this.name = name;
		ID = iD;
		this.department = department;
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public Department getDepartment() {
		return department;
	}

	// Method - Operation to add a course to arraylist
	public void addCourse(Course courseToAdd) {

		courses.add(courseToAdd);

	}

	// Method - Operation to remove a course from arraylist
	public void removeCourse(Course courseToRemove) {

		courses.add(courseToRemove);

	}

	// Method to print courses for student
	public String printCourses() {

		if (courses.size() > 0) {
			String coursesString = "";
			for (int i = 0; i < courses.size() - 1; i++) {
				coursesString += (i + 1) + ": ";
				coursesString += courses.get(i);
				coursesString += "\n";

			}
			coursesString += courses.get(courses.size() - 1);
			return coursesString;
		}
		return "none";
	}

	// TO STRING
	@Override
	public String toString() {
		return "Student - Name:" + name + ", ID: " + ID + ",\nCourses: " + printCourses();
	}

}
