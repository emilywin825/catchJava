package mid2.collections.deque.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        String[] textArr = text.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (String ta : textArr) {
            map.put(ta, map.getOrDefault(ta, 0) + 1);
        }

        System.out.println(map);
    }
}