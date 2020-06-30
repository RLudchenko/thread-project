package rostyslav.ludchenko;

public class MainThread {
    public static void main(String[] args) {
        ExtendsThread extendsThread = new ExtendsThread();
        extendsThread.start();
        Runnable runnable = new ImplementsRunnable();
        Thread runnableThread = new Thread(runnable);
        runnableThread.start();
    }
}
