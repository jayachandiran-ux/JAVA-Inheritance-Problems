class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

// Child Class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Main Class
public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.sound();   // Inherited method
        d.bark();    // Child class method
    }
}