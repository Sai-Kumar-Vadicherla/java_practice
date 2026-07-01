import java.util.*;
import java.util.stream.*;

/*
 - In Java Streams, filter() is an intermediate operation in the stream pipeline.
 - It contains a condition (Predicate) and returns a new Stream.
 - filter() is a lazy operation, so it is executed only when a terminal operation is invoked.

 - Terminal operations:
   - forEach()
   - collect()
   - count()
   - reduce()
   - findFirst()
   - anyMatch()
   - toArray()
*/

class Stream_API_in_Java {
    public static void main(String[] args) {

        List<Integer> data = Arrays.asList(4, 5, 9, 1, 3, 2, 6);

        /*
           Traditional approach using Predicate (for understanding)

           Predicate<Integer> predi = new Predicate<Integer>() {
               @Override
               public Boolean test(Integer n) {
                   return n % 2 == 1;
               }
           };

           Instead of writing this verbose code, we use:
           filter(n -> n % 2 == 1)
        */

        /*
           STREAM OPERATIONS (IMPORTANT)

           map()     → transforms each element
           sorted()  → sorts elements
           forEach() → terminal operation (consumes stream)
        */

        data.stream()
            .map(n -> n * 2)      // double each number
            .sorted()             // sort the result
            .forEach(n -> System.out.println(n)); // print each element

        /*
           IMPORTANT POINT:

           Once a stream is used (terminal operation like forEach, count, collect),
           it cannot be reused again.
        */

        /*
           Example (WRONG - will throw error if reused):

           Stream<Integer> stream = data.stream();

           stream.forEach(System.out::println);
           stream.count(); // ERROR: stream already consumed
        */

        /*
           Without streams (traditional way):

           for (int n : data) {
               System.out.println(n * 2);
           }
        */

        /*
           WHY STREAMS?

           - Functional programming style
           - Less boilerplate code
           - No need to manually loop
           - Helps in working with large data safely
           - Avoids unwanted resource usage (lazy + single-use pipeline)
        */
    }
}
