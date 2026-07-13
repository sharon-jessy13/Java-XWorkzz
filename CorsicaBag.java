class CorsicaBag{
	public static void main (String bag[]){
		
		getMaterial();
		getModelName();
		getPattern();
		getColor();
		getBrand();
		getIdealFor();
		getSlingStrap();
		getDimension();
		getNumberOfPockets();
		getClosure();
		getPackOf();
		getNetQuantity();
		getBrandColor();
		getOccasion();
		getType();
		
	}
	
	public static void getMaterial(){
		String name = "Jute";
		System.out.println("the material of the bag is: " + name);
	}
	public static void getModelName(){
		String name = "TOTE";
		System.out.println("the Model name of the bag is: " + name);
	}
	
	public static void getPattern(){
		String pattern = "Solid";
		System.out.println("the pattern of the bag is: " + pattern);
	}
	
	public static void getColor(){
		String color = "Brown";
		System.out.println("the color of the bag is: " + color);
	}
	
	public static void getBrand(){
		String name = "Corsica";
		System.out.println("the brand name of the bag is: " + name);
	}
	
	public static void getIdealFor(){
		String idealFor = "Women";
		System.out.println("Bag is Ideal For : " + idealFor);
	}
	public static void getSlingStrap(){
		String strap = "Non-Detachable Strap";
		System.out.println("the stap of bag is : " + strap);
	}
	
	public static void getDimension(){
		int width = 12;
		int heigth = 18;
		System.out.println("dimention of bag is : " + width + "x" + heigth);
	}
	
	public static void getNumberOfPockets() {
		int pockets = 1;
		System.out.println("Number of pockets in the bag is: " + pockets);
	}

	public static void getClosure() {
		String closure = "Zipper";
		System.out.println("The closure type of the bag is: " + closure);
	}

	public static void getPackOf() {
		int pack = 1;
		System.out.println("The bag comes in a pack of: " + pack);
	}

	public static void getNetQuantity() {
		int quantity = 1;
		System.out.println("The net quantity of the bag is: " + quantity);
	}

	public static void getBrandColor() {
		String color = "Brown";
		System.out.println("The brand color of the bag is: " + color);
	}

	public static void getOccasion() {
		String occasion = "Casual";
		System.out.println("The occasion suitable for the bag is: " + occasion);
	}

	public static void getType() {
		String type = "Tote";
		System.out.println("The type of the bag is: " + type);
	}
	
	
}