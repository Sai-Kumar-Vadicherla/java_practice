/**
 * CONTROL FLOW STATEMENTS IN JAVA - COMPLETE DEMO
 * * Definition: Statements that control the execution flow of a program 
 * (decision making, looping, and branching).
 * * * This file covers:
 * 1. Conditional Statements: if, if-else, nested if, else-if ladder, switch
 * 2. Looping Statements: while, do-while, for, enhanced for
 * 3. Jump Statements: break, continue
 */

public class ControlFlowDemo {

    public static void main(String[] args) {

        System.out.println("========== 1. CONDITIONAL STATEMENTS ==========\n");

        /* * 1. Simple 'if' Statement
         * - Executes a block of code ONLY if the condition is true.
         */
        System.out.println("--- if Statement ---");
        int age = 20;
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }
        System.out.println();


        /* * 2. 'if-else' Statement
         * - Executes the 'if' block if true, otherwise executes the 'else' block.
         */
        System.out.println("--- if-else Statement ---");
        int number = 15;
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
        System.out.println();


        /* * 3. Nested 'if' Statement
         * - An 'if' statement inside another 'if' statement.
         * - Used for checking multiple dependent conditions.
         */
        System.out.println("--- Nested if Statement ---");
        int score = 85;
        boolean hasPassed = true;
        
        if (hasPassed) {
            if (score >= 80) {
                System.out.println("Passed with Distinction!");
            } else {
                System.out.println("Passed normally.");
            }
        }
        System.out.println();


        /* * 4. 'else-if' Ladder
         * - Used to test multiple independent conditions.
         * - Evaluates from top to bottom. Stops at the first true condition.
         */
        System.out.println("--- else-if Ladder ---");
        int marks = 75;
        
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C"); // This will execute
        } else {
            System.out.println("Grade: F");
        }
        System.out.println();


        /* * 5. 'switch' Statement
         * - An alternative to the else-if ladder for checking a single variable 
         * against multiple exact values.
         * - Requires 'break' to prevent fall-through.
         */
        System.out.println("--- switch Statement ---");
        int dayOfWeek = 3;
        
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday"); // This will execute
                break;
            default:
                System.out.println("Invalid Day");
        }
        System.out.println();



        System.out.println("========== 2. LOOPING STATEMENTS ==========\n");

        /* * 6. 'while' Loop
         * - An entry-controlled loop. 
         * - Checks the condition BEFORE executing the body.
         * - Best when the number of iterations is NOT known in advance.
         */
        System.out.println("--- while Loop ---");
        int i = 1;
        while (i <= 3) {
            System.out.println("While loop count: " + i);
            i++;
        }
        System.out.println();


        /* * 7. 'do-while' Loop
         * - An exit-controlled loop.
         * - Executes the body FIRST, then checks the condition.
         * - Guarantees execution at least ONCE, even if the condition is false initially.
         */
        System.out.println("--- do-while Loop ---");
        int j = 1;
        do {
            System.out.println("Do-while loop count: " + j);
            j++;
        } while (j <= 3);
        System.out.println();


        /* * 8. 'for' Loop
         * - Combines initialization, condition, and iteration in one line.
         * - Best when the exact number of iterations IS known in advance.
         */
        System.out.println("--- for Loop ---");
        for (int k = 1; k <= 3; k++) {
            System.out.println("For loop count: " + k);
        }
        System.out.println();


        /* * 9. Enhanced 'for' Loop (For-each Loop)
         * - Specifically designed to iterate over arrays and Collections.
         * - Cleaner syntax, no risk of out-of-bounds exceptions.
         */
        System.out.println("--- Enhanced for Loop ---");
        String[] languages = {"Java", "Python", "C++"};
        
        for (String lang : languages) {
            System.out.println("Language: " + lang);
        }
        System.out.println();



        System.out.println("========== 3. JUMP STATEMENTS ==========\n");

        /* * 10. 'break' Statement
         * - Immediately terminates the entire loop or switch statement.
         * - Program control moves to the statement following the loop.
         */
        System.out.println("--- break Statement ---");
        for (int num = 1; num <= 5; num++) {
            if (num == 4) {
                System.out.println("Breaking the loop at num = 4");
                break; // Exits the loop completely
            }
            System.out.println("Count: " + num);
        }
        System.out.println();


        /* * 11. 'continue' Statement
         * - Skips the current iteration of the loop and jumps straight 
         * to the next iteration (evaluating the condition again).
         */
        System.out.println("--- continue Statement ---");
        for (int num = 1; num <= 5; num++) {
            if (num == 3) {
                System.out.println("Skipping num = 3");
                continue; // Skips the rest of the loop body for this iteration
            }
            System.out.println("Count: " + num);
        }
    }
}
