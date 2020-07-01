package rostyslav.ludchenko;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExtendsThread extends Thread {
    private static final Logger LOGGER = LogManager.getLogger(ExtendsThread.class);
    Counter counter = new Counter();

    @Override
    public void run() {
        while (!counter.isFinished()) {
            counter.count();

            LOGGER.info("ExtendsThread: " + counter.getCounter() + "\n");
        }
    }
}
