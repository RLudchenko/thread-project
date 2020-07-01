package rostyslav.ludchenko;

public class Counter {
    private static int counter = 0;
    private final int limit = 100;

    public int getCounter() {
        return counter;
    }

    public void count() {
        counter++;
    }

    public boolean isFinished() {
        return counter == limit;
    }
}
