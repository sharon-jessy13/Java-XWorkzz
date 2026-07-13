class TableLamp {

    public static void main(String tablamp[]) {
		
        getBrand();
        getModelNumber();
        getColor();
        getBrandColor();
        getModelName();
        getAssemblyRequired();
        getUsage();
        getFeatures();
        getLampTheme();
        getSuitableFor();
        getPowerSource();
        getLampType();
        getIsFragile();
        getNetQuantity();
        getKeyFeatures();
        getDimensions();
        getProductDetails();

    }

    public static void getBrand() {
        String brand = "Easymart";
        System.out.println("Brand: " + brand);
    }

    public static void getModelNumber() {
        String modelNumber = "Galaxy Crystal Ball Night";
        System.out.println("Model Number: " + modelNumber);
    }

    public static void getColor() {
        String color = "Multicolor";
        System.out.println("Color: " + color);
    }

    public static void getBrandColor() {
        String brandColor = "Multicolor";
        System.out.println("Brand Color: " + brandColor);
    }

    public static void getModelName() {
        String modelName = "Galaxy Crystal Ball Night Light, 2.4 inch Glass with Wooden Base";
        System.out.println("Model Name: " + modelName);
    }

    public static void getAssemblyRequired() {
        String assemblyRequired = "Yes";
        System.out.println("Assembly Required: " + assemblyRequired);
    }

    public static void getUsage() {
        String usage = "Decorative";
        System.out.println("Usage: " + usage);
    }

    public static void getFeatures() {
        String features = "Wireless Charger";
        System.out.println("Features: " + features);
    }

    public static void getLampTheme() {
        String lampTheme = "3D Glass Deco Ball";
        System.out.println("Lamp Theme: " + lampTheme);
    }

    public static void getSuitableFor() {
        String suitableFor = "Adults";
        System.out.println("Suitable For: " + suitableFor);
    }

    public static void getPowerSource() {
        String powerSource = "USB, Rechargeable Battery";
        System.out.println("Power Source: " + powerSource);
    }

    public static void getLampType() {
        String lampType = "Table Lamp";
        System.out.println("Lamp Type: " + lampType);
    }

    public static void getIsFragile() {
        String isFragile = "Yes";
        System.out.println("Is Fragile: " + isFragile);
    }

    public static void getNetQuantity() {
        int netQuantity = 1;
        System.out.println("Net Quantity: " + netQuantity);
    }

    public static void getKeyFeatures() {
        String keyFeatures = "3D Planetary Galaxy";
        System.out.println("Key Features: " + keyFeatures);
    }

    public static void getDimensions() {
        int width = 15;
        double height = 7.5;
        double diameter = 7.5;
        double weight = 0.35;

        System.out.println("Dimensions:");
        System.out.println("Width: " + width + " cm");
        System.out.println("Height: " + height + " cm");
        System.out.println("Diameter: " + diameter + " cm");
        System.out.println("Weight: " + weight + " g");
    }

    public static void getProductDetails() {
        String withShade = "Yes";
        String lampShadeMaterial = "Round";
        String powerRequirement = "2v";
        String lightColor = "Multicolor";
        String batteryType = "USB Powered";
        String lampBodyMaterial = "Crystal";

        System.out.println("Product Details:");
        System.out.println("With Shade: " + withShade);
        System.out.println("Lamp Shade Material: " + lampShadeMaterial);
        System.out.println("Power Requirement: " + powerRequirement);
        System.out.println("Light Color: " + lightColor);
        System.out.println("Battery Type: " + batteryType);
        System.out.println("Lamp Body Material: " + lampBodyMaterial);
    }

}