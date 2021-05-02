package homework3;



public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Kayýt oluþturuldu. ");
	}	
	// bu þekildede oluyor
	public void addMultiple(User[] users) {
		for(User user : users) {
			add(user);
		}
	}
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Kayýt silindi. ");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Kayýt güncellendi. ");
	}
	
	
	

}
