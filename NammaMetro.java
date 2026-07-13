class NammaMetro {
	public static void main(String metro[]){
		String city = "Banglore";
		int noOfLines = 2;
		String name = "Namma Metro ";
		
		System.out.println("it is loacted in city :" + city);
		System.out.println("number of  metro lines :" + noOfLines);
		System.out.println("name of the metro :" + name);
		
		String greenLine[] = {"Madavara","Manjunathanagara","Chikkabidarakallu","Nagasandra","Dasarahalli","Jalahalli",
        "Peenya Industry","Peenya","Goraguntepalya","Yeshwanthpur","Sandal Soap Factory","Mahalakshmi","Rajajinagar","Mahakavi Kuvempu Road",
        "Srirampura","Mantri Square Sampige Road","Nadaprabhu Kempegowda Station (Majestic)","Chickpete","Krishna Rajendra Market",
        "National College","Lalbagh","South End Circle","Jayanagar","Rashtreeya Vidyalaya Road (RV Road)","Banashankari","Jaya Prakash Nagar",
        "Yelachenahalli","Konanakunte Cross","Doddakallasandra","Vajarahalli","Thalaghattapura","Silk Institute"};
		
		String purpleLine[] = {"Challaghatta","Kengeri Bus Terminal", "Kengeri","Pattanagere","Rajarajeshwari Nagar","Jnanabharathi","Pantharapalya-Nayandahalli",
        "Mysuru Road", "Deepanjali Nagar", "Attiguppe", "Vijayanagar", "Hosahalli", "Magadi Road","Krantivira Sangolli Rayanna Railway Station",
		"Nadaprabhu Kempegowda Station (Majestic)","Sir M. Visvesvaraya Station, Central College","Cubbon Park","Dr. B. R. Ambedkar Station (Vidhana Soudha)",
        "Mahatma Gandhi Road","Trinity","Halasuru","Indiranagar","Swami Vivekananda Road","Baiyappanahalli","Benniganahalli",
        "Krishnarajapura (K.R. Pura)","Garudacharpalya","Singayyanapalya","Hoodi","Seetharamapalya","Kundalahalli","Nallurhalli", "Sri Sathya Sai Hospital",
        "Pattandur Agrahara","Hopefarm Channasandra","Kadugodi Tree Park","Whitefield (Kadugodi)"};
		
		
		System.out.println("no. of stations in green line :" + greenLine.length);
		System.out.println("the list of green line stations are :");
		
		for(String green : greenLine){
			System.out.println(green);	
		}
		
		System.out.println("no. of stations in purple line line :" +purpleLine.length);
		System.out.println("the list of purple line stations are :");
		
		for(String purple : purpleLine){
			System.out.println(purple);	
		}
	}
}