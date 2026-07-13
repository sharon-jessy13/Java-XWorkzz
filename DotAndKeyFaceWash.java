class DotAndKeyFaceWash {

    public static String getBrand() {
		
        return "Dot & Key";
    }

    public static String getQuantity() {
		
        return "75 ml";
    }

    public static String getFaceWashType() {
		
        return "Gel";
    }

    public static String getModelName() {
		
        return "Vitamin C + E Super Bright Gel For Glowing And Brightening Skin | All Skin Type |";
    }

    public static String getIdealFor() {
		
		
        return "Men & Women";
    }

    public static int getMaximumShelfLife() {
		
        return 36;
    }

    public static String getAppliedFor() {
		
        return "Anti-dullness, Cleansing, Deep Cleansing, Radiance & Glow, "
                + "Skin Brightening, Tan Removal, Uneven Skin Tone";
    }

    public static String getSkinType() {
		
        return "All Skin Types";
    }

    public static String getContainerType() {
		
        return "Tube";
    }

    public static String getType() {
		
        return "Facewash";
    }

    public static String getUsage() {
		
        return "All Day";
    }

    public static String getManufacturingProcess() {
		
        return "Sulphate/Paraben Free";
    }

    public static String getNetQuantity() {
		
        return "75 ml";
    }

    public static int getPackOf() {
		
        return 1;
    }

    public static String getOtherTraits() {
		
        return "Deeply cleanses without overdrying, Reduces dullness & boosts glow, "
                + "Minimizes pigmentation & dark spots, Infused with 3 types of Vitamin C, "
                + "Gentle, sulphate-free formulation";
    }

    public static void main(String faceWash[]) {

        String brand = getBrand();

        String quantity = getQuantity();

        String faceWashType = getFaceWashType();

        String modelName = getModelName();

        String idealFor = getIdealFor();

        int maximumShelfLife = getMaximumShelfLife();

        String appliedFor = getAppliedFor();

        String skinType = getSkinType();

        String containerType = getContainerType();

        String type = getType();

        String usage = getUsage();

        String manufacturingProcess = getManufacturingProcess();

        String netQuantity = getNetQuantity();

        int packOf = getPackOf();

        String otherTraits = getOtherTraits();

        System.out.println("Brand : " + brand);

        System.out.println("Quantity : " + quantity);

        System.out.println("Face Wash Type : " + faceWashType);

        System.out.println("Model Name : " + modelName);

        System.out.println("Ideal For : " + idealFor);

        System.out.println("Maximum Shelf Life : " + maximumShelfLife + " Months");

        System.out.println("Applied For : " + appliedFor);

        System.out.println("Skin Type : " + skinType);

        System.out.println("Container Type : " + containerType);

        System.out.println("Type : " + type);

        System.out.println("Usage : " + usage);

        System.out.println("Manufacturing Process : " + manufacturingProcess);

        System.out.println("Net Quantity : " + netQuantity);

        System.out.println("Pack Of : " + packOf);

        System.out.println("Other Traits : " + otherTraits);
    }
}