class Television {
	
	static boolean isSwitchedOn;
	
	static int maxVolume = 10;
	static int minVolume;
	static int currentVolume;
	
	public static void onOrOff() {
		
		if(isSwitchedOn == false){
			isSwitchedOn = true;
			System.out.println("T V is on.." + isSwitchedOn);
		}
		
		else{
			isSwitchedOn = false;
			System.out.println("T V is off.." + isSwitchedOn);
		}
		
	}
	
	public static void increaseVolume(){
		
		if (isSwitchedOn == true){
			
			if (currentVolume < maxVolume){
				currentVolume = currentVolume+1;
				System.out.println("current volume is : " + currentVolume);
			}
			else{
				System.out.println("max volume reached");
			}
			
		}
		else{
			System.out.println("turn on the TV");
		}
	}
	
	public static void decreaseVolume() {
		if (isSwitchedOn == true){
			
			if (currentVolume > minVolume){
				currentVolume = currentVolume-1;
				System.out.println("current volume is : " + currentVolume);
			}
			else{
				System.out.println("min volume reached");
			}
		}
		else{
			System.out.println("turn on the TV");
		}
	}
	
	
	public static void main(String tv[]){
		
		System.out.println("main started");
		
		onOrOff();
		onOrOff();
		
		increaseVolume();
		
		onOrOff();
		
		increaseVolume();
		increaseVolume();
		increaseVolume();
		increaseVolume();
		
		onOrOff();
		
		decreaseVolume();
		
		onOrOff();
		
		decreaseVolume();
		
		
		System.out.println("main ended");
		
	}
}