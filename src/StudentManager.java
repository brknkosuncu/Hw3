
public class StudentManager extends UserManager {
	 @Override
	    public void add(User user) {
	        System.out.println(user.getName() + "(S) => Added.");
	    }

	    @Override
	    public void delete(User user) {
	        System.out.println(user.getName() + "(S) => Deleted.");
	    }
	    
	    public void examLimits(Student student) {
				System.out.println("Please enter numbers from 0 to 100.");
			
	    }
	    
	    public void checkPassed(Student student) {
	    	
	    	if(student.getExamResult() >= 60 && student.getExamResult() <= 100) {
	    		System.out.println(student.getName() + " passed this exam.");
	    	}
	    	else if(student.getExamResult() >= 0 && student.getExamResult() < 60){
	    		System.out.println(student.getName() + " failed this exam.");
	    	}
	    	else 
	    		examLimits(student);
	    }

}
