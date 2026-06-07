import java.util.HashSet;
import java.util.Iterator;

/*
===============================================================================
                             HASHSET CHEAT SHEET
===============================================================================

DEFINITION
----------
HashSet is an implementation of Set interface.

HashSet stores UNIQUE elements only.

Duplicate values are NOT allowed.

INTERNAL WORKING
----------------
HashSet internally uses HashMap.

Each element is stored as a key in HashMap.

Example:

HashSet
--------
Java
Python
Spring

Internally:

HashMap
--------
Java   -> PRESENT
Python -> PRESENT
Spring -> PRESENT

ORDERING
---------
❌ No insertion order
❌ No sorted order

Output may vary from execution to execution.

NULL VALUES
-----------
✔ One null value is allowed

Example:

null
Java
Python

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
✔ Fast searching
✔ Fast insertion
✔ Fast deletion

ADVANTAGES
----------
✔ No duplicates
✔ Fastest Set implementation
✔ Excellent performance

DISADVANTAGES
-------------
✘ No insertion order
✘ No sorting

INTERVIEW POINTS
----------------
1. HashSet internally uses HashMap.

2. Duplicate elements are not stored.

3. One null value is allowed.

4. HashSet is not synchronized.

5. Ordering is not guaranteed.

MEMORY TRICK
------------
HashSet = Crowd in a playground

People exist,
but nobody stands in any order.

===============================================================================
*/

public class HashSetCheatSheet {

    public static void main(String[] args) {

        /*
         * 1. CREATE HASHSET
         */
        HashSet<String> languages = new HashSet<>();


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
         * 3. DUPLICATE ELEMENT
         */
        languages.add("Java");

        System.out.println("\nAfter adding duplicate:");
        System.out.println(languages);


        /*
         * 4. NULL VALUE
         */
        languages.add(null);

        System.out.println("\nAfter adding null:");
        System.out.println(languages);


        /*
         * 5. CONTAINS
         */
        System.out.println("\ncontains(Java):");
        System.out.println(languages.contains("Java"));


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
        HashSet<String> temp = new HashSet<>();

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
         * HashSet
         * -------
         * Unique values
         * HashMap internally
         * One null allowed
         * No order
         * No duplicates
         * O(1) add()
         * O(1) remove()
         * O(1) contains()
         */
    }
}
