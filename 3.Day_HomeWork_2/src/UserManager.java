
public class UserManager {
	
	public void loginUser(User user) {
		
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + " isimli kullanıcı sisteme giriş yaptı.");
		System.out.println("------------------------------------------");
		
	}
	
	
	public void logOutUser(User user) {
		
		System.out.println("------------------------------------------");
		System.out.println( user.getFirstName() + " " + user.getLastName() + " " + " isimli kullanıcı sistemden çıkış yaptı");
	}

	

}
