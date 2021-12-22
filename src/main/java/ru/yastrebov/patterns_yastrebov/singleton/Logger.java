package ru.yastrebov.patterns_yastrebov.singleton;

public class Logger {
    private static Logger logger;
    private static String logString = "Log info: ";

    public static Logger getLogger() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    private Logger() {

    }

    public void addClassName(Object object) {

       logString += object.getClass() + ", ";
    }

    public void printLogString() {
        System.out.println(logString);
    }
}
