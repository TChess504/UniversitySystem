import java.util.*;

public class Professor {

	// Attributes
	private String name;

	// Professor Associations
	private Department department;
	private ArrayList<Course> courses = new ArrayList<Course>();

	// CONSTRUCTOR
	public Professor() {
	}

	public Professor(Department aDepartment) {
		department = aDepartment;
	}

	public Professor(String aName, Department aDepartment) {
		department = aDepartment;
		name = aName;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

	// ToString
	@Override
	public String toString() {
		return "Professor- name:" + name + ", department:" + department + ", courses:" + courses;
	}

}
