class Pinterest{
	
	public static void createAccount(String email, String passward, String birthday){
		
		System.out.println("method started");
		
		
		System.out.println("email is :" + email);
		System.out.println("passward is :" + passward);
		System.out.println("birthday is : "+ birthday);
		
		System.out.println("method ended");
		
	}

	public static void main(String printrest[]){
		
		System.out.println("main Started");
		
		createAccount("sharon@gmail.com", "Sharon@123", "13/11/2004");
		
		System.out.println("main ended");
		
	}
}