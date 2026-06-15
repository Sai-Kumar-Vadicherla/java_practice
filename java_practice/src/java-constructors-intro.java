/* 
     Constructor starts with the same name as the class
     and it must have parentheses () compulsory.

     Example:
         UpiPayment()

     If we do NOT create any constructor,
     Java automatically creates a default constructor.

     The default constructor has no parameters and an empty body.

     Example:

         class UpiPayment {
             int amount;   // instance variable
         }

         UpiPayment p = new UpiPayment();
         System.out.println(p.amount);  // output: 0

     Important:

     If we create ANY constructor (with or without parameters),
     Java will NOT generate the default constructor.

     Example:

         class UpiPayment {
             UpiPayment(int amount) {}
         }

         new UpiPayment(); // ❌ error

       Question: Why should we use constructors in Java?
            ✅ Answer:
            
            We use constructors in Java to initialize objects at the time of creation. A constructor automatically sets the initial values of an object’s variables so the object is ready to use immediately.
            
            If we do not write any constructor, Java automatically provides a default constructor, which creates the object and assigns default values (like 0, null, or false) to variables. However, this default initialization may not always be meaningful for real applications.
            
            By writing our own constructor, we can control how the object is created and ensure it starts with proper and required values.
            
            Constructors help avoid incomplete objects, reduce extra setup code, and make object creation safer and more reliable.



*/



class UpiPayment {
    int amount;

    UpiPayment(int amount) {
        this.amount = amount;
    }
}

class Main {
    public static void main(String[] args) {

        // Creating object using constructor
        UpiPayment p = new UpiPayment(10010);

        System.out.println("Amount = " + p.amount);

        System.out.println("Start small. Ship something.");
    }
}
