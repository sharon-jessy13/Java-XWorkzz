class DancingCactus {

    public static String getSalesPackage() {

        return "1 Toy, 1 USB Cable";
    }

    public static String getBrand() {

        return "Aganta";
    }

    public static String getModelName() {

        return "Dancing Cactus with Lights Up Talking Singing Toy";
    }

    public static String getColor() {

        return "Green, Brown";
    }

    public static String getType() {

        return "Musical Box";
    }

    public static String getIdealFor() {

        return "Baby Boys";
    }

    public static String getSkillSet() {

        return "Speaking Skills, Analysis & Critical Thinking, Sensory Development, "
                + "Rhythm & Pattern Recognition, Creativity & Imagination, "
                + "Curiosity Building, Attention Span Building, Social Skills";
    }

    public static int getMinimumAge() {

        return 1;
    }

    public static String getCharacter() {

        return "Cactus";
    }

    public static boolean isAssemblyRequired() {

        return false;
    }

    public static String getMaterial() {

        return "Wool";
    }

    public static boolean hasSound() {

        return true;
    }

    public static boolean hasLights() {

        return true;
    }

    public static String getSuitableForGifting() {

        return "Gift";
    }

    public static String getNetQuantity() {

        return "1 Toy, 1 USB Cable";
    }

    public static String getAdditionalFeatures() {

        return "The toy can dance, sing, move, turn around. "
                + "Suitable for parties and home decoration. "
                + "Rechargeable and a great gift for kids.";
    }

    public static String getImportantNote() {

        return "The color of some product parts may vary from the image.";
    }

    public static String getDimensions() {

        return "Product -> Width: 20 cm, Height: 20 cm, Depth: 2 cm, Weight: 250 g\n"
                + "Box -> Width: 20 cm, Height: 4 cm, Depth: 2 cm, Weight: 300 g";
    }

    public static boolean isBatteryOperated() {

        return false;
    }

    public static String getBatteryType() {

        return "0 No Batteries";
    }

    public static boolean isRechargeable() {

        return true;
    }

    public static void main(String toy[]) {

        String salesPackage = getSalesPackage();

        String brand = getBrand();

        String modelName = getModelName();

        String color = getColor();

        String type = getType();

        String idealFor = getIdealFor();

        String skillSet = getSkillSet();

        int minimumAge = getMinimumAge();

        String character = getCharacter();

        boolean assemblyRequired = isAssemblyRequired();

        String material = getMaterial();

        boolean sound = hasSound();

        boolean lights = hasLights();

        String suitableForGifting = getSuitableForGifting();

        String netQuantity = getNetQuantity();

        String additionalFeatures = getAdditionalFeatures();

        String importantNote = getImportantNote();

        String dimensions = getDimensions();

        boolean batteryOperated = isBatteryOperated();

        String batteryType = getBatteryType();

        boolean rechargeable = isRechargeable();
		
		

        System.out.println("Sales Package : " + salesPackage);

        System.out.println("Brand : " + brand);

        System.out.println("Model Name : " + modelName);

        System.out.println("Color : " + color);

        System.out.println("Type : " + type);

        System.out.println("Ideal For : " + idealFor);

        System.out.println("Skill Set : " + skillSet);

        System.out.println("Minimum Age : " + minimumAge + " year");

        System.out.println("Character : " + character);

        System.out.println("Assembly Required : " + assemblyRequired);

        System.out.println("Material : " + material);

        System.out.println("Sound : " + sound);

        System.out.println("Lights : " + lights);

        System.out.println("Suitable for Gifting : " + suitableForGifting);

        System.out.println("Net Quantity : " + netQuantity);

        System.out.println("Additional Features : " + additionalFeatures);

        System.out.println("Important Note : " + importantNote);

        System.out.println("Dimensions : " + dimensions);

        System.out.println("Battery Operated : " + batteryOperated);

        System.out.println("Battery Type : " + batteryType);

        System.out.println("Rechargeable : " + rechargeable);
		
		
    }

}