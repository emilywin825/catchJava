package syn;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {

    // 1️⃣ RS = 2: 동시에 2개의 쓰레드만 임계 영역에 들어갈 수 있음
    private final Semaphore semaphore = new Semaphore(2);

    public void accessCriticalSection() {
        try {
            // 2️⃣ P(): 세마포어 접근 시도
            semaphore.acquire();

            System.out.println(Thread.currentThread().getName() + " → 임계 영역 진입");

            // 임계 구역 작업 수행 (예: DB 접근, 파일 저장 등)
            Thread.sleep(1000);

            System.out.println(Thread.currentThread().getName() + " → 임계 영역 종료");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // 3️⃣ V(): 세마포어 자원 반환
            semaphore.release();
        }
    }

    public static void main(String[] args) {
        SemaphoreExample example = new SemaphoreExample();

        for (int i = 1; i <= 5; i++) {
            Thread t = new Thread(example::accessCriticalSection);
            t.setName("Thread-" + i);
            t.start();
        }
    }
}
