class CelloCanisterSet {

    public static int getPrice() {
	
        return 599;
    }

    public static String getBrand() {
	
        return "Cello";
    }

    public static String getModelName() {
	
        return "Checker PET Canister Set";
    }

    public static String getModelNumber() {
	
        return "8901372118176";
    }

    public static String getColor() {
	
        return "Clear";
    }

    public static String getBrandColor() {
	
        return "Clear";
    }

    public static boolean isDisposable() {
	
        return false;
    }

    public static String getShape() {
	
        return "Round";
    }

    public static boolean isNonStick() {
	
        return false;
    }

    public static String getCapacity() {
	
        return "300 ml, 650 ml, 1200 ml";
    }

    public static String getIdealUsage() {
	
        return "Grocery Container";
    }

    public static boolean isAirtight() {
	
        return true;
    }

    public static boolean isFragile() {
	
        return true;
    }

    public static String getMaterial() {
	
        return "Plastic";
    }

    public static String getSafetyFeatures() {
	
        return "BPA Free, Freezer Safe, Dishwasher Safe";
    }

    public static int getNetQuantity() {
	
        return 18;
    }

    public static String getKeyFeatures() {
	
        return "Easy To Open Lid: The containers have swift and easy to operate lid";
    }

    public static String getWeight() {
	
        return "500 g";
    }

    public static void main(String container[]) {

        int price = getPrice();

        String brand = getBrand();

        String modelName = getModelName();

        String modelNumber = getModelNumber();

        String color = getColor();

        String brandColor = getBrandColor();

        boolean disposable = isDisposable();

        String shape = getShape();

        boolean nonStick = isNonStick();

        String capacity = getCapacity();

        String idealUsage = getIdealUsage();

        boolean airtight = isAirtight();

        boolean fragile = isFragile();

        String material = getMaterial();

        String safetyFeatures = getSafetyFeatures();

        int netQuantity = getNetQuantity();

        String keyFeatures = getKeyFeatures();

        String weight = getWeight();
		
		
		

        System.out.println("Price : " + price);

        System.out.println("Brand : " + brand);

        System.out.println("Model Name : " + modelName);

        System.out.println("Model Number : " + modelNumber);

        System.out.println("Color : " + color);

        System.out.println("Brand Color : " + brandColor);

        System.out.println("Disposable : " + disposable);

        System.out.println("Shape : " + shape);

        System.out.println("Non-stick : " + nonStick);

        System.out.println("Capacity : " + capacity);

        System.out.println("Ideal Usage : " + idealUsage);

        System.out.println("Airtight : " + airtight);

        System.out.println("Is Fragile : " + fragile);

        System.out.println("Material : " + material);

        System.out.println("Safety Features : " + safetyFeatures);

        System.out.println("Net Quantity : " + netQuantity);

        System.out.println("Key Features : " + keyFeatures);

        System.out.println("Weight : " + weight);
		
		
    }
}