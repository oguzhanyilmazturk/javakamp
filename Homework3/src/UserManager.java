
public class UserManager {
	 	
	
	public void add(User user) {
		
		System.out.println(user.getFirstName()+" "+" "+user.getLastName()+" ki�isi eklendi");
	}
	
public void delete(User user) {
		
		System.out.println(user.getFirstName()+" "+" "+user.getLastName()+" ki�isi silindi");
	}

public void update(User user) {
	
	System.out.println(user.getFirstName()+" "+" "+user.getLastName()+" ki�isi g�ncellendi");
}
}
