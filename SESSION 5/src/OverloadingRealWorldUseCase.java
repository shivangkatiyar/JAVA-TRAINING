class Authentication{
	//Method overloading
	static void login(String email, String password) {
		System.out.println("Logging in with email and password");
	}
	
	static void login(String phone, int otp) {
		System.out.println("Logging in with phone and otp");
	}
	
	static void login(String gmailId) {
		System.out.println("Logging in with google account");
	}
}
public class OverloadingRealWorldUseCase {
	
	

	public static void main(String[] args) {
		Authentication.login("john@example.com","john@123");
		Authentication.login("john@gmail.com");
		Authentication.login("+91 99999 11111" ,1299);
		

	}

}
