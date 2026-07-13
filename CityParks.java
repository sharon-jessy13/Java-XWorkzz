class CityParks {
	public static void main (String cp[]){
		String city = "Banglore";
		
		System.out.println("city choosen: " + city);
		
		
		String parkNames[] = {"Cubbon Park","Lalbagh Botanical Garden","Sankey Tank","Agara Lake Park",
        "Lumbini Gardens", "Bugle Rock Park", "Indira Gandhi Musical Fountain Park", "JP Park (Jaya Prakash Narayan Park)",
        "Prakruthi Vana Park"};
		
		System.out.println("nuber of famous parks : " + parkNames.length);
		
		
		System.out.println("list of parks : ");
		for (String park : parkNames){
			System.out.println(park);
		}
		
	}
	
}