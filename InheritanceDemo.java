class Animal {
    String name = "Animal";
    void sound() { System.out.println("Some sound"); }
}

class Dog extends Animal {
    String name = "Dog";
    void sound() {
        super.sound();
        System.out.println("Bark");
    }
    void showNames() {
        System.out.println("Child: " + name);
        System.out.println("Parent: " + super.name);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        ((Dog)a).showNames();
    }
}