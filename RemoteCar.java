class RemoteCar {
	
    public static void main(String car[]) {
        getBatteryOperated();
        getRemoteControlRange();
        getSalesPackage();
        getBrand();
        getModelName();
        getType();
        getBrandColor();
        getRechargeable();
        getCharacter();
        getAssemblyRequired();
        getIdealFor();
        getScale();
        getMaterial();
        getMinimumAge();
        getMaximumAge();
        getSkillSet();
        getGiftPack();
        getLights();
        getSoundSupport();
        getBatteryType();
        getDimensions();
		
    }

    public static void getBatteryOperated() {
        String batteryOperated = "Yes";
        System.out.println("Battery operated: " + batteryOperated);
    }

    public static void getRemoteControlRange() {
        int range = 10;
        System.out.println("The remote control range is: " + range + " m");
    }

    public static void getSalesPackage() {
        String salesPackage = "1 Remote Control Car, 1 Remote Controller, 1 Battery, 1 Cable";
        System.out.println("The sales package contains: " + salesPackage);
    }

    public static void getBrand() {
        String brand = "CADDLE & TOES";
        System.out.println("The brand of the toy car is: " + brand);
    }

    public static void getModelName() {
        String modelName = "Rock Car, Spring Wheels, 1:20 Scale, Remote Control";
        System.out.println("The model name is: " + modelName);
    }

    public static void getType() {
        String type = "Remote Control Car";
        System.out.println("The type of the toy is: " + type);
    }

    public static void getBrandColor() {
        String brandColor = "Multicolor";
        System.out.println("The brand color is: " + brandColor);
    }

    public static void getRechargeable() {
        String rechargeable = "Yes";
        System.out.println("Rechargeable: " + rechargeable);
    }

    public static void getCharacter() {
        String character = "MONSTER CRAWLER";
        System.out.println("The character is: " + character);
    }

    public static void getAssemblyRequired() {
        String assembly = "No";
        System.out.println("Assembly required: " + assembly);
    }

    public static void getIdealFor() {
        String idealFor = "Boys";
        System.out.println("Ideal for: " + idealFor);
    }

    public static void getScale() {
        String scale = "1:20";
        System.out.println("The scale of the toy is: " + scale);
    }

    public static void getMaterial() {
        String material = "Plastic";
        System.out.println("The material of the toy is: " + material);
    }

    public static void getMinimumAge() {
        int minAge = 3;
        System.out.println("Minimum age: " + minAge + " years");
    }

    public static void getMaximumAge() {
        int maxAge = 735;
        System.out.println("Maximum age: " + maxAge + " months");
    }

    public static void getSkillSet() {
        String skillSet = "Social Skills, Creativity & Imagination, Object Recognition, Hand & Eye Coordination";
        System.out.println("Skill set: " + skillSet);
    }

    public static void getGiftPack() {
        String giftPack = "Yes";
        System.out.println("Gift pack available: " + giftPack);
    }

    public static void getLights() {
        String lights = "Yes";
        System.out.println("Lights available: " + lights);
    }

    public static void getSoundSupport() {
        String soundSupport = "No";
        System.out.println("Sound support: " + soundSupport);
    }

    public static void getBatteryType() {
        String batteryType = "3 x AAA Batteries";
        System.out.println("Battery type: " + batteryType);
    }

    public static void getDimensions() {
        int width = 10;
        int height = 10;
        int depth = 20;
        int weight = 400;

        System.out.println("Dimensions: " + width + " cm x " + height + " cm x " + depth + " cm");
        System.out.println("Weight: " + weight + " g");
    }


}