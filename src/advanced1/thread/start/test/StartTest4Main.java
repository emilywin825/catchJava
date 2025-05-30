package advanced1.thread.start.test;

import java.util.concurrent.TransferQueue;

import static advanced1.thread.start.MyLogger.log;

public class StartTest4Main {
    public static void main(String[] args) {
        Thread threadA = new Thread(new PrintWork("A", 1000), "Thread-A");
        threadA.start();
        Thread threadB = new Thread(new PrintWork("B", 500), "Thread-B");
        threadB.start();
    }

    static class PrintWork implements Runnable {
        String content;
        int sleepTime;

        public PrintWork(String content, int sleepTime) {
            this.content = content;
            this.sleepTime = sleepTime;
        }

        @Override
        public void run() {
            while (true) {
                log(content);
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
