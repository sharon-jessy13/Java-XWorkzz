class Coursera{
	
	public static void createAccount (String email, String fullName, String passward){
		
		System.out.println("method started");
		
		System.out.println("email is :" + email);
		System.out.println("Full Name :"+ fullName);
		System.out.println(" passward is :" + passward);
		
		System.out.println("method ended");
	}
	public static void main(String course[]){
		String gmail = "sharon@gmail.com";
		String name = "Sharon Jessy T S";
		String pass = "Sharon@123";
		
		//invoking
		createAccount(gmail, name, pass); // external reference
		
		createAccount("jessy@gamil.com", "Jessy T S", "Jessy123"); // internal reference
		
	}
}