class Diary {

    public static void main(String dairy[]) {
	
	
        getSalesPackage();
        getBrand();
        getColor();
        getModelID();
        getDiaryNotebookType();
        getType();
        getDated();
        getBookmark();
        getGSM();
        getCoverType();
        getRuling();
        getCalendarYear();
        getDimensions();

    }

    public static void getSalesPackage() {
        String salesPackage = "1 Diary";
        System.out.println("Sales Package: " + salesPackage);
    }

    public static void getBrand() {
        String brand = "MOHAMMAD HANDICRAFTS";
        System.out.println("Brand: " + brand);
    }

    public static void getColor() {
        String color = "Multicolor";
        System.out.println("Color: " + color);
    }

    public static void getModelID() {
        String modelID = "MH-4029";
        System.out.println("Model ID: " + modelID);
    }

    public static void getDiaryNotebookType() {
        String diaryNotebookType = "Handcrafted";
        System.out.println("Diary Notebook Type: " + diaryNotebookType);
    }

    public static void getType() {
        String type = "Diary";
        System.out.println("Type: " + type);
    }

    public static void getDated() {
        String dated = "No";
        System.out.println("Dated: " + dated);
    }

    public static void getBookmark() {
        String bookmark = "No";
        System.out.println("Bookmark: " + bookmark);
    }

    public static void getGSM() {
        int gsm = 115;
        System.out.println("GSM: " + gsm + " gsm");
    }

    public static void getCoverType() {
        String coverType = "Hard Cover";
        System.out.println("Cover Type: " + coverType);
    }

    public static void getRuling() {
        String ruling = "Plain";
        System.out.println("Ruling: " + ruling);
    }

    public static void getCalendarYear() {
        String calendarYear = "No";
        System.out.println("Calendar Year: " + calendarYear);
    }

    public static void getDimensions() {
        double width = 1.25;
        int height = 7;
        int length = 5;
        int weight = 250;

        System.out.println("Dimensions:");
        System.out.println("Width: " + width + " inch");
        System.out.println("Height: " + height + " inch");
        System.out.println("Length: " + length + " inch");
        System.out.println("Weight: " + weight + " g");
    }



}