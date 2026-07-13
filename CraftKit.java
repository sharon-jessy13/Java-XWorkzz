class CraftKit {

    public static void main(String kit[]) {
        getBrand();
        getModelName();
        getBrandColor();
        getType();
        getMinimumAge();
        getImportantNote();
		
		
    }

    public static void getBrand() {
        String brand = "LITTLE BIRDIE";
        System.out.println("Brand: " + brand);
    }

    public static void getModelName() {
        String modelName = "DIY Build a Mini Cottage Kit";
        System.out.println("Model Name: " + modelName);
    }

    public static void getBrandColor() {
        String brandColor = "Brown";
        System.out.println("Brand Color: " + brandColor);
    }

    public static void getType() {
        String type = "Craft Kits";
        System.out.println("Type: " + type);
    }

    public static void getMinimumAge() {
        int minimumAge = 5;
        System.out.println("Minimum Age: " + minimumAge + " years");
    }

    public static void getImportantNote() {
        String importantNote = "The color of some product parts may vary from what is shown in the image.";
        System.out.println("Important Note: " + importantNote);
    }
	
	
}