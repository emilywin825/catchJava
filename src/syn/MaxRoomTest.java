package syn;

public class MaxRoomTest {
    private int room = 2;
    private static final int MAXROOM = 3;

    public synchronized void Mt() {
        try {
            Thread.sleep(500); // 임계 구역
            if (room >= MAXROOM) {
                System.out.println("가능한 like의 개수를 초과했습니다.");
            } else {
                room += 1;
                System.out.println("room 개수 : " + room);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        MaxRoomTest monitorTest = new MaxRoomTest();
        for (int i = 0; i < 2; i++) {
            Thread t = new Thread(() -> monitorTest.Mt());
            t.setName("Thread-" + i);
            t.start();
        }

    }
}
