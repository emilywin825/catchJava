package mid2.collections.set;

import java.util.Arrays;
import java.util.LinkedList;

import static java.lang.Math.abs;

public class MyHashSetV3<E> implements MySet<E> {
    static final int DEFAULT_INITIAL_CAPACITY = 16;
    private LinkedList<E>[] buckets;
    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV3() {
        initBucket();
    }

    public MyHashSetV3(int capacity) {
        this.capacity = capacity;
        initBucket();
    }

    public void initBucket() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    @Override
    public boolean add(E element) {
        int hashIndex = hashIndex(element);
        LinkedList<E> bucket = buckets[hashIndex];
        if (bucket.contains(element)) {
            return false;
        }
        bucket.add(element);
        size++;
        return true;
    }

    @Override
    public boolean contains(E searchValue) {
        int hashIndex = hashIndex(searchValue);
        return buckets[hashIndex].contains(searchValue);
    }

    @Override
    public boolean remove(E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex];
        boolean result = bucket.remove(value);

        if (result){
            size--;
            return true;
        }else {
            return false;
        }
    }

    public int hashIndex(Object value) {
        return abs(value.hashCode()) % capacity;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV3{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
