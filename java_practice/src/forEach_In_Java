import java.util.Arrays;
import java.util.List;

public class forEach_In_Java {
    public static void main(String[] args) {
        
        // Creating a list of elements using Arrays.asList
        List<Integer> values = Arrays.asList(4, 5, 6, 7, 8);

        /* 
         ========================================================
         BEFORE FOREACH (External Iterations)
         ========================================================
         In older versions of Java, loops were managed from the 
         outside. You had to explicitly tell the program *how* 
         to execute the loop step-by-step.
        */

        System.out.println("--- Normal for loop ---");
        // We explicitly specify the starting point, the ending condition, 
        // and how to increment the index.
        for (int i = 0; i < values.size(); i++) {
            System.out.println(values.get(i));
        }

        System.out.println("\n--- Enhanced for loop ---");
        // Introduced to simplify syntax, but it is still an external iteration.
        // The array itself gives you the value and places it into 'i'.
        for (int i : values) {
            System.out.println(i);
        }

        /* 
         ========================================================
         AFTER FOREACH (Internal Iterations)
         ========================================================
         Introduced in Java 8. The iteration is handled internally 
         by the collection itself. We only tell it *what* to do, 
         making it cleaner and better suited for streams.
        */

        System.out.println("\n--- forEach method with Lambda ---");
        // The forEach method takes one value at a time and passes it to 'i'.
        // We use a lambda expression (->) to define the action to perform.
        values.forEach(i -> System.out.println(i));
    }
}
