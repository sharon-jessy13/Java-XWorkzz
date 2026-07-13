class AuskTShirt {

    public static int getPrice(){
	   
	    return 291;
	}

    public static String getBrand() {
	
        return "AUSK";
    }

    public static String getType() {
	
        return "Polo Neck";
    }

    public static String getSleeve() {
	
        return "Half Sleeve";
		
    }

    public static String getFit() {
	
        return "Regular";
    }

    public static String getFabric() {
	
        return "Cotton Blend";
    }

    public static String getSalesPackage() {
	
        return "1-Tshirt";
    }

    public static int getPackOf() {
	
        return 1;
    }

    public static String getStyleCode() {
	
        return "AAWHJ-04052";
    }

    public static String getNeckType() {
	
        return "Polo Neck";
    }

    public static String getIdealFor() {
	
        return "Women";
    }

    public static String getSize() {
	
        return "S";
    }

    public static String getPattern() {
	
        return "Striped";
    }


    public static String getSuitableFor() {
	
        return "Western Wear";
    }

    public static boolean isReversible() {
	
        return false;
    }

    public static String getFabricCare() {
	
        return "Gentle Machine Wash";
    }

    public static int getNetQuantity() {
	
        return 1;
    }

    public static void main(String tshirt[]) {
	
	    int price = getPrice();

        String brand = getBrand();

        String type = getType();

        String sleeve = getSleeve();

        String fit = getFit();

        String fabric = getFabric();

        String salesPackage = getSalesPackage();

        int packOf = getPackOf();

        String styleCode = getStyleCode();

        String neckType = getNeckType();

        String idealFor = getIdealFor();

        String size = getSize();

        String pattern = getPattern();

        String suitableFor = getSuitableFor();

        boolean reversible = isReversible();

        String fabricCare = getFabricCare();

        int netQuantity = getNetQuantity();
		
		System.out.println("price : " + price);

        System.out.println("Brand : " + brand);

        System.out.println("Type : " + type);

        System.out.println("Sleeve : " + sleeve);

        System.out.println("Fit : " + fit);

        System.out.println("Fabric : " + fabric);

        System.out.println("Sales Package : " + salesPackage);

        System.out.println("Pack Of : " + packOf);

        System.out.println("Style Code : " + styleCode);

        System.out.println("Neck Type : " + neckType);

        System.out.println("Ideal For : " + idealFor);

        System.out.println("Size : " + size);

        System.out.println("Pattern : " + pattern);

        System.out.println("Suitable For : " + suitableFor);

        System.out.println("Reversible : " + reversible);

        System.out.println("Fabric Care : " + fabricCare);

        System.out.println("Net Quantity : " + netQuantity);
    }
}