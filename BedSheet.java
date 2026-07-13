class Bedsheet {

    public static void main(String bedsheet[]) {

        getBrand();
        getBrandColor();
        getColor();
        getType();
        getSize();
        getMaterial();
        getThreadCount();
        getModelName();
        getModelID();
        getPattern();
        getNetQuantity();
        getIdealFor();
        getDimensions();


    }

    public static void getBrand() {
        String brand = "Fashion String";
        System.out.println("Brand: " + brand);
    }

    public static void getBrandColor() {
        String brandColor = "Brown";
        System.out.println("Brand Color: " + brandColor);
    }

    public static void getColor() {
        String color = "Brown, White";
        System.out.println("Color: " + color);
    }

    public static void getType() {
        String type = "Flat";
        System.out.println("Type: " + type);
    }

    public static void getSize() {
        String size = "Single";
        System.out.println("Size: " + size);
    }

    public static void getMaterial() {
        String material = "Microfiber";
        System.out.println("Material: " + material);
    }

    public static void getThreadCount() {
        int threadCount = 120;
        System.out.println("Thread Count: " + threadCount);
    }

    public static void getModelName() {
        String modelName = "Bedsheet";
        System.out.println("Model Name: " + modelName);
    }

    public static void getModelID() {
        String modelID = "FSSBS002318_Single";
        System.out.println("Model ID: " + modelID);
    }

    public static void getPattern() {
        String pattern = "Floral";
        System.out.println("Pattern: " + pattern);
    }

    public static void getNetQuantity() {
        int netQuantity = 1;
        System.out.println("Net Quantity: " + netQuantity);
    }

    public static void getIdealFor() {
        String idealFor = "Adults";
        System.out.println("Ideal For: " + idealFor);
    }

    public static void getDimensions() {
        int widthInch = 55;
        int widthCm = 140;
        int lengthInch = 86;
        int lengthCm = 220;

        System.out.println("Dimensions:");
        System.out.println("Flat Sheet Width: " + widthInch + " inch / " + widthCm + " cm");
        System.out.println("Flat Sheet Length: " + lengthInch + " inch / " + lengthCm + " cm");
    }


}