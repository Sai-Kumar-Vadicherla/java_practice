// Feature 2: Object-Oriented Programming
class Animal {

    // Feature 1: Simple
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Feature 2: Inheritance
class Dog extends Animal {

    // Feature 2: Polymorphism (Method Overriding)
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Feature 9: Multithreading
class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class JavaFeaturesDemo {

    public static void main(String[] args) {

        System.out.println("===== FEATURES OF JAVA =====");

        // 1. Simple
        System.out.println("\n1. Simple Feature");
        int number = 10;
        System.out.println("Number = " + number);

        // 2. Object-Oriented
        System.out.println("\n2. Object-Oriented Feature");

        Animal obj = new Dog(); // Upcasting
        obj.sound();            // Runtime Polymorphism

        // 3. Platform Independent
        System.out.println("\n3. Platform Independent");
        System.out.println("Java follows WORA (Write Once, Run Anywhere)");

        // 4. Portable
        System.out.println("\n4. Portable");
        System.out.println("Bytecode (.class file) can run on any JVM");

        // 5. Secure
        System.out.println("\n5. Secure");
        System.out.println("No direct pointer manipulation in Java");

        // 6. Robust
        System.out.println("\n6. Robust");

        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Exception handled successfully");
        }

        // 7. Architecture Neutral
        System.out.println("\n7. Architecture Neutral");
        System.out.println("Bytecode is CPU independent");

        // 8. High Performance
        System.out.println("\n8. High Performance");
        System.out.println("JIT Compiler improves execution speed");

        // 9. Multithreaded
        System.out.println("\n9. Multithreaded");

        MyThread t1 = new MyThread();
        t1.start();

        // 10. Distributed
        System.out.println("\n10. Distributed");
        System.out.println("Java supports networking and distributed applications");

        // 11. Dynamic
        System.out.println("\n11. Dynamic");
        System.out.println("Classes can be loaded at runtime");

        // 12. Compiled and Interpreted
        System.out.println("\n12. Compiled and Interpreted");
        System.out.println("Java source code -> Bytecode -> JVM Execution");
    }
}
