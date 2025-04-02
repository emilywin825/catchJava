package syn;

import java.util.concurrent.locks.ReentrantLock;

public class MutexExample {

    private final ReentrantLock lock = new ReentrantLock();  // 1️⃣ 뮤텍스 객체
    private int count = 0;

    public void increment() {
        // 2️⃣ 자원 요청 (lock)
        lock.lock();
        try {
            // 4️⃣ 임계 영역 보호 → 공유 자원 안전하게 사용
            count++;
            System.out.println(Thread.currentThread().getName() + " → count: " + count);
            Thread.sleep(500); // 임계 구역
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // 3️⃣ 자원 반환 (unlock)
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        MutexExample example = new MutexExample();

        for (int i = 1; i <= 5; i++) {
            Thread t = new Thread(example::increment);
            t.setName("Thread-" + i);
            t.start();
        }
    }
}
