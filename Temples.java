class Temples {
	public static void main(String names[]){
		String state = "Tamil Nadu";
		String nativeLanguage = "Tamil";
		String famous = "Temple";
		
		System.out.println("State name where temples located : " + state);
		System.out.println("native language is : " + nativeLanguage);
		System.out.println("famous for :" + famous);
		
		String templeNames[] = {"1008 Lingam Temple","Adi Kesava Perumal Temple","Airavatesvara Temple","Alagar Kovil","Anantha Padmanabha Swamy Temple",
		"Anjaneya Temple, Namakkal","Arapaleeswarar Temple","Arulmigu Dhandayuthapani Swamy Temple, Palani","Arulmigu Mariamman Temple, Irukkangudi","Arunchalaeswarar Temple",
		"Bhagavathy Amman Temple","Brihadeeswara Temple","Chenraya Perumal Temple","Chitharal Jain Rock Cut Temple","Eachanari Vinayagar Temple, Coimbatore","Gangaikonda Cholapuram",
		"Jayankondam Varatharaja Perumal Temple","Kailasanathar Temple","Kamakshi Amman Temple","Kapaleeshwarar Temple",
		"Koodal Azhagar Temple","Koothanur Saraswathi Temple","Kottai Mariamman Temple","Mamallapuram Shore Temple",
		"Maruthamalai Murugan Temple","Namakkal Narasimha Temple","Pazhamudhir Solai","Ramanathaswamy Temple","Ratnagiri Murugan Temple",
		"Shree Parshwa Padmavathi Shaktipeet Tirth Dham","Shri Munisuvratswami Jain Navgraha Temple, Nemmeli","Soundararaja Perumal Temple","Sri Bhaktha Anjaneyaswami Temple",
		"Sri Ekambareswarar Temple","Sri Kailasanathar Temple","Sri Kattu Veera Anjaneya Temple","Sri Lakshmi Golden Temple, Sripuram",
		"Sri Meenakshi Amman Temple","Sri Mutharamman Temple, Kulasekharapatnam","Sri Parthasarathy Temple","Sri Ramakrishna Math",
		"Sri Renganatha Swamy Temple, Srirangam","Sri Subramaniya Swami Temple","Sri Ulagalantha Perumal Temple","Srivilliputhur Andal Temple",
		"Suchindram Shree Thanumalayan Swamy Temple","Swami Malai Temple","The Punnainallur Mariamman Temple","Theerthamalai Temple",
		"Thirumohoor Kalamegaperumal Temple, Madurai","Thyagarajaswami Temple, Tiruvarur","Tirumala Tirupathi Devasthanam","Tirupparankundram",
		"Uchippillaiyar Temple, Rock Fort", "Vandiyur Mariamman Teppakulam","Varadharaja Perumal Temple","Vayalur Murugan Temple"};
		
		System.out.println("list of temples");
		
		for(String temple : templeNames){
			System.out.println(temple);
		}
	}
}