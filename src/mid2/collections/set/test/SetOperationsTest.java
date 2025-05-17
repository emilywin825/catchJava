package mid2.collections.set.test;

import java.util.*;

public class SetOperationsTest {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        HashSet<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));
        //합집합
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println("합집합 : " + unionSet);


        //교집합
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("교집합 : " + intersection);

        //차집합
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("차집합 : " + difference);
    }

}
