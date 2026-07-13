class Overleaf {
	
	public static void createAccount(String email, String passward){
		
		System.out.println("method started");
		
		System.out.println("email is :" + email);
		System.out.println(" passward is :" + passward);
		
		System.out.println("method ended");
		
	}
	public static void main (String ol[]){
		
		
		String gmail = "sharon@gmail.com";
		String pass = "Sharon@123";
		
		System.out.println("main started");
		
		createAccount(gmail, pass);
		createAccount("jessy@outlook.com", pass);
		
		System.out.println("main ended");
	}
}