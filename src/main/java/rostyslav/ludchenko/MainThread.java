package rostyslav.ludchenko;

public class MainThread {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread extendsThread = new ExtendsThread(counter);
        extendsThread.start();
        Runnable runnable = new ImplementsRunnable(counter);
        Thread runnableThread = new Thread(runnable);
        runnableThread.start();
    }
}
