import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
===============================================================================
                            ARRAYLIST CHEAT SHEET
====================================================================================

DEFINITION
----------
ArrayList is a resizable dynamic array implementation of List interface.

INTERNAL WORKING
----------------
ArrayList stores elements inside a dynamic array.

Example:

Index:  0   1   2   3
       ----------------
Data:  |10|20|30|40|
       ----------------

Elements are stored in contiguous memory locations.

WHEN TO USE
-----------
✔ Frequent reading
✔ Random access by index
✔ Iteration is common

Avoid when:
❌ Frequent insertions/deletions in middle

TIME COMPLEXITIES
-----------------

get(index)            O(1)
add(element)          O(1) amortized
add(index, element)   O(n)
remove(index)         O(n)
contains()            O(n)
search                O(n)

ADVANTAGES
----------
✔ Fast random access
✔ Less memory
✔ Cache friendly
✔ Most used List implementation

DISADVANTAGES
-------------
✘ Slow insertions in middle
✘ Slow deletions in middle
✘ Resizing overhead

INTERVIEW POINT
---------------
ArrayList internally uses a dynamic array.

Most enterprise applications use ArrayList because
read operations are more common than write operations.

MEMORY TRICK
------------
ArrayList = Apartment Building

[101][102][103][104]

Easy to access any room directly.

===============================================================================
*/

public class ArrayListCheatSheet {

    public static void main(String[] args) {

        /*
         * 1. CREATE ARRAYLIST
         */
        ArrayList<String> languages = new ArrayList<>();


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
         * 3. ADD AT SPECIFIC INDEX
         */
        languages.add(1, "JavaScript");

        System.out.println("\nAfter add(index, element):");
        System.out.println(languages);


        /*
         * 4. ACCESS ELEMENT
         */
        System.out.println("\nget(0):");
        System.out.println(languages.get(0));


        /*
         * 5. UPDATE ELEMENT
         */
        languages.set(2, "NodeJS");

        System.out.println("\nAfter set():");
        System.out.println(languages);


        /*
         * 6. REMOVE BY INDEX
         */
        languages.remove(0);

        System.out.println("\nAfter remove(index):");
        System.out.println(languages);


        /*
         * 7. REMOVE BY VALUE
         */
        languages.remove("React");

        System.out.println("\nAfter remove(value):");
        System.out.println(languages);


        /*
         * 8. CONTAINS
         */
        System.out.println("\ncontains(Spring):");
        System.out.println(languages.contains("Spring"));


        /*
         * 9. SIZE
         */
        System.out.println("\nsize():");
        System.out.println(languages.size());


        /*
         * 10. IS EMPTY
         */
        System.out.println("\nisEmpty():");
        System.out.println(languages.isEmpty());


        /*
         * 11. FOR LOOP
         */
        System.out.println("\nFor Loop:");

        for (int i = 0; i < languages.size(); i++) {
            System.out.println(languages.get(i));
        }


        /*
         * 12. ENHANCED FOR LOOP
         */
        System.out.println("\nEnhanced For Loop:");

        for (String language : languages) {
            System.out.println(language);
        }


        /*
         * 13. ITERATOR
         */
        System.out.println("\nIterator:");

        Iterator<String> iterator = languages.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        /*
         * 14. CLEAR
         */
        List<String> temp = new ArrayList<>();

        temp.add("A");
        temp.add("B");

        System.out.println("\nBefore clear():");
        System.out.println(temp);

        temp.clear();

        System.out.println("After clear():");
        System.out.println(temp);


        /*
         * 15. INITIAL CAPACITY
         *
         * Good when size is known beforehand.
         */
        ArrayList<Integer> numbers = new ArrayList<>(1000);


        /*
         * QUICK REVISION
         *
         * ArrayList
         * ----------
         * Dynamic Array
         * O(1) get()
         * O(n) insert/delete middle
         * Less memory
         * Fast reads
         * Most commonly used
         */
    }
}
