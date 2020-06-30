package rostyslav.ludchenko;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ImplementsRunnable implements Runnable {
    private static final Logger LOGGER = LogManager.getLogger(ImplementsRunnable.class);
    private int count = 0;

    @Override
    public void run() {
        while (count != 100) {
            count++;
            LOGGER.info("ImplementsRunnable: " + count + "\n");
        }
    }
}
