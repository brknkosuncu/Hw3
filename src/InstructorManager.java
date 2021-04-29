
public class InstructorManager extends UserManager {
	@Override
    public void add(User user) {
        System.out.println(user.getName() + "(I) => Added.");
    }

    @Override
    public void delete(User user) {
        System.out.println(user.getName() + "(I) => Deleted.");
    }	
	
}
