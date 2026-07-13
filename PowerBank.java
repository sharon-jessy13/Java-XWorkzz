class PowerBank {

    public static void main(String power[]) {
        getBrand();
        getModelNumber();
        getModelName();
        getSuitableDevice();
        getNumberOfOutputPorts();
        getChargingCableIncluded();
        getType();
        getBatteryType();
        getChargingType();
        getBatteryCapacity();
        getColor();
        getBrandColor();
        getPocketSize();
        getMaximumPowerOutput();
        getConnectors();
        getPowerSource();
        getAdditionalFeatures();

    }

    public static void getBrand() {
        String brand = "boAt";
        System.out.println("Brand: " + brand);
    }

    public static void getModelNumber() {
        String modelNumber = "EnergyShroom PB300 Activ";
        System.out.println("Model Number: " + modelNumber);
    }

    public static void getModelName() {
        String modelName = "EnergyShroom PB300 Activ";
        System.out.println("Model Name: " + modelName);
    }

    public static void getSuitableDevice() {
        String suitableDevice = "Mobile";
        System.out.println("Suitable Device: " + suitableDevice);
    }

    public static void getNumberOfOutputPorts() {
        int outputPorts = 3;
        System.out.println("Number of Output Ports: " + outputPorts);
    }

    public static void getChargingCableIncluded() {
        String chargingCableIncluded = "Yes";
        System.out.println("Charging Cable Included: " + chargingCableIncluded);
    }

    public static void getType() {
        String type = "Wired";
        System.out.println("Type: " + type);
    }

    public static void getBatteryType() {
        String batteryType = "Lithium Polymer";
        System.out.println("Battery Type: " + batteryType);
    }

    public static void getChargingType() {
        String chargingType = "Quick Charge 3.0, Fast Charging";
        System.out.println("Charging Type: " + chargingType);
    }

    public static void getBatteryCapacity() {
        int batteryCapacity = 10000;
        System.out.println("Battery Capacity: " + batteryCapacity + " mAh");
    }

    public static void getColor() {
        String color = "Pink";
        System.out.println("Color: " + color);
    }

    public static void getBrandColor() {
        String brandColor = "Pearl Pink";
        System.out.println("Brand Color: " + brandColor);
    }

    public static void getPocketSize() {
        String pocketSize = "Yes";
        System.out.println("Pocket Size: " + pocketSize);
    }

    public static void getMaximumPowerOutput() {
        double maximumPowerOutput = 22.5;
        System.out.println("Maximum Power Output: " + maximumPowerOutput + " W");
    }

    public static void getConnectors() {
        String connectors = "Type-A, Type-C";
        System.out.println("Connectors: " + connectors);
    }

    public static void getPowerSource() {
        String powerSource = "AC Adaptor";
        System.out.println("Power Source: " + powerSource);
    }

    public static void getAdditionalFeatures() {
        String additionalFeatures = "Slim";
        System.out.println("Additional Features: " + additionalFeatures);
    }

}