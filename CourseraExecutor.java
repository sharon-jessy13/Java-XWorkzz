class CourseraExecutor{
	public static void main(String course[]){
		String gmail = "sharon@gmail.com";
		String name = "Sharon Jessy T S";
		String pass = "Sharon@123";
		
		//invoking
		Coursera.createAccount(gmail, name, pass); // external reference
		
		Coursera.createAccount("jessy@gamil.com", "Jessy T S", "Jessy123"); // internal reference
		
	}
	
}