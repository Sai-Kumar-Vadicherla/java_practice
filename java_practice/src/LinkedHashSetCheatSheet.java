import java.util.Iterator;
import java.util.LinkedHashSet;

/*
===============================================================================
                          LINKEDHASHSET CHEAT SHEET
===============================================================================

DEFINITION
----------
LinkedHashSet is an implementation of Set interface.

LinkedHashSet stores UNIQUE elements only.

Duplicate values are NOT allowed.

INTERNAL WORKING
----------------
LinkedHashSet internally uses:

Hash Table + Doubly Linked List

Hash Table:
-----------
Provides fast searching.

Doubly Linked List:
-------------------
Maintains insertion order.

Example:

Insert:

Java
Python
Spring
React

Output:

Java
Python
Spring
React

ORDERING
---------
✔ Insertion order maintained
❌ Not sorted

NULL VALUES
-----------
✔ One null value is allowed

DUPLICATES
----------
❌ Duplicate values are ignored

Example:

add("Java")
add("Java")

Output:

Java

TIME COMPLEXITIES
-----------------

add()          O(1)
remove()       O(1)
contains()     O(1)
size()         O(1)
isEmpty()      O(1)

Iteration      O(n)

WHEN TO USE
-----------
✔ Need unique elements
✔ Need insertion order
✔ Fast searching

ADVANTAGES
----------
✔ No duplicates
✔ Maintains insertion order
✔ Fast operations

DISADVANTAGES
-------------
✘ More memory than HashSet
✘ Not sorted

INTERVIEW POINTS
----------------

1. LinkedHashSet extends HashSet.

2. Internally uses:
   Hash Table + Doubly Linked List.

3. Maintains insertion order.

4. Allows one null value.

5. Faster than TreeSet.

6. Slightly slower than HashSet.

HASHSET VS LINKEDHASHSET
------------------------

HashSet
--------
No order

LinkedHashSet
-------------
Insertion order maintained

MEMORY TRICK
------------
LinkedHashSet = Queue of people

Java -> Python -> Spring -> React

Order is preserved.

===============================================================================
*/

public class LinkedHashSetCheatSheet {

    public static void main(String[] args) {

        /*
         * 1. CREATE LINKEDHASHSET
         */
        LinkedHashSet<String> languages = new LinkedHashSet<>();


        /*
         * 2. ADD ELEMENTS
         */
        languages.add("Java");
        languages.add("Python");
        languages.add("Spring");
        languages.add("React");

        System.out.println("After add():");
        System.out.println(languages);


        /*
         * 3. ADD DUPLICATE
         */
        languages.add("Java");

        System.out.println("\nAfter adding duplicate:");
        System.out.println(languages);


        /*
         * 4. ADD NULL
         */
        languages.add(null);

        System.out.println("\nAfter adding null:");
        System.out.println(languages);


        /*
         * 5. CONTAINS
         */
        System.out.println("\ncontains(Spring):");
        System.out.println(languages.contains("Spring"));


        /*
         * 6. REMOVE
         */
        languages.remove("React");

        System.out.println("\nAfter remove():");
        System.out.println(languages);


        /*
         * 7. SIZE
         */
        System.out.println("\nsize():");
        System.out.println(languages.size());


        /*
         * 8. ISEMPTY
         */
        System.out.println("\nisEmpty():");
        System.out.println(languages.isEmpty());


        /*
         * 9. ENHANCED FOR LOOP
         */
        System.out.println("\nEnhanced For Loop:");

        for (String language : languages) {
            System.out.println(language);
        }


        /*
         * 10. ITERATOR
         */
        System.out.println("\nIterator:");

        Iterator<String> iterator = languages.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        /*
         * 11. CLEAR
         */
        LinkedHashSet<String> temp = new LinkedHashSet<>();

        temp.add("A");
        temp.add("B");

        System.out.println("\nBefore clear():");
        System.out.println(temp);

        temp.clear();

        System.out.println("After clear():");
        System.out.println(temp);


        /*
         * QUICK REVISION
         *
         * LinkedHashSet
         * -------------
         * Unique values
         * Insertion order maintained
         * Hash Table + Doubly Linked List
         * One null allowed
         * No duplicates
         * O(1) add()
         * O(1) remove()
         * O(1) contains()
         */
    }
}
