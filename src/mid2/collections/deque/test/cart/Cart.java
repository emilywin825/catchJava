package mid2.collections.deque.test.cart;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cart {
    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int num) {
        Integer value = cartMap.getOrDefault(product, 0);
        cartMap.put(product, value + num);
    }

    public void printAll() {
        Set<Map.Entry<Product, Integer>> entries = cartMap.entrySet();
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> entry : entries) {
            System.out.println("상품: " + entry.getKey() + "수량: " + entry.getValue());
        }
    }

    public void minus(Product product, int num) {
        Integer originNum = cartMap.get(product);
        int newNum = originNum - num;
        if (newNum <= 0) {
            cartMap.remove(product);
        } else {
            cartMap.put(product, newNum);
        }
    }
}