package CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetBasics {
    public static void main(String[] args) {

// HashSet() -> Does not follow order
        // Set<Integer> st = new HashSet<>();
        // st.add(10);
        // st.add(10);
        // st.add(10);
        // st.add(10);
        // st.add(10);
        // st.add(10);
        // st.add(20);
        // st.add(20);
        // st.add(30);
        // System.out.println(st);



// TreeSet() -> Shorted order
        Set<Integer> st = new TreeSet<>();
        st.add(50);
        st.add(10);
        st.add(40);
        st.add(10);
        st.add(10);
        st.add(10);
        st.add(20);
        st.add(20);
        st.add(30);
        System.out.println(st);



// LinkedHashSet() -> Follow Order
        // Set<Integer> st = new LinkedHashSet<>();
        // st.add(10);
        // st.add(40);
        // st.add(10);
        // st.add(10);
        // st.add(10);
        // st.add(10);
        // st.add(20);
        // st.add(20);
        // st.add(30);
        // System.out.println(st);




// retainAll() and containsAll()
        // Set<Integer> set1 = new HashSet<>();
        // Set<Integer> set2 = new HashSet<>();

        // set1.add(1);
        // set1.add(2);
        // set1.add(3);
        // set1.add(4);

        // set2.add(3);
        // set2.add(4);
        // set2.add(5);
        // set2.add(6);

        // System.out.println(set1);
        // set1.retainAll(set2);
        // System.out.println(set1);
        // System.out.println(set2);

        // System.out.println(set1.containsAll(set2));

        // System.out.println(set2.containsAll(set1));
    }
}
