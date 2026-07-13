class Twitter {
	
	public static void createAccount(String username , String email){
		
		
		System.out.println("method Started");
		
		System.out.println("username is " + username);
		System.out.println("email is " + email);
		
		System.out.println("method ended");
	}
	public static void main (String x[]){
		
		System.out.println("main Started");
		
		createAccount("sharon_jessy", "sharonjessy@gamil.com");
		
		System.out.println("main ended");
	}
}