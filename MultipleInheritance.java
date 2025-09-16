interface Flyer { void fly(); }

class Bird {
    void eat() { System.out.println("Eating..."); }
}

class Sparrow extends Bird implements Flyer {
    public void fly() { System.out.println("Flying..."); }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Sparrow s = new Sparrow();
        s.eat();
        s.fly();
    }
}