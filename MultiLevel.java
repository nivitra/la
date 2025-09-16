class A {
    A() { System.out.println("A constructor"); }
}
class B extends A {
    B() { super(); System.out.println("B constructor"); }
}
class C extends B {
    C() { super(); System.out.println("C constructor"); }
}

public class MultiLevel {
    public static void main(String[] args) {
        new C();
    }
}