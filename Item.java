class Item {
	public static void main(String items[]){
		String name = "Dairy milk";
		String brand = "cadbury";
		int foundedYear = 1824;
		
		
		System.out.println("name of the iteam " + name);
		System.out.println("brand name : " + brand);
		System.out.println("founded in the year: " + foundedYear);
		
		String ingredients[] = {"Sugar","Milk Solids (23%)","Cocoa Butter","Cocoa Solids","Fractionated Fat",
		"Emulsifiers (442, 476)","Flavours (Natural, Nature Identical and Artificial - Vanilla Flavouring Substances)"};
		
		String allergenInformation[] = {"Contains Milk","Contains Soy","May Contain Tree Nuts","May Contain Wheat","May Contain Barley"};
		
		System.out.println("list of ingredients:");
		for (String ingredient : ingredients){
			System.out.println(ingredient);
		}
		
		System.out.println("list of allergen Information:");
		for (String allergy : allergenInformation){
			System.out.println(allergy);
		}
	}
}
