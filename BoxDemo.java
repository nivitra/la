class Box {
    double length, width, height;

    Box() { this.length = this.width = this.height = 1; }
    Box(double side) { this.length = this.width = this.height = side; }
    Box(double l, double w, double h) { this.length = l; this.width = w; this.height = h; }

    double volume() { return length * width * height; }
}

public class BoxDemo {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(5);
        Box b3 = new Box(2,3,4);

        System.out.println("b1 volume: " + b1.volume());
        System.out.println("b2 volume: " + b2.volume());
        System.out.println("b3 volume: " + b3.volume());
    }
}