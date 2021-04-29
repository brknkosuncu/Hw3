
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("Berkan", 123, "BM 4/A", 94);
		Student student2 = new Student("Leyla", 345, "BM 4/B", 43);
		Student student3 = new Student("Mustafa", 531, "BM 3/A", 155);
		

        StudentManager studentManager = new StudentManager();
        studentManager.add(student1);
        studentManager.add(student2);
        studentManager.add(student3);
        
        studentManager.delete(student2);
        
        
        Instructor instructor = new Instructor("Ahmet", 987, "Math");
       
        
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor);
        instructorManager.delete(instructor);
        
        studentManager.checkPassed(student1);
        studentManager.checkPassed(student2);
        studentManager.checkPassed(student3);
        
        
	}

}

