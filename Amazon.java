class Amazon {
	public static void createAccount(long contactNumber, String name){
		
		System.out.println("method Started");
		
		System.out.println("mobile number is :" + contactNumber);
		System.out.println("your name :" + name);
		
		System.out.println("method ended");
	}
	
	public static void main (String amazon[]){
		
		System.out.println("main Started");
		
		long mobileNumber = 9876543210l;
		
		createAccount( mobileNumber , "Sharon Jessy T S");
		
		System.out.println("main ended");
		
	}
}