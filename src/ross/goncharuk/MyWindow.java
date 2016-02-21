package ross.goncharuk;


public class MyWindow {

    private double width;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }

    public MyWindow() {
        this(10,5,2,"white",false);
    }

    public MyWindow(double width, double height) {
        this(width,height,1,"grey", true);
    }

    public MyWindow(double width, double height, int numberOfGlass) {
        this(width,height,numberOfGlass,"dark",false);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public int getNumberOfGlass() {
        return numberOfGlass;
    }

    public String getColor() {
        return color;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public String printFields(){
        String result = width+", "+height+", "+numberOfGlass+", "+color+", "+isOpen;
        return result;
    }

    private int[] myWindows;

    public int[] getMyWindows() {
        return myWindows;
    }
}
