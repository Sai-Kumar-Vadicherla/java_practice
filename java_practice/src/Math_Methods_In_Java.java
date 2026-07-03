class Math_Methods_In_Java {
    public static void main(String[] args) {
        /*
        
        1. Math.abs()
        📘 Definition:  Returns the absolute value of a number                (removes negative sign).
        */
        
        int absolute = -10;
        System.out.println(Math.abs(absolute));  // 10
        System.out.println(Math.abs(absolute));   // 10
        
        /*
            🔢 2. Math.max()
            📘 Definition: Returns the greater of two numbers.
            📙 Full form / meaning:  MAX = Maximum value
        */
        
        System.out.println(Math.max(40, 20));  // 20
        
        /*
            🔢 3. Math.min()
            📘 Definition:  Returns the smaller of two numbers.
            📙 Full form / meaning:  MIN = Minimum value
        */
        
        System.out.println(Math.min(40, 20));  // 10
        
        /*
            🔢 4. Math.pow()
            📘 Definition:  Returns a number raised to a power (aᵇ).
            📙 Full form / meaning: POW = Power
        */
        
        System.out.println(Math.pow(2, 3));   // 8.0
        System.out.println(Math.pow(5, -1));  // 0.2
        
        /*
            🔢 5. Math.sqrt()
            📘 Definition: Returns the square root of a number.
             Full form / meaning: SQRT = Square Root
        */
        
        System.out.println(Math.sqrt(16));  // 4.0
        
        /*
            🔢 6. Math.ceil()
            📘 Definition:  Rounds a number UP to the nearest integer.
            📙 Full form / meaning: CEIL = Ceiling (top rounding)
        */
        
        System.out.println(Math.ceil(4.2));  // 5.0
        System.out.println(Math.ceil(4.9));  // 5.0
        
    
        
        
        
        System.out.println(Math.ceil(4.2));  // 5.0
        System.out.println(Math.ceil(4.9));  // 5.0

        /*
            🔢 7. Math.floor()
            📘 Definition: Rounds a number DOWN to the nearest integer.
            📙 Full form / meaning: FLOOR = Lower boundary
        */
        
        System.out.println(Math.floor(4.9));  // 4.0
        System.out.println(Math.floor(4.2));  // 4.0
        
        /*
            🔢 8. Math.round()
            📘 Definition: Rounds a number to the nearest integer.
             Full form / meaning: ROUND = Nearest value rounding
        */
        
        System.out.println(Math.round(4.6));  // 5
        System.out.println(Math.round(4.3));  // 4
        
        /*
        🔢 9. Math.random()
        📘 Definition: Generates a random number between 0.0 and 1.0.
        📙 Full form / meaning: RANDOM = Random number generator
        */
        
        System.out.println(Math.random());

        int num = (int)(Math.random() * 10);
        System.out.println(num); // 0 to 9
        
        /*
        🔢 10. Math.sqrt() already done (included again for clarity)
        📘 Definition: Finds square root of a number.
        📙 Full form / meaning: SQRT = Square Root
        */
        
        System.out.println(Math.sqrt(25));  // 5.0
    }
}
