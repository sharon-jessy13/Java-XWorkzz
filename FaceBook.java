class FaceBook {
	
	public static void createAccount(String firstName, String surName, String birthday,
	String gender, long phoneNumber, String passward){
		
		System.out.println("method Started");
		
		System.out.println("first name is :" + firstName);
		System.out.println("surname is :" + surName);
		System.out.println("birthday is on : "+ birthday);
		System.out.println("gender :"+ gender);
		System.out.println("mobile number is :"+ phoneNumber);
		System.out.println("passward is :"+ passward);
		
		System.out.println("method ended");
		
	}
	public static void main (String fb[]){
		
		System.out.println("main Started");
		
		String dateOfBirth = "13-11-2004";
		long mobileNumber = 9876543210l;
		
		createAccount("Sharon", "Thatigiri", dateOfBirth, "female", mobileNumber, "Sharonjessy123");
		System.out.println("main ended");
		
	}
}