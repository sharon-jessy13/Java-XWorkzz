class AmazonExecutor {
	
	public static void main (String amazon[]){
		
		System.out.println("main Started");
		
		long mobileNumber = 9876543210l;
		
		Amazon.createAccount( mobileNumber , "Sharon Jessy T S");
		
		System.out.println("main ended");
		
	}
}