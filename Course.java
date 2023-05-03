public class Course {

	// Course
	private int ID;

	// Course Associations
	private Professor professor;

	// CONSTRUCTOR

	public Course() {
	}

	public Course(Professor aProfessor) {
		professor = aProfessor;
	}

	public Course(Professor aProfessor, int iD) {
		professor = aProfessor;
		ID = iD;
	}

	// Getters and Setters
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	// ToString

	@Override
	public String toString() {
		return "Course- ID:" + ID + ", Professor:" + professor.getName();
	}
}