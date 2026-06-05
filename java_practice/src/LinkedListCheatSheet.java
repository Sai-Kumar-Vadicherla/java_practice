import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/*
===============================================================================
                           LINKEDLIST CHEAT SHEET
===============================================================================

DEFINITION
----------
LinkedList is a doubly linked list implementation of List interface.

INTERNAL WORKING
----------------

Node Structure

+----------------------+
| prev | data | next  |
+----------------------+

Example

null <- [10] <-> [20] <-> [30] -> null

Each node stores:

1. Previous node reference
2. Data
3. Next node reference

WHEN TO USE
-----------
✔ Frequent insertion/removal
✔ Queue operations
✔ Deque operations

Avoid when:
❌ Frequent random access

TIME COMPLEXITIES
-----------------

get(index)            O(n)
addFirst()            O(1)
addLast()             O(1)
removeFirst()         O(1)
removeLast()          O(1)
search                O(n)

ADVANTAGES
----------
✔ Fast insertion at ends
✔ Fast deletion at ends
✔ No resizing required

DISADVANTAGES
-------------
✘ More memory usage
✘ Slow random access
✘ Poor cache locality

INTERVIEW POINT
---------------
LinkedList insertion itself is O(1).

But locating insertion position may take O(n).

This is a common interview question.

MEMORY TRICK
------------
LinkedList = Train

Engine <-> Coach <-> Coach <-> Coach

Easy to add/remove coaches.

Hard to directly jump to coach #50.

===============================================================================
*/

public class LinkedListCheatSheet {

    public static void main(String[] args) {

        /*
         * 1. CREATE LINKEDLIST
         */
        LinkedList<String> tasks = new LinkedList<>();


        /*
         * 2. ADD ELEMENTS
         */
        tasks.add("Task 1");
        tasks.add("Task 2");
        tasks.add("Task 3");

        System.out.println("After add():");
        System.out.println(tasks);


        /*
         * 3. ADD FIRST
         */
        tasks.addFirst("Urgent Task");

        System.out.println("\nAfter addFirst():");
        System.out.println(tasks);


        /*
         * 4. ADD LAST
         */
        tasks.addLast("Final Task");

        System.out.println("\nAfter addLast():");
        System.out.println(tasks);


        /*
         * 5. ACCESS ELEMENTS
         */
        System.out.println("\ngetFirst():");
        System.out.println(tasks.getFirst());

        System.out.println("\ngetLast():");
        System.out.println(tasks.getLast());

        System.out.println("\nget(2):");
        System.out.println(tasks.get(2));


        /*
         * 6. REMOVE FIRST
         */
        tasks.removeFirst();

        System.out.println("\nAfter removeFirst():");
        System.out.println(tasks);


        /*
         * 7. REMOVE LAST
         */
        tasks.removeLast();

        System.out.println("\nAfter removeLast():");
        System.out.println(tasks);


        /*
         * 8. CONTAINS
         */
        System.out.println("\ncontains(Task 2):");
        System.out.println(tasks.contains("Task 2"));


        /*
         * 9. SIZE
         */
        System.out.println("\nsize():");
        System.out.println(tasks.size());


        /*
         * 10. ITERATION
         */
        System.out.println("\nFor-each Loop:");

        for (String task : tasks) {
            System.out.println(task);
        }


        /*
         * 11. ITERATOR
         */
        System.out.println("\nIterator:");

        Iterator<String> iterator = tasks.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        /*
         * 12. QUEUE USING LINKEDLIST
         */
        System.out.println("\nQueue Example:");

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Queue:");
        System.out.println(queue);

        System.out.println("poll():");
        System.out.println(queue.poll());

        System.out.println("peek():");
        System.out.println(queue.peek());


        /*
         * 13. CLEAR
         */
        tasks.clear();

        System.out.println("\nAfter clear():");
        System.out.println(tasks);


        /*
         * QUICK REVISION
         *
         * LinkedList
         * ----------
         * Doubly Linked List
         * O(n) get()
         * O(1) add/remove ends
         * More memory
         * Good for Queue/Deque
         *
         * Remember:
         *
         * Read More  -> ArrayList
         * Write More -> LinkedList
         */
    }
}
