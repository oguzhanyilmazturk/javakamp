
public class UserManager {
	 	
	
	public void add(User user) {
		
		System.out.println(user.getFirstName()+" "+" "+user.getLastName()+" kiþisi eklendi");
	}
	
public void delete(User user) {
		
		System.out.println(user.getFirstName()+" "+" "+user.getLastName()+" kiþisi silindi");
	}

public void update(User user) {
	
	System.out.println(user.getFirstName()+" "+" "+user.getLastName()+" kiþisi güncellendi");
}
}
