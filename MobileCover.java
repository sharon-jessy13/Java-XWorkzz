class MobileCover {

    public static void main(String mob[]) {
        getSalesPackage();
        getModelNumber();
        getDesignedFor();
        getBrandColor();
        getNetQuantity();
        getPackOf();
        getCertification();
        getOtherFeatures();
		
    }

    public static void getSalesPackage() {
        String salesPackage = "1 Back Cover";
        System.out.println("The sales package contains: " + salesPackage);
    }

    public static void getModelNumber() {
        String modelNumber = "Pink Trending Flowers Beach sand design phone back cover D16689-A512";
        System.out.println("The model number is: " + modelNumber);
    }

    public static void getDesignedFor() {
        String designedFor = "Samsung Galaxy M14 5G";
        System.out.println("The back cover is designed for: " + designedFor);
    }

    public static void getBrandColor() {
        String brandColor = "Multicolor";
        System.out.println("The brand color is: " + brandColor);
    }

    public static void getNetQuantity() {
        int quantity = 1;
        System.out.println("The net quantity is: " + quantity);
    }

    public static void getPackOf() {
        int pack = 1;
        System.out.println("The product comes in a pack of: " + pack);
    }

    public static void getCertification() {
        String certification = "iCopertina";
        System.out.println("The certification is: " + certification);
    }

    public static void getOtherFeatures() {
        String features = "Stylish Back Cover for girls and boys, Precise Cut outs, Perfectly fits the phone";
        System.out.println("Other features: " + features);
    }
	
	
}