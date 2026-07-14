// Title: Lambda Expression in Java

@FunctionalInterface
interface A {
    void show();
}

public class Lambda_Expression_In_Java {

    public static void main(String[] args) {

        /*
         * Before Lambda Expression
         *
         * A obj = new A() {
         *     @Override
         *     public void show() {
         *         System.out.println("Hi from B");
         *     }
         * };
         */ 
        // After Lambda Expression

        A obj = () -> System.out.println("Hi from B");

        obj.show();
    }
}
