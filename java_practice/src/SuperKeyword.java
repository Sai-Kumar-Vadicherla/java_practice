/*
    super keyword:
    The super keyword is used to refer to the immediate parent class object.

    Types of super:
    1. super()         -> Calls the parent class constructor.
    2. super.variable  -> Accesses the parent class variable.
    3. super.method()  -> Calls the parent class method.
*/

class Animal {

    String color = "White";

    Animal() {
        System.out.println("Animal Constructor Called");
    }

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    String color = "Black";

    Dog() {
        super();
        System.out.println("Dog Constructor Called");
    }

    void display() {
        System.out.println("Child Color: " + color);
        System.out.println("Parent Color: " + super.color);
    }

    @Override
    void sound() {
        super.sound();
        System.out.println("Dog barks");
    }
}

public class SuperKeyword {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.display();

        dog.sound();
    }
}
