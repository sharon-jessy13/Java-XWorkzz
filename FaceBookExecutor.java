class FaceBookExecutor {
	
	public static void main (String fb[]){
		
		System.out.println("main Started");
		
		String dateOfBirth = "13-11-2004";
		long mobileNumber = 9876543210l;
		
		FaceBook.createAccount("Sharon", "Thatigiri", dateOfBirth, "female", mobileNumber, "Sharonjessy123");
		System.out.println("main ended");
		
	}
}