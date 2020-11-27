public class Cylinder {

    int radius;
    int height;
    String color;

    Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
        color = "Red";
    }

//    static void printArea(int radius, int height) {
//        double area = 2 * 22 / 7 * radius * (radius + height);
//        System.out.println("Area= " + area);
//    }

    public static void update(Cylinder c, int radius, int height){
        c.radius = radius;
        c.height = height;
    }

    static void printArea(Cylinder c) {
        double area = 2 * 22 / 7 * c.radius * (c.radius + c.height);
        System.out.println("Area= " + area);
    }

    static void printVolume(Cylinder c) {
        double volume = 22 / 7 * (c.radius * c.radius) * c.height;
        System.out.println("Volume= " + volume);
    }

//    static void printVolume(int radius, int height) {
//        double volume = 22 / 7 * (radius * radius) * height;
//        System.out.println("Volume= " + volume);
//    }

    void setColor(String color) {
        this.color = color;
    }

    void printColor() {
        System.out.println(color);
    }
}
