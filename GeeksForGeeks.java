class GeeksForGeeks {
	
	public static void createAccount(String email, String username, String passward,
	String institutionOrOrganization){
		
		System.out.println("method started");
		
		System.out.println("email:" + email);
		System.out.println("username :" + username);
		System.out.println(" passward is :" + passward);
		System.out.println("institution :"+ institutionOrOrganization);
		
		System.out.println("method ended" );
	}
    public static void main (String gfg[]){
		
		System.out.println("main started");
		
		createAccount("sharon@gmail.com", "Sharonnn", "Sharon@123", "CIT" );
		
		System.out.println("main ended");
		
	}
}