public class Dimensions{

    private final double volume;
    private final double length;
    private final double width;
    private final double height;

    public Dimensions setHeight(double height) {
        return new Dimensions(length, width, height);
    }

    public Dimensions setWidth(double width) {
        return new Dimensions(length, width, height);
    }

    public Dimensions setLength(double length) {
        return new Dimensions(length, width, height);
    }

    public double getVolume() {
        return volume;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public Dimensions(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
        volume = getHeight() * getLength() * getWidth();
    }

    public String toString() {
        return "Габариты груза: " + "\n" +
                "Длина: " + getLength() + " м" + "\n" +
                "Ширина: " + getWidth() + " м" + "\n" +
                "Высота: " + getHeight() + " м" + "\n" +
                "Объем груза: " + getVolume() + " м3";

    }
}