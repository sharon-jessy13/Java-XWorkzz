class AirConditioner {

    static boolean isSwitchedOn;

    static int maxTemperature = 30;
    static int minTemperature =16;
    static int currentTemperature = 24;

    public static void onOrOff() {

        if (isSwitchedOn == false) {
			
            isSwitchedOn = true;
            System.out.println("AC is ON... " + isSwitchedOn);
			
        }
		else {
            isSwitchedOn = false;
            System.out.println("AC is OFF... " + isSwitchedOn);
        }
		
    }

    public static void increaseTemperature() {

        if (isSwitchedOn == true) {

            if (currentTemperature < maxTemperature) {
                currentTemperature = currentTemperature + 1;
                System.out.println("Current Temperature : " + currentTemperature + "°C");
            } 
			else {
                System.out.println("Maximum Temperature Reached");
            }

        }
		else {
            System.out.println("Turn ON the AC");
        }
    }

    public static void decreaseTemperature() {

        if (isSwitchedOn == true) {

            if (currentTemperature > minTemperature) {
                currentTemperature = currentTemperature - 1;
                System.out.println("Current Temperature : " + currentTemperature + "°C");
            } 
			else {
                System.out.println("Minimum Temperature Reached");
            }

        } 
		else {
            System.out.println("Turn ON the AC");
        }
    }

    public static void main(String ac[]) {

        System.out.println("main Started");

        onOrOff();

        increaseTemperature();
        increaseTemperature();
        increaseTemperature();

        decreaseTemperature();
        decreaseTemperature();

        onOrOff();

        increaseTemperature();

        System.out.println("main Ended");
		
    }
}