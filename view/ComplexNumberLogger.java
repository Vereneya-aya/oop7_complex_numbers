package view;

import java.util.logging.Logger;
import java.util.logging.ConsoleHandler;
import java.util.logging.SimpleFormatter;

public class ComplexNumberLogger {
    private static ComplexNumberLogger instance = null;
    private Logger logger;

    private ComplexNumberLogger() {
        logger = Logger.getLogger("ComplexCalculatorLogger");
        ConsoleHandler handler = new ConsoleHandler();
        handler.setFormatter(new SimpleFormatter());
        logger.addHandler(handler);
        logger.setUseParentHandlers(false);
    }

    public static ComplexNumberLogger getInstance() {
        if (instance == null) {
            instance = new ComplexNumberLogger();
        }
        return instance;
    }

    public void log(String message) {
        logger.info(message);
    }}
