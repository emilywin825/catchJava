package mid2.collections.deque;

import java.util.ArrayDeque;

public class DequeQueueMain {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        //데이터 추가
        deque.offer(1);
        //다음 데이터 확인(꺼내지 않고 단순 조회만)
        System.out.println("deque.peek() = " + deque.peek());
        //데이터 삭제
        deque.poll();
    }
}
