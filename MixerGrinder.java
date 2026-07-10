class MixerGrinder {

    static boolean isSwitchedOn;

    static int maxSpeed = 5;
    static int minSpeed ;
    static int currentSpeed ;

    public static void onOrOff() {

        if (isSwitchedOn == false) {
            isSwitchedOn = true;
            System.out.println("Mixer Grinder is ON... " + isSwitchedOn);
        } 
		else {
            isSwitchedOn = false;
            System.out.println("Mixer Grinder is OFF... " + isSwitchedOn);
        }
		
    }

    public static void increaseSpeed() {

        if (isSwitchedOn == true) {

            if (currentSpeed < maxSpeed) {
                currentSpeed = currentSpeed + 1;
                System.out.println("Current Speed : " + currentSpeed);
            } 
			else {
                System.out.println("Maximum Speed Reached");
            }

        }
		else {
            System.out.println("Turn ON the Mixer Grinder");
        }
    }

    public static void decreaseSpeed() {

        if (isSwitchedOn == true) {

            if (currentSpeed > minSpeed) {
                currentSpeed = currentSpeed - 1;
                System.out.println("Current Speed : " + currentSpeed);
            } 
			else {
                System.out.println("Minimum Speed Reached");
            }

        } 
		else {
            System.out.println("Turn ON the Mixer Grinder");
        }
    }

    public static void main(String[] args) {

        System.out.println("Main Started");

        onOrOff();

        increaseSpeed();
        increaseSpeed();
        increaseSpeed();
        increaseSpeed();
		
		onOrOff();
		
        increaseSpeed();
		
		onOrOff();
		
        increaseSpeed();

        decreaseSpeed();
        decreaseSpeed();
        decreaseSpeed();

        onOrOff();

        increaseSpeed();

        System.out.println("Main Ended");
    }
}