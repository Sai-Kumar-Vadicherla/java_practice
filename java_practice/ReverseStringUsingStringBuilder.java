/*
StringBuilder      tyfjgfhjghjffjgfh

Definition:
- StringBuilder is a mutable sequence of characters.
- Unlike String, it can be modified without creating new objects.
- It is faster than String when performing multiple modifications.

Common Methods:

1. append(value)
   - Adds value at the end.

2. insert(index, value)
   - Inserts value at specified index.

3. replace(start, end, value)
   - Replaces characters from start to end-1.

4. delete(start, end)
   - Removes characters from start to end-1.

5. deleteCharAt(index)
   - Removes character at given index.

6. charAt(index)
   - Returns character at specified index.

7. setCharAt(index, ch)
   - Replaces character at specified index.

8. length()
   - Returns number of characters.

9. substring(start)
   - Returns substring from start index.

10. substring(start, end)
    - Returns substring between start and end-1.

11. reverse()
    - Reverses the string.

12. capacity()
    - Returns current capacity.

13. ensureCapacity(size)
    - Increases capacity if needed.

14. toString()
    - Converts StringBuilder into String.
*/

public class ReverseStringUsingStringBuilder {
    public static void main(String[] args) {

        String str = "Java Programming";

        StringBuilder sb = new StringBuilder(str);

        sb.reverse();

        String reversed = sb.toString();

        System.out.println("Original String : " + str);
        System.out.println("Reversed String : " + reversed);
    }
}
