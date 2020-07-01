package rostyslav.ludchenko;

public class Counter {
    private int counter = 0;
    private final int fin = 100;

    public int getCounter() {
        return counter;
    }

    public void count() {
        counter++;
    }

    public boolean isFinished() {
        return counter == fin;
    }
}
