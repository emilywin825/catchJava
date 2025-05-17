package mid2.collections.set.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UniqueNamesTest1 {
    public static void main(String[] args) {
        Integer[] arr = {30, 20, 20, 10, 10};
        Set<Integer> set = new HashSet<>();
        for (Integer i : arr) {
            set.add(i);
        }

        for (Integer s : set) {
            System.out.println(s);
        }
    }
}
