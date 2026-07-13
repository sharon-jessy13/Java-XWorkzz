class MinimalistSunscreen {

    public static int getPrice() {
	
        return 331;
    }

    public static int getPackOf() {
	
        return 1;
    }

    public static String getSalesPackage() {
	
        return "1 Sunscreen Tube";
    }

    public static String getBrand() {
	
        return "Minimalist";
    }


    public static String getModelName() {
	
        return "SPF 50 PA++++ Light Fluid Sunscreen for Men & Women | Sun Cream for Oily Skin";
    }

    public static String getQuantity() {
	
        return "30 ml";
    }

    public static String getPARating() {
	
        return "PA++++";
    }

    public static String getSkinType() {
	
        return "All Skin Types, Combination Skin, Dry Skin, Normal Skin, Oily Skin, Sensitive Skin";
    }

    public static int getSPFRating() {
	
        return 50;
    }

    public static String getFormulation() {
	
        return "Gel";
    }

    public static String getIdealFor() {
	
        return "Men & Women";
    }

    public static String getNetQuantity() {
	
        return "30 ml";
    }

    public static void main(String sunscreen[]) {

        int price = getPrice();

        int packOf = getPackOf();

        String salesPackage = getSalesPackage();

        String brand = getBrand();

        String modelName = getModelName();

        String quantity = getQuantity();

        String paRating = getPARating();

        String skinType = getSkinType();

        int spfRating = getSPFRating();

        String formulation = getFormulation();

        String idealFor = getIdealFor();

        String netQuantity = getNetQuantity();
		
		

        System.out.println("Price : " + price);

        System.out.println("Pack Of : " + packOf);

        System.out.println("Sales Package : " + salesPackage);

        System.out.println("Brand : " + brand);

        System.out.println("Model Name : " + modelName);

        System.out.println("Quantity : " + quantity);

        System.out.println("PA Rating : " + paRating);

        System.out.println("Skin Type : " + skinType);

        System.out.println("SPF Rating : " + spfRating);

        System.out.println("Formulation : " + formulation);

        System.out.println("Ideal For : " + idealFor);

        System.out.println("Net Quantity : " + netQuantity);
    }
}