class GitHubExecutor {
	public static void main(String git[]){
		
		System.out.println("main Started");
		
		String pass = "Sharon@567";
		String country = "India";
		
		GitHub.createAccount("sharon@gmail.com", pass, "sharonn_jessy", country);
		
		System.out.println("main ended");
	}
}