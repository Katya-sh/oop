import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerS {
    private static final Logger logger = Logger.getLogger(LoggerS.class.getName());

    public static void logInfo(String message) {
        logger.log(Level.INFO, message);
    }

    public static void logError(String message) {
        logger.log(Level.SEVERE, message);
    }
}
