class Amazon{
	public static void main (String amzon[]){
		String headQuaters = "Seattle, Washington, USA";
		int foundedYear = 1994;
		String numOfEmployees = "approx. 1.57 million";
		String platform = "E-commerce";
		
		
		System.out.println("Head Quaters is in : " + headQuaters);
		System.out.println("Founded in the year : " + foundedYear);
		System.out.println("total num of employees working : " + numOfEmployees);
		System.out.println("which platformit it is : " + platform);
		
		
		String categories[] = {"Top Picks","Amazon Pay","Mobiles & Electronics","Deals &","Fashion & Beauty",
		"Home & Furniture","Groceries & Pet Supplies","Travel & Auto","Toys & Kids","Sports & Fitness","Gifting",
		"Sell on Amazon","Business Purchases","Your Things","Amazon Bazaar","Books & Education","Video & Music",
		"Prime","Games & Live Shopping","Pharmacy & Household"};
		
		System.out.println("List of categories:");
		
		for (String category : categories){
			System.out.println(category);
		}
	}
}