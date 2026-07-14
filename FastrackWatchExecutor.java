class FastrackWatchExecutor {
	
	public static void main(String watch[]) {

        int price = FastrackWatch.getPrice();

        String brand = FastrackWatch.getBrand();

        String displayType = FastrackWatch.getDisplayType();

        String idealFor = FastrackWatch.getIdealFor();

        String mechanism = FastrackWatch.getMechanism();

        String styleCode = FastrackWatch.getStyleCode();

        String series = FastrackWatch.getSeries();

        String occasion = FastrackWatch.getOccasion();

        String movement = FastrackWatch.getMovement();

        int packOf = FastrackWatch.getPackOf();

        String salesPackage = FastrackWatch.getSalesPackage();

        boolean shockResistance = FastrackWatch.isShockResistance();

        String modelName = FastrackWatch.getModelName();

        String strapColor = FastrackWatch.getStrapColor();

        int netQuantity = FastrackWatch.getNetQuantity();

        String trend = FastrackWatch.getTrend();

        String watchFeatures = FastrackWatch.getWatchFeatures();
		
		

        System.out.println("Price : " + price);

        System.out.println("Brand : " + brand);

        System.out.println("Display Type : " + displayType);

        System.out.println("Ideal For : " + idealFor);

        System.out.println("Mechanism : " + mechanism);

        System.out.println("Style Code : " + styleCode);

        System.out.println("Series : " + series);

        System.out.println("Occasion : " + occasion);

        System.out.println("Movement : " + movement);

        System.out.println("Pack Of : " + packOf);

        System.out.println("Sales Package : " + salesPackage);

        System.out.println("Shock Resistance : " + shockResistance);

        System.out.println("Model Name : " + modelName);

        System.out.println("Strap Color : " + strapColor);

        System.out.println("Net Quantity : " + netQuantity);

        System.out.println("Trend : " + trend);

        System.out.println("Watch Features : " + watchFeatures);
    }
}