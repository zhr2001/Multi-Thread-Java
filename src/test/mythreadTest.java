package test;
import mythread.MyThread;
public class mythreadTest {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.setName("myThread");
        thread.start();
        for (int i = 0; i < 10; i++) {
            int time = (int) (Math.random() * 1000);
            Thread.sleep(time);
            System.out.println("main=" + Thread.currentThread().getName());
        }
    }
}
