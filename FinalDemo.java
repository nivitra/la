final class FinalClass {
    final int x = 10;
    final void display() { System.out.println("Final method in final class"); }
}

// class Child extends FinalClass {} // Not allowed

class Demo {
    final int y;
    Demo(int val) { y = val; }
}

public class FinalDemo {
    public static void main(String[] args) {
        FinalClass f = new FinalClass();
        f.display();
        Demo d = new Demo(100);
        System.out.println("Final variable y = " + d.y);
    }
}