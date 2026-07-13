class VtuCollegeNames{
	public static void main (String college[]){
	
		String headQuaters = "Belagavi";
		String fullForm  = "Visvesvaraya Technological University";
		boolean isGovt = true ;
		
		
		System.out.println("head quaters located at : "+ headQuaters);
		System.out.println("abrivation of vtu : "+ fullForm);
		System.out.println("is that govt university : "+isGovt);
		
	
		String collegeNames[] ={"Acharya Institute of Technology", "A.P.S College of Engineering","AMC Engineering College","Amruta Institute of Engineering and Management Sciences",
		"Atria Institute of Technology","Bengaluru College of Engineering and Technology","Bengaluru Institute of Technology","Brindavan College of Engineering",
		"CMR Institute of Technology","Cambridge Institute of Technology","Channabasaveshwara Institute of Technology","City Engineering College",
		"Don Bosco Institute of Technology","Dr. T. Thimmaiah Institute of Technology","East Point College of Engineering and Technology","East West Institute of Technology","Ghousia College of Engineering",
		"Government S.K.S.J.T. Institute of Technology","Government Tool Room and Training Centre","Government Engineering College Ramanagara","HKBK College of Engineering",
		"HMS Institute of Technology","Impact College of Engineering","Jnana Vikas Institute of Technology","JSS Academy of Technical Education", "K.S. Institute of Technology",
		"Kalpataru Institute of Technology","KNS Institute of Technology","M.S. Engineering College","Oxford College of Engineering","R.R. Institute of Technology",
		"R.L. Jalappa Institute of Technology","Rajarajeswari College of Engineering","Rajiv Gandhi Institute of Technology","RNS Institute of Technology","S.J.C. Institute of Technology","Sai Vidya Institute of Technology",
		"Sambhram Institute of Technology","Sapthagiri College of Engineering","SEA College of Engineering and Technology","Sri Sairam College of Engineering","Shridevi Institute of Engineering and Technology",
		"Sir M. Visvesvaraya Institute of Technology", "SJB Institute of Technology", "Dr. Sri Sri Sri Shivakumar Mahaswamy College of Engineering","Sri Krishna Institute of Technology",
		"Sri Revanasiddeshwara Institute of Technology","Sri Venkateshwara College of Engineering","T. John Institute of Technology","Vemana Institute of Technology","Vivekananda Institute of Technology",
		"Acharya NRV School of Architecture","ACS College of Engineering","Akshaya Institute of Technology","C. Byregowda Institute of Technology","Vijaya Vittala Institute of Technology",
		"Acharya NRV School of Architecture","ACS College of Engineering","Akshaya Institute of Technology","C. Byregowda Institute of Technology","Vijaya Vittala Institute of Technology",
        "Shashib College of Engineering","Sampoorna Institute of Technology and Research","K.S. School of Engineering and Management", "Gopalan College of Engineering and Management",
		"Bengaluru Technological Institute", "Jyothy Institute of Technology", "Dayananda Sagar Academy of Technology and Management", "Cambridge Institute of Technology North Campus","Dayananda Sagar School of Architecture",
		"Impact School of Architecture","R.V. College of Architecture","BMS School of Architecture","SJB School of Architecture and Planning","Gopalan School of Architecture and Planning",
		"R.R. School of Architecture", "Adithya Academy of Architecture and Design", "BGS School of Architecture and Planning", "K.S. School of Architecture",
		"East West College of Engineering","Sri Vinayaka Institute of Technology","Sir M.V. School of Architecture","Nitte School of Architecture", "HMS School of Architecture", "Brindavan College of Architecture",
		"BMS College of Architecture","Oxford School of Architecture","RNS School of Architecture","Sri Basaveshwara Institute of Technology","R.V. Institute of Technology and Management",
		"East West School of Architecture","BGS College of Engineering and Technology","Aditya College of Engineering and Technology","Akash Institute of Engineering and Technology",
		"Ghousia Institute of Technology for Women","Anjuman Institute of Technology and Management","BLDEA's College of Engineering and Technology","Government Engineering College Haveri","Hirasugar Institute of Technology",
		"KLE College of Engineering and Technology, Chikodi","KLE Technological University, Hubballi","KLE Dr. M.S. Sheshgiri College of Engineering and Technology","Malik Sandal Institute of Art and Architecture","Maratha Mandal Engineering College",
		"Rural Engineering College, Hulkoti","S.G. Balekundri Institute of Technology","S.T.J. Institute of Technology","SECAB Institute of Engineering and Technology",
		"Smt. Kamala and Sri Venkappa M. Agadi College of Engineering and Technology","Sri Tontadarya College of Engineering", "Vishwanathrao Deshpande Institute of Technology","Government Engineering College Huvinahadagali",
		"Government Engineering College Karwar","Angadi Institute of Technology and Management","Jain College of Engineering","VSM's Institute of Technology",
		"AGM Rural College of Engineering and Technology","Grijabai Sail Institute of Technology", "Biluru Gurubasava Mahaswamiji Institute of Technology",
		"Basava Engineering School of Technology","Jain College of Engineering, Hubballi","Government Engineering College, Talakal",
		"Angadi School of Architecture","Jain College of Engineering and Research, Belagavi","Government Engineering College, Ron Road","Basavakalyan Engineering College",
		"Government Engineering College, Raichur","Guru Nanak Dev Engineering College","K.C.T. Engineering College","Khaja Bandanawaz College of Engineering",
		"Navodaya Institute of Technology","Proudadevaraya Institute of Technology","Rao Bahaddur Y. Mahabaleshwarappa Engineering College","Bheemanna Khandre Institute of Technology",
		"SLN College of Engineering","Veerappa Nisty Engineering College","Lingaraj Appa Engineering College","Godutai Engineering College for Women",
		"Shetty Institute of Technology","Government Engineering College, Gangavati","Government Engineering College, Bidar","Poojya Dr. Shivakumar Swamiji School of Architecture, Kalaburagi",
		"Adichunchanagiri Institute of Technology","Alva's Institute of Engineering and Technology","Bahubali College of Engineering","Bapuji Institute of Engineering and Technology",
		"Bearys Institute of Technology","Canara Engineering College","Coorg Institute of Technology","Yenepoya Institute of Technology",
		"G.M. Institute of Technology","Government Engineering College, Chamarajanagar","Government Engineering College, Hassan","Government Engineering College, Kushalnagar",
		"Government Engineering College, Mandya","Government Tool Room and Training Centre, Mysuru","GSSS Institute of Engineering and Technology for Women",
		"Jawaharlal Nehru National College of Engineering","K.V.G. College of Engineering","Karavali Institute of Technology", "Maharaja Institute of Technology, Mysore",
		"Mangalore Institute of Technology and Engineering","Moodlakatte Institute of Technology","NIE Institute of Technology",
		"P.A. College of Engineering","PES Institute of Technology and Management","Rajeev Institute of Technology",
		"Shree Devi Institute of Technology","SJM Institute of Technology","Sri Dharmasthala Manjunatheshwara Institute of Technology",
		"Sri Jayachamarajendra College of Engineering (Evening)","Srinivas Institute of Technology","Vidya Vikas Institute of Engineering and Technology",
		"Vivekananda College of Engineering and Technology","Navkis College of Engineering","Shri Madhwa Vadiraja Institute of Technology and Management","Academy for Technical and Management Excellence",
		"UBDT Engineering College, Davanagere","G. Madegowda Institute of Technology","Jain Institute of Technology","Mangalore Marine College and Technology",
		"Cauvery Institute of Technology","Mysore School of Architecture","Bearys Environment Architecture Design School","Mysore College of Engineering and Management",
		"Mysuru Royal Institute of Technology","Wadiyar Centre for Architecture", "Maharaja Institute of Technology","A.J. Institute of Engineering and Technology",
		"Government Engineering College, Mosale Hosahalli"};
  
		System.out.println("no. of colleges affilated : "+collegeNames.length);
		System.out.println("list of colleges:");
		
		for (String collegeName : collegeNames){
			System.out.println(collegeName);
		}
	}
}