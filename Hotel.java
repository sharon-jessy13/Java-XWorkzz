class Hotel{
	public static void main (String cafe[]){
		String name = "Rayalseema cafe";
		String location = "k r puram";
		boolean isAffordable = true;
		
		
		System.out.println("name of the hotel " + name);
		System.out.println("it is located at " + location);
		System.out.println("is that affordable " + isAffordable);
		
		
		String menus[] = {"Babycorn Biriyani","Mushroom Biriyani","Paneer Biriyani","Hyderabadi Chicken Dum Biriyani",
		"Rayalaseema Special Chicken Biriyani","Gongura Chicken Biriyani","Andhra Style Fry Piece Chicken Biriyani","Mom's Spicy Chicken Biriyani",
		"Red Chilli Chicken Biriyani","Ghee Roast Biriyani","Donne Chicken Biriyani","Raju Gari Kodi Pulao","Gobi Chilly",
		"Babycorn Chilly","Mushroom Chilly","Paneer Chilly","Chicken Chilly","Chicken Sixer","Gobi Manchurian", "Babycorn Manchurian",
        "Mushroom Manchurian", "Paneer Manchurian","Chicken Manchurian","Gobi Pepper Dry","Babycorn Pepper Dry","Mushroom Pepper Dry",
		"Paneer Pepper Dry","Chicken Pepper Dry", "Andhra Chilly Chicken","Chicken Popcorn","Crispy Chicken","Crispy Cheese Chicken",
		"Peri Peri Chicken Wings","Barbeque Chicken Wings","Regular French Fries",
		"Peri Peri French Fries","Cheese French Fries","Veg Burger","Veg Cheese Burger","Chicken Burger","Chicken Cheese Burger",
		"Veg Pizza","Babycorn Pizza","Mushroom Pizza","Paneer Pizza","Cheese Pizza","Chicken Pizza","Alfredo Veg Pasta",
		"Alfredo Chicken Pasta","Red Sauce Veg Pasta","Red Sauce Chicken Pasta","Mix Veg Pasta","Mix Chicken Pasta", "Veg Noodles",
		"Gobi Noodles","Babycorn Noodles","Mushroom Noodles","Paneer Noodles","Egg Noodles","Chicken Noodles","Veg Fried Rice",
		"Gobi Fried Rice","Babycorn Fried Rice","Mushroom Fried Rice","Paneer Fried Rice","Egg Fried Rice","Chicken Fried Rice"};
		
		System.out.println("list of menu items:");
		for (String menu : menus){
			System.out.println(menu);
		}
	}
}