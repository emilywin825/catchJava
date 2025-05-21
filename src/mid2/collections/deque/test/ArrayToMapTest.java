package mid2.collections.deque.test;

import java.util.HashMap;
import java.util.Set;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

        HashMap<String, Integer> map = new HashMap<>();
        //주어진 배열로부터 Map 생성
        for (String[] s : productArr) {
            map.put(s[0], Integer.valueOf(s[1]));
        }

        //Map의 모든 데이터 출력
        for (String key : map.keySet()) {
            System.out.println("제품: " + key + ", 가격: " + map.get(key));
        }
    }
}