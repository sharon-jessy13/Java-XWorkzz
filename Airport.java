class Airport {
	public static void main (String air[]){
		
		String loaction = "Karnataka";
		int numOfAirports = 9;
		String types = "International and Domestic";
		
		System.out.println("airport state name :" + loaction);
		System.out.println("total number of airports :" + numOfAirports);
		System.out.println("types of airports :"+ types);
		
		
		String airportNames[] = {"Kempegowda International Airport","Mangaluru International Airport","Belgaum Airport",
        "Bidar Airport","Jindal Vijayanagar Airport","Hubli Airport","Kalaburagi Airport","Mysore Airport",
		"Kuvempu Airport"};
		
		System.out.println("List of Airports:");
		
		for(String airportName : airportNames){
			System.out.println(airportName);
		}
		
	}
} 