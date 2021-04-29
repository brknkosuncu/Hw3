
public class Student extends User {
	private int studentNo;
	private String studentClass;
	private double examResult;
	
	public Student(String name, int studentNo, String studentClass, double examResult) {
		super(name);
		this.studentNo = studentNo;
		this.studentClass = studentClass;
		this.examResult = examResult;
	}
	public int getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	public double getExamResult() {
		return examResult;
		
	}
	public void setExamResult(double examResult) {
		
		this.examResult = examResult;
		
	}

}
