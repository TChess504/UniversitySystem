import java.util.ArrayList;

public class Honors extends Undergraduate implements Research
{
	
	//Constructors
	public Honors()
	{
		super();
	}

	public Honors(ArrayList<Course> courses, String name, int iD, Department department) {
		super(courses, name, iD, department);
		
	}

	public void researchOperation(String subject)
	  {
		  System.out.println(subject);
	  }
	
	//ToString
	@Override
	public String toString() {
		return "Undergraduate Honors Student - Name: " + getName() + ", ID: " + getID() 
		+ ", Previous Secondary Education: "
				+ getPreviousSecondarySchool()+ ",\nCourses: " + printCourses();
	}

}
