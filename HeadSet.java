class HeadSet{
	
	static boolean isConnected ;
	
	static int maxVolume =10;
	static int currentVolume ;
	static int minVolume;
	
	public static void onOrOff(){
		
		if (isConnected == false){
			isConnected = true;
			System.out.println("HeadSet is connected...");
		}
		else{
			isConnected = false;
			System.out.println("Headset is disconnected...");
		}
	}
	
	public static void increaseVol(){
		
		if (isConnected == true){
			
			if (currentVolume < maxVolume){
				currentVolume = currentVolume+1;
				System.out.println("current volume is : " + currentVolume);
			}
			else{
				System.out.println("max volume reached");
			}
			
		}
		else{
			System.out.println("turn on the head  set");
		}
	}
	
	
	public static void decreaseVol(){
		
		if (isConnected != false){
			
			if (currentVolume > minVolume){
				currentVolume -= 1;
				System.out.println("current volume is : " + currentVolume);
			}
			else{
				System.out.println("min volume reached");
			}
		}
		else{
			System.out.println("turn on the head  set");
		}
	}
	
	

}