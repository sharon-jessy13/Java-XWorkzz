class GitHub {
	
	public static void createAccount(String email, String passward, String username,
	String countryOrRegion){
		
		System.out.println("email is :" + email);
		System.out.println("passward is :" + passward);
		System.out.println("username is :"+ username);
		System.out.println("country :"+ countryOrRegion);
	}

	public static void main(String git[]){
		
		System.out.println("main Started");
		
		String pass = "Sharon@567";
		String country = "India";
		
		createAccount("sharon@gmail.com", pass, "sharonn_jessy", country);
		
		System.out.println("main ended");
	}
}