/**
 * TYPE CASTING IN JAVA - COMPLETE DEMO
 * * Definition: Converting a value from one data type to another.
 * * This file covers:
 * 1. Primitive Type Casting (Widening & Narrowing)
 * 2. Reference Type Casting (Upcasting & Downcasting)
 */

// ==========================================
// CLASSES FOR REFERENCE CASTING DEMO
// ==========================================

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving...");
    }
    
    void honk() {
        System.out.println("Car is honking: Beep Beep!");
    }
}

// ==========================================
// MAIN EXECUTABLE CLASS
// ==========================================

public class TypeCastingCompleteDemo {

    public static void main(String[] args) {

        System.out.println("========== 1. PRIMITIVE TYPE CASTING ==========\n");

        /* * A. WIDENING TYPE CASTING (Implicit Casting)
         * - Small -> Large data type (e.g., int to double)
         * - Performed automatically by the Java compiler.
         * - Safe conversion, no data loss.
         * - Order: byte -> short -> int -> long -> float -> double
         */
        System.out.println("--- Widening (Implicit) ---");
        int smallNumber = 100;
        double widenedValue = smallNumber; // Automatic conversion

        System.out.println("Original int value: " + smallNumber);
        System.out.println("Widened double value: " + widenedValue); // Outputs 100.0
        System.out.println();


        /* * B. NARROWING TYPE CASTING (Explicit Casting)
         * - Large -> Small data type (e.g., double to int)
         * - Must be done manually using the cast operator: (dataType)
         * - May cause data loss (e.g., fractional parts are discarded).
         */
        System.out.println("--- Narrowing (Explicit) ---");
        double largePrice = 99.99;
        int narrowedValue = (int) largePrice; // Manual conversion using (int)

        System.out.println("Original double price: " + largePrice);
        System.out.println("Narrowed int value: " + narrowedValue); // Outputs 99 (fraction lost)
        System.out.println();



        System.out.println("========== 2. REFERENCE TYPE CASTING ==========\n");

        /* * A. UPCASTING
         * - Child -> Parent reference.
         * - Performed automatically.
         * - Safe conversion, supports runtime polymorphism.
         */
        System.out.println("--- Upcasting ---");
        // Creating a Car object, but holding it in a Vehicle reference
        Vehicle myVehicle = new Car(); 
        
        // myVehicle can only access methods defined in Vehicle (or overridden ones)
        myVehicle.start(); 
        // myVehicle.drive(); // ERROR: Cannot access child-specific methods using parent reference
        System.out.println();


        /* * B. DOWNCASTING
         * - Parent -> Child reference.
         * - Must be done explicitly using a cast operator.
         * - Allows access to child-specific methods.
         */
        System.out.println("--- Downcasting ---");
        
        // We know 'myVehicle' is actually holding a Car object in memory, 
        // so we can explicitly cast it back to a Car reference.
        Car myCar = (Car) myVehicle; 
        
        // Now we can access Car-specific methods
        myCar.start(); // Inherited from Vehicle
        myCar.drive(); // Specific to Car
        System.out.println();


        /* * C. SAFE DOWNCASTING USING 'instanceof'
         * - Invalid downcasting causes a ClassCastException at runtime.
         * - Always use 'instanceof' to verify the object type before downcasting.
         */
        System.out.println("--- Safe Downcasting (Interview Best Practice) ---");
        
        Vehicle genericVehicle = new Vehicle(); // A pure Vehicle object, NOT a Car
        
        // If we try: Car c = (Car) genericVehicle; -> Throws ClassCastException!
        
        // Safe way:
        if (genericVehicle instanceof Car) {
            Car safeCar = (Car) genericVehicle;
            safeCar.honk();
        } else {
            System.out.println("genericVehicle is NOT an instance of Car. Downcasting prevented!");
        }
        
        // Let's test it with an actual Car object
        if (myVehicle instanceof Car) {
            Car anotherSafeCar = (Car) myVehicle;
            System.out.println("myVehicle IS an instance of Car. Downcasting successful:");
            anotherSafeCar.honk();
        }
    }
}
