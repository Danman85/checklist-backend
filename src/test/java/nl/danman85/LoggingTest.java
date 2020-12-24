package nl.danman85;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class LoggingTest {

    @Test
    public void givenLoggerWithConsoleConfig_whenLogToConsole_thenOk() {
        final Logger logger = LogManager.getLogger(getClass());
        final Exception e = new Exception("This is a test!");

        logger.info("Message at INFO level, it should be hidden.");
        logger.error("Message at ERROR level, it should be displayed.", e);
    }
}
