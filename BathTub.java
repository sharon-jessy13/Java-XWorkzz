class BathTub {
	
    public static void main(String tub[]) {
		
        getSalesPackage();
        getBrand();
        getType();
        getColor();
        getWeightSupported();
        getDeflatable();
        getModelName();
        getModelID();
        getIdealFor();
        getDimensions();
        getMaterial();
		
		
    }

    public static void getSalesPackage() {
        String salesPackage = "Swimming Pool with Electric Pump";
        System.out.println("The sales package contains: " + salesPackage);
    }

    public static void getBrand() {
        String brand = "PISCINA";
        System.out.println("The brand of the swimming pool is: " + brand);
    }

    public static void getType() {
        String type = "Swimming Pool";
        System.out.println("The type of the product is: " + type);
    }

    public static void getColor() {
        String color = "Blue";
        System.out.println("The color of the swimming pool is: " + color);
    }

    public static void getWeightSupported() {
        int weightSupported = 120;
        System.out.println("The maximum weight supported is: " + weightSupported + " kg");
    }

    public static void getDeflatable() {
        String deflatable = "Yes";
        System.out.println("Deflatable: " + deflatable);
    }

    public static void getModelName() {
        String modelName = "Pool Inflatable Bath Tubs for Kids & Adults Spa 8.5 Feet";
        System.out.println("The model name is: " + modelName);
    }

    public static void getModelID() {
        String modelID = "bth-tub-10fts";
        System.out.println("The model ID is: " + modelID);
    }

    public static void getIdealFor() {
        String idealFor = "Adults";
        System.out.println("Ideal for: " + idealFor);
    }

    public static void getDimensions() {
        int width = 170;
        double height = 0.9;
        double depth = 0.5;
        int weight = 4000;

        System.out.println("Dimensions: " + width + " cm x " + height + " m x " + depth + " m");
        System.out.println("Weight: " + weight + " g");
    }

    public static void getMaterial() {
        String material = "PVC";
        System.out.println("The material of the swimming pool is: " + material);
    }
	
	
}