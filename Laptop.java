class Laptop {

    static boolean isSwitchedOn;

    static int maxBrightness = 10;
    static int minBrightness = 0;
    static int currentBrightness = 0;

    public static void onOrOff() {

        if (isSwitchedOn == false) {
            isSwitchedOn = true;
            System.out.println("Laptop is ON... " + isSwitchedOn);
        } 
		else {
            isSwitchedOn = false;
            System.out.println("Laptop is OFF... " + isSwitchedOn);
        }
    }

    public static void increaseBrightness() {

        if (isSwitchedOn == true) {

            if (currentBrightness < maxBrightness) {
                currentBrightness = currentBrightness + 1;
                System.out.println("Current Brightness : " + currentBrightness);
            }
			else {
                System.out.println("Maximum Brightness Reached");
            }

        } 
		else {
            System.out.println("Turn ON the Laptop");
        }
    }

    public static void decreaseBrightness() {

        if (isSwitchedOn == true) {

            if (currentBrightness > minBrightness) {
                currentBrightness = currentBrightness - 1;
                System.out.println("Current Brightness : " + currentBrightness);
            }
			else {
                System.out.println("Minimum Brightness Reached");
            }

        } 
		else {
            System.out.println("Turn ON the Laptop");
        }
    }

    public static void main(String[] args) {

        System.out.println("Main Started");

        onOrOff();

        increaseBrightness();
        increaseBrightness();
        increaseBrightness();
		
		onOrOff();
		
        increaseBrightness();
		
		onOrOff();
		
		
        increaseBrightness();

        decreaseBrightness();
        decreaseBrightness();

        onOrOff();

        increaseBrightness();

        System.out.println("Main Ended");
    }
}