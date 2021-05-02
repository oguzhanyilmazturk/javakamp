
public class InstructorManager {
		
		
	
		
		public void addLesson(String newLesson) {
			System.out.println("Yeni ders eklendi "+newLesson);
		}

		
		
		
		public void listLesson(User user) {
			System.out.println(user.getFirstName()+" "+user.getLastName()+" eðitmeninin dersleri listelendi");
		}
}
