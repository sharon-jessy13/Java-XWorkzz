class HeadSetExecutor {
	
	public static void main (String realme[]){
		
		System.out.println("main started");
		
		System.out.println(HeadSet.isConnected);
		
		HeadSet.onOrOff();
		HeadSet.increaseVol();
		HeadSet.increaseVol();
		
		HeadSet.onOrOff();
		HeadSet.increaseVol();
		
		HeadSet.onOrOff();
		HeadSet.decreaseVol();
		
		
		System.out.println("main ended");
		
	}
}