import java.util.*;

public class Department {

	private String location;

	// Department Associations
	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<Professor> professors = new ArrayList<Professor>();

	// CONSTRUCTOR
	public Department() {
		location = "none";
	}

	public Department(String location) {

		this.location = location;

	}

	// Getters and Setters
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public ArrayList<Professor> getProfessors() {
		return professors;
	}

	public void setProfessors(ArrayList<Professor> professors) {
		this.professors = professors;
	}

	// To String
	public String toString() {
		return "Department [location=" + location + ", students=" + students + ", professors=" + professors + "]";
	}

}