import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
===============================================================================
                     SET COLLECTIONS COMPLETE CHEAT SHEET
===============================================================================

SET HIERARCHY
-------------

                Collection
                     |
                     |
                    Set
                     |
     ----------------------------------
     |               |               |
  HashSet      LinkedHashSet      TreeSet

SET FEATURES
------------
✔ Stores unique elements
✔ No duplicate values
✔ Faster search than List

===============================================================================
1) HASHSET
===============================================================================

DEFINITION
----------
HashSet stores UNIQUE elements.

INTERNAL WORKING
----------------
Uses HashMap internally.

ORDER
-----
❌ No insertion order
❌ No sorting

TIME COMPLEXITY
---------------
add()        O(1)
remove()     O(1)
contains()   O(1)

WHEN TO USE
-----------
✔ Fast insert
✔ Fast search
✔ Uniqueness required

EXAMPLE
--------
Input:
10 20 30 40

Output:
30 10 40 20
(or any order)

MEMORY TRICK
------------
Crowd of people without seating arrangement.

===============================================================================
2) LINKEDHASHSET
===============================================================================

DEFINITION
----------
Stores UNIQUE elements
and maintains insertion order.

INTERNAL WORKING
----------------
Hash Table + Doubly Linked List

ORDER
-----
✔ Insertion order maintained
❌ No sorting

TIME COMPLEXITY
---------------
add()        O(1)
remove()     O(1)
contains()   O(1)

WHEN TO USE
-----------
✔ Uniqueness required
✔ Order should be maintained

EXAMPLE
--------
Input:
10 20 30 40

Output:
10 20 30 40

MEMORY TRICK
------------
People standing in a queue.

===============================================================================
3) TREESET
===============================================================================

DEFINITION
----------
Stores UNIQUE elements
in sorted order.

INTERNAL WORKING
----------------
Red Black Tree
(Self Balancing BST)

ORDER
-----
✔ Sorted order
✔ Ascending by default

TIME COMPLEXITY
---------------
add()        O(log n)
remove()     O(log n)
contains()   O(log n)

WHEN TO USE
-----------
✔ Need sorting
✔ Need uniqueness

EXAMPLE
--------
Input:
40 10 30 20

Output:
10 20 30 40

MEMORY TRICK
------------
Students standing according to rank.

===============================================================================
INTERVIEW DIFFERENCES
===============================================================================

                 HASHSET     LINKEDHASHSET     TREESET

Duplicates         No             No             No

Order           No Order      Insertion      Sorted
                                Order

Internal DS      HashMap     HashMap+DLL   RedBlackTree

add()             O(1)          O(1)         O(log n)

contains()        O(1)          O(1)         O(log n)

Fastest           Yes            No             No

Sorted             No            No            Yes

===============================================================================
*/

public class SetCheatSheet {

    public static void main(String[] args) {

        // ====================================================================
        // HASHSET
        // ====================================================================

        System.out.println("========== HASHSET ==========");

        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("Spring");
        hashSet.add("Java"); // Duplicate

        System.out.println("After add(): " + hashSet);

        System.out.println("contains(Java): "
                + hashSet.contains("Java"));

        hashSet.remove("Python");

        System.out.println("After remove(): " + hashSet);

        System.out.println("size(): "
                + hashSet.size());

        System.out.println();



        // ====================================================================
        // LINKEDHASHSET
        // ====================================================================

        System.out.println("========== LINKEDHASHSET ==========");

        LinkedHashSet<String> linkedHashSet =
                new LinkedHashSet<>();

        linkedHashSet.add("Java");
        linkedHashSet.add("Python");
        linkedHashSet.add("Spring");
        linkedHashSet.add("Java"); // Duplicate

        System.out.println("After add(): "
                + linkedHashSet);

        System.out.println("contains(Spring): "
                + linkedHashSet.contains("Spring"));

        linkedHashSet.remove("Python");

        System.out.println("After remove(): "
                + linkedHashSet);

        System.out.println("size(): "
                + linkedHashSet.size());

        System.out.println();



        // ====================================================================
        // TREESET
        // ====================================================================

        System.out.println("========== TREESET ==========");

        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(40);
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(20);
        treeSet.add(10); // Duplicate

        System.out.println("After add(): "
                + treeSet);

        System.out.println("first(): "
                + treeSet.first());

        System.out.println("last(): "
                + treeSet.last());

        System.out.println("contains(30): "
                + treeSet.contains(30));

        treeSet.remove(20);

        System.out.println("After remove(): "
                + treeSet);

        System.out.println("size(): "
                + treeSet.size());



        // ====================================================================
        // ITERATION
        // ====================================================================

        System.out.println("\nTreeSet Iteration:");

        for(Integer num : treeSet) {
            System.out.println(num);
        }



        // ====================================================================
        // QUICK REVISION
        // ====================================================================

        /*
         * HASHSET
         * -------
         * Unique values
         * No order
         * HashMap
         * O(1)
         *
         * LINKEDHASHSET
         * -------------
         * Unique values
         * Insertion order
         * HashMap + Linked List
         * O(1)
         *
         * TREESET
         * -------
         * Unique values
         * Sorted order
         * Red Black Tree
         * O(log n)
         */
    }
}
