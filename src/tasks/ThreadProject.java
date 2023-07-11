package tasks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadProject extends Thread {
    /*
    10 threadlik bir pool da çalışacak basit bir task yazmanı istiyorum.
    her seferinde 100 ms sleep yapıp ardından sırayla 1 den 100 e kadar tüm sayıları ekrana yazacak bir uygulama yazmanı istiyorum.
    Çıktı olarak 100 e kadar tüm sayıları görücez.
     */
    private int threadNumber;

    public ThreadProject(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Thread " + threadNumber + ": " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        int threadCount = 10;
/*
        for (int i = 0; i < threadCount; i++) {
            ThreadProject thread = new ThreadProject(i);
            thread.start();
        }

    }

 */
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 1; i <= 100; i++) {
            int sayi = i;
            executor.execute(() ->
            {
                try {
                    System.out.println(Thread.currentThread().getName() + ": " + sayi);
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
    }
}
