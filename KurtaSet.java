class KurtaSet{
	
	public static void main(String kurtha[]) {
		
		getItemsIncluded();
		getBrand();
		getFabric();
		getAdditionalGarments();
		getStyleCode();
		getSecondaryColor();
		getLiningMaterial();
		getTopFabric();
		getBottomFabric();
		getTopType();
		getBottomType();
		
		
	}


	public static void getItemsIncluded() {
		String items = "1 Kurta, 1 Pant, 1 Dupatta";
		System.out.println("Items included in the box are: " + items);
	}

	public static void getBrand() {
		String brand = "W E A R I A L";
		System.out.println("The brand of the dress is: " + brand);
	}

	public static void getFabric() {
		String fabric = "Georgette";
		System.out.println("The fabric of the dress is: " + fabric);
	}

	public static void getAdditionalGarments() {
			String garments = "Dupatta";
		System.out.println("Additional garment included: " + garments);
	}

	public static void getStyleCode() {
		String styleCode = "mumtaaz";
		System.out.println("The style code is: " + styleCode);
	}

	public static void getSecondaryColor() {
		String secondaryColor = "Black";
		System.out.println("The secondary color is: " + secondaryColor);
	}

	public static void getLiningMaterial() {
		String liningMaterial = "Crepe Soft, lightweight, comfortable, suitable for georgette tops.";
		System.out.println("The lining material is: " + liningMaterial);
	}

	public static void getTopFabric() {
		String topFabric = "Georgette";
		System.out.println("The top fabric is: " + topFabric);
	}

	public static void getBottomFabric() {
		String bottomFabric = "Silk";
		System.out.println("The bottom fabric is: " + bottomFabric);
	}

	public static void getTopType() {
		String topType = "Kurta";
		System.out.println("The top type is: " + topType);
	}

	public static void getBottomType() {
		String bottomType = "Pant";
		System.out.println("The bottom type is: " + bottomType);
	}
	
	
}