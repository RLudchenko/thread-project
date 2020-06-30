package rostyslav.ludchenko;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExtendsThread extends Thread {
    private static final Logger LOGGER = LogManager.getLogger(ExtendsThread.class);
    int count = 0;

    @Override
    public void run() {
        int fin = 100;
        while (count != fin) {
            count++;
            LOGGER.info("ExtendsThread: " + count + "\n");
        }
    }
}
