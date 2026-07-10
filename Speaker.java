class Speaker {

    static boolean isSwitchedOn;

    static int maxVolume = 10;
    static int minVolume = 0;
    static int currentVolume = 0;

    public static void onOrOff() {

        if (isSwitchedOn == false) {
            isSwitchedOn = true;
            System.out.println("Speaker is ON... " + isSwitchedOn);
        } 
		else {
            isSwitchedOn = false;
            System.out.println("Speaker is OFF... " + isSwitchedOn);
        }
    }

    public static void increaseVolume() {

        if (isSwitchedOn == true) {

            if (currentVolume < maxVolume) {
                currentVolume = currentVolume + 1;
                System.out.println("Current Volume : " + currentVolume);
            } 
			else {
                System.out.println("Maximum Volume Reached");
            }

        }
		else {
            System.out.println("Turn ON the Speaker");
        }
    }

    public static void decreaseVolume() {

        if (isSwitchedOn == true) {

            if (currentVolume > minVolume) {
                currentVolume = currentVolume - 1;
                System.out.println("Current Volume : " + currentVolume);
            }
			else {
                System.out.println("Minimum Volume Reached");
            }

        } 
		else {
            System.out.println("Turn ON the Speaker");
        }
    }

    public static void main(String[] args) {

        System.out.println("Main Started");

        onOrOff();

        increaseVolume();
        increaseVolume();
        increaseVolume();
        increaseVolume();
        increaseVolume();
        increaseVolume();
        increaseVolume();
        increaseVolume();
        increaseVolume();
        increaseVolume();
        increaseVolume();

        decreaseVolume();
        decreaseVolume();
        decreaseVolume();

        onOrOff();

        increaseVolume();

        System.out.println("Main Ended");
    }
}