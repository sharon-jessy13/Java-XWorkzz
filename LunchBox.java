class LunchBox {

    public static void main(String lbox[]) {
        getBrand();
        getModelName();
        getColor();
        getLunchBoxMaterial();
        getLunchBoxCapacity();
        getNumberOfContainers();
        getIdealUsage();
        getThermoware();
        getLeakResistant();
        getCertification();
        getNetQuantity();
        getOtherFeatures();

    }

    public static void getBrand() {
        String brand = "NAVTAN";
        System.out.println("Brand: " + brand);
    }

    public static void getModelName() {
        String modelName = "Kawaii Bear Family 3 Section Stainless Steel Lunch Box With Spoon & Chopsticks";
        System.out.println("Model Name: " + modelName);
    }

    public static void getColor() {
        String color = "Bear Green";
        System.out.println("Color: " + color);
    }

    public static void getLunchBoxMaterial() {
        String lunchBoxMaterial = "Stainless Steel";
        System.out.println("Lunch Box Material: " + lunchBoxMaterial);
    }

    public static void getLunchBoxCapacity() {
        int lunchBoxCapacity = 750;
        System.out.println("Lunch Box Capacity: " + lunchBoxCapacity + " ml");
    }

    public static void getNumberOfContainers() {
        int numberOfContainers = 3;
        System.out.println("Number of Containers: " + numberOfContainers);
    }

    public static void getIdealUsage() {
        String idealUsage = "School";
        System.out.println("Ideal Usage: " + idealUsage);
    }

    public static void getThermoware() {
        boolean thermoware = true;
        System.out.println("Thermoware: " + thermoware);
    }

    public static void getLeakResistant() {
        boolean leakResistant = true;
        System.out.println("Leak Resistant: " + leakResistant);
    }

    public static void getCertification() {
        String certification = "Bureau of Indian Standards (BIS) Certification";
        System.out.println("Certification: " + certification);
    }

    public static void getNetQuantity() {
        int netQuantity = 1;
        System.out.println("Net Quantity: " + netQuantity);
    }

    public static void getOtherFeatures() {
        String otherFeatures = "Unbreakable, BPA Free";
        System.out.println("Other Features: " + otherFeatures);
    }

}