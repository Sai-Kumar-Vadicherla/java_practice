// Parent Class
class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child Class
class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

public class TypeCastingDemo {

    public static void main(String[] args) {

        // =====================================
        // 1. Primitive Type Casting
        // =====================================

        System.out.println("----- Primitive Type Casting -----");

        // Widening (Implicit Casting)
        int number = 100;
        double doubleValue = number;

        System.out.println("Widening Casting:");
        System.out.println("int value = " + number);
        System.out.println("double value = " + doubleValue);

        System.out.println();

        // Narrowing (Explicit Casting)
        double price = 99.99;
        int intValue = (int) price;

        System.out.println("Narrowing Casting:");
        System.out.println("double value = " + price);
        System.out.println("int value = " + intValue);

        System.out.println();

        // =====================================
        // 2. Reference Type Casting
        // =====================================

        System.out.println("----- Reference Type Casting -----");

        // Upcasting
        Animal obj = new Dog();

        System.out.println("Upcasting:");
        obj.sound();

        System.out.println();

        // Downcasting
        if (obj instanceof Dog) {

            Dog d = (Dog) obj;

            System.out.println("Downcasting:");
            d.bark();
        }
    }
}
