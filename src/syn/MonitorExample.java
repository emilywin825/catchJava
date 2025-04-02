package syn;

public class MonitorExample {

    private int count = 0;

    // 1️⃣ synchronized 메서드 → 임계 구역 보호
    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + " → count: " + count);
        try {
            Thread.sleep(500); // 임계 구역
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MonitorExample example = new MonitorExample();

        for (int i = 1; i <= 5; i++) {
            Thread t = new Thread(() -> {
                example.increment();
            });
            t.setName("Thread-" + i);
            t.start();
        }
    }
}
