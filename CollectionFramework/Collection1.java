package CollectionFramework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Collection1 {
    public static void main(String[] args) {

        // List or Collection -> interface
        // ArrayList -> concrete class

        ArrayList<Integer> list = new ArrayList<>();
        // add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(40);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        // addAll
        List<Integer> list2 = new ArrayList<>();
        list2.add(101);
        list2.add(102);
        list2.add(20);

        list.addAll(list2);
        System.out.println(list);
        list.removeAll(list2);
        System.out.println(list);

        System.out.println("Size of the array: " + list.size());
        System.out.println("Printing list2: " + list2);
        list2.clear();
        System.out.println(list2.size());

        // i want to traverse list using iterator
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }

        List<Integer> list3 = new ArrayList<>();
        list3.add(11);
        list3.add(12);
        list3.add(14);
        System.out.println(list3.get(1));
        System.out.println("Before set: " + list3);
        list3.set(2, 100);
        System.out.println("After set: " + list3);
        // Collection<Integer> collection = new ArrayList<>();

        // toArray
        Object[] arr = list3.toArray();
        for (Object obj : arr) {
            System.out.println(obj);
        }

        // contains
        System.out.println(list3.contains(100));

// ----->>>>> Java Array List And Java Linked List 
// ---->>>>> Both working is equal 

        list.add(12);
        list.add(6);
        System.out.println("Printing entire list: " + list);

        // sort an arrayList
        Collections.sort(list);
        System.out.println("Printing sorted array in ascending order: " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Printing sorted array in descending order: " + list);

        ArrayList<Integer> newList = (ArrayList<Integer>)list.clone();
        System.out.println("Printing Entire newList: " + newList);

        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);

        System.out.println(marks.isEmpty());

        System.out.println(newList.indexOf(12));





//---->>>>> Linked List as Queue & Deque

    // addFirst(), addLast()
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        System.out.println(ll);
        ll.addFirst(1);
        System.out.println(ll);
        ll.addLast(101);
        System.out.println(ll);

    // // removeFirst(), removeLast()
    //     ll.removeFirst();
    //     System.out.println(ll);
    //     ll.removeLast();
    //     System.out.println(ll);

    // getFirst(), getLast()
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

    // peek(), poll(), offer()
        System.out.println(ll.peek());
        System.out.println("Before: " + ll);
        System.out.println("Polling: " + ll.poll());
        System.out.println("After: " + ll);
        ll.offer(10);
        System.out.println(ll);
    }
}
