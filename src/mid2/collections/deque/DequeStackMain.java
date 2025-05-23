package mid2.collections.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStackMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        //데이터 추가
        deque.push(1);
        //다음 꺼낼 데이터 확인(꺼내지 않고 단순 조회만)
        System.out.println("deque.peek() = " + deque.peek());
        //데이터 꺼내기
        System.out.println("deque.pop() = " + deque.pop());
    }
}
