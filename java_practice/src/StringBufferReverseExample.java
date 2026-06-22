/*
StringBuffer

Definition:
- StringBuffer is a mutable sequence of characters.
- Unlike String, it can be modified without creating new objects.
- It is thread-safe (synchronized), making it suitable for multi-threaded environments.
- It is slightly slower than StringBuilder because of synchronization.

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
    - Converts StringBuffer into String.

Difference Between StringBuilder and StringBuffer:

- StringBuilder : Not synchronized, faster, not thread-safe.
- StringBuffer  : Synchronized, slightly slower, thread-safe.
*/

public class StringBufferReverseExample {
    public static void main(String[] args) {

        String str = "Java Programming";

        StringBuffer sb = new StringBuffer(str);

        sb.reverse();

        String reversed = sb.toString();

        System.out.println("Original String : " + str);
        System.out.println("Reversed String : " + reversed);
    }
}
