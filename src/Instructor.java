
public class Instructor extends User{
	private int instructorNo;
	private String lessonsInstructor;
	

	public Instructor(String name, int instructorNo, String lessonsInstructor) {
		super(name);
		this.instructorNo = instructorNo;
		this.lessonsInstructor = lessonsInstructor;
	}
	public int getInstructorNo() {
		return instructorNo;
	}
	public void setInstructorNo(int instructorNo) {
		this.instructorNo = instructorNo;
	}
	public String getLessonsInstructor() {
		return lessonsInstructor;
	}
	public void setLessonsInstructor(String lessonsInstructor) {
		this.lessonsInstructor = lessonsInstructor;
	}
	
}
