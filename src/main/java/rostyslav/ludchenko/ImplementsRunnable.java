package rostyslav.ludchenko;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ImplementsRunnable implements Runnable {
    Counter counter;
    private static final Logger LOGGER = LogManager.getLogger(ImplementsRunnable.class);

    public ImplementsRunnable(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (!counter.isFinished()) {
            counter.count();
            LOGGER.info("ImplementsRunnable: " + counter.getCounter() + "\n");
        }
    }
}
