class Instagram {
	public static void createAccount(String email, String passward, String birthday,
	String name, String userName){
		
		System.out.println("Create account Started");
		
		System.out.println("given email is : " + email);
		System.out.println("passward is :" + passward);
		System.out.println("birthday of user : " + birthday);
		System.out.println("name : " + name);
		System.out.println("username is : " + userName);
		
		System.out.println("Create account ended");

	}
	
	public static void main(String insta[]){
		
		System.out.println("main Started");
		
		//invoking
		createAccount("sharon@gamil.com", "Sharon123", "13-11-2004", "Sharon", "Sharonn");
		
		
		System.out.println("main ended");
	}
}