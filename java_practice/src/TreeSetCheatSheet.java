import java.util.Iterator;
import java.util.TreeSet;

/*
===============================================================================
                             TREESET CHEAT SHEET
===============================================================================

DEFINITION
----------
TreeSet is an implementation of Set interface.

TreeSet stores UNIQUE elements
in SORTED order.

Duplicate values are NOT allowed.

INTERNAL WORKING
----------------
TreeSet internally uses

Red-Black Tree

A Red-Black Tree is a Self-Balancing
Binary Search Tree (BST).

Example:

Insert:

40
10
30
20

Output:

10
20
30
40

ORDERING
---------
✔ Sorted Order
✔ Ascending Order by Default

NULL VALUES
-----------
❌ Null values are NOT allowed

Reason:
-------
TreeSet must compare elements to sort them.

null cannot be compared.

Example:

treeSet.add(null);

Throws:

NullPointerException

DUPLICATES
----------
❌ Duplicate values are ignored

Example:

add(10)
add(10)

Output:

10

TIME COMPLEXITIES
-----------------

add()            O(log n)
remove()         O(log n)
contains()       O(log n)

first()          O(log n)
last()           O(log n)

higher()         O(log n)
lower()          O(log n)

ceiling()        O(log n)
floor()          O(log n)

Iteration        O(n)

WHEN TO USE
-----------
✔ Need uniqueness
✔ Need automatic sorting
✔ Need range-based operations

ADVANTAGES
----------
✔ Automatically sorted
✔ No duplicates
✔ Navigation methods available

DISADVANTAGES
-------------
✘ Slower than HashSet
✘ Slower than LinkedHashSet
✘ Null not allowed

INTERVIEW POINTS
----------------

1. TreeSet uses Red-Black Tree.

2. Elements remain sorted automatically.

3. Duplicate values are not allowed.

4. Null values are not allowed.

5. All operations are O(log n).

6. Default sorting is ascending order.

7. For custom objects:
   Comparable or Comparator is required.

TREESET VS HASHSET
------------------

HashSet
--------
No Order
O(1)

TreeSet
--------
Sorted Order
O(log n)

MEMORY TRICK
------------
TreeSet = Students standing by Rank

1
2
3
4
5

Always sorted.

===============================================================================
*/

public class TreeSetCheatSheet {

    public static void main(String[] args) {

        /*
         * 1. CREATE TREESET
         */
        TreeSet<Integer> numbers = new TreeSet<>();


        /*
         * 2. ADD ELEMENTS
         */
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(50);

        System.out.println("After add():");
        System.out.println(numbers);


        /*
         * 3. ADD DUPLICATE
         */
        numbers.add(10);

        System.out.println("\nAfter adding duplicate:");
        System.out.println(numbers);


        /*
         * 4. FIRST ELEMENT
         */
        System.out.println("\nfirst():");
        System.out.println(numbers.first());


        /*
         * 5. LAST ELEMENT
         */
        System.out.println("\nlast():");
        System.out.println(numbers.last());


        /*
         * 6. CONTAINS
         */
        System.out.println("\ncontains(30):");
        System.out.println(numbers.contains(30));


        /*
         * 7. HIGHER
         *
         * Returns strictly greater value.
         */
        System.out.println("\nhigher(30):");
        System.out.println(numbers.higher(30));


        /*
         * 8. LOWER
         *
         * Returns strictly smaller value.
         */
        System.out.println("\nlower(30):");
        System.out.println(numbers.lower(30));


        /*
         * 9. CEILING
         *
         * Greater than or equal.
         */
        System.out.println("\nceiling(30):");
        System.out.println(numbers.ceiling(30));


        /*
         * 10. FLOOR
         *
         * Smaller than or equal.
         */
        System.out.println("\nfloor(30):");
        System.out.println(numbers.floor(30));


        /*
         * 11. REMOVE
         */
        numbers.remove(20);

        System.out.println("\nAfter remove():");
        System.out.println(numbers);


        /*
         * 12. SIZE
         */
        System.out.println("\nsize():");
        System.out.println(numbers.size());


        /*
         * 13. ISEMPTY
         */
        System.out.println("\nisEmpty():");
        System.out.println(numbers.isEmpty());


        /*
         * 14. ENHANCED FOR LOOP
         */
        System.out.println("\nEnhanced For Loop:");

        for (Integer number : numbers) {
            System.out.println(number);
        }


        /*
         * 15. ITERATOR
         */
        System.out.println("\nIterator:");

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        /*
         * 16. DESCENDING ITERATOR
         */
        System.out.println("\nDescending Iterator:");

        Iterator<Integer> descending =
                numbers.descendingIterator();

        while (descending.hasNext()) {
            System.out.println(descending.next());
        }


        /*
         * 17. POLLFIRST
         *
         * Removes first element.
         */
        System.out.println("\npollFirst():");
        System.out.println(numbers.pollFirst());

        System.out.println(numbers);


        /*
         * 18. POLLLAST
         *
         * Removes last element.
         */
        System.out.println("\npollLast():");
        System.out.println(numbers.pollLast());

        System.out.println(numbers);


        /*
         * 19. CLEAR
         */
        TreeSet<Integer> temp = new TreeSet<>();

        temp.add(1);
        temp.add(2);

        System.out.println("\nBefore clear():");
        System.out.println(temp);

        temp.clear();

        System.out.println("After clear():");
        System.out.println(temp);


        /*
         * QUICK REVISION
         *
         * TreeSet
         * -------
         * Unique values
         * Sorted order
         * Red-Black Tree
         * Null not allowed
         * O(log n)
         *
         * first()
         * last()
         * higher()
         * lower()
         * ceiling()
         * floor()
         * pollFirst()
         * pollLast()
         */
    }
}
