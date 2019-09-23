package demo02;

public class ThreadTest {
    public static void main(String[] args) {
        createThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });

        createThread(()-> System.out.println(Thread.currentThread().getName()));


    }
    public static void createThread(Runnable runnable){
        new Thread(runnable).start();
    }
}
