class Refrigerator {

    static boolean isSwitchedOn;

    static int maxTemperature = 3;
    static int minTemperature;
    static int currentTemperature;

    public static void onOrOff() {

        if (isSwitchedOn == false) {
            isSwitchedOn = true;
            System.out.println("Refrigerator is ON... " + isSwitchedOn);
        } 
		else {
            isSwitchedOn = false;
            System.out.println("Refrigerator is OFF... " + isSwitchedOn);
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
            System.out.println("Turn ON the Refrigerator");
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
            System.out.println("Turn ON the Refrigerator");
        }
    }

    public static void main(String[] args) {

        System.out.println("Main Started");

        onOrOff();

        increaseTemperature();
        increaseTemperature();
        increaseTemperature();
        increaseTemperature();
        increaseTemperature();

        decreaseTemperature();
        decreaseTemperature();
        decreaseTemperature();

        onOrOff();

        increaseTemperature();

        System.out.println("Main Ended");
    }
}