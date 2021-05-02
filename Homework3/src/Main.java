
public class Main {

	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setFirstName("Oğuzhan");
		user1.setLastName("Yılmaztürk");
		
		UserManager manager = new UserManager();
		
		manager.add(user1);
		manager.delete(user1);
		manager.update(user1);
		
		
		Student student1 = new Student();
		
		student1.setFirstName("Engin");
		student1.setLastName("Demiroğ");
		
		StudentManager studentManager = new StudentManager();
		studentManager.login(student1);
		
		
		Instructor instructor1 = new Instructor();
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setLessons("Java");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.listLesson(instructor1);
		instructorManager.addLesson("java");
		
		
		
	}

}
