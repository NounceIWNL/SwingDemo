package log;

/*
похожее по домашке для 7го числа!!!
 */

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilterReader;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerDemo {
    private final static Logger logger = Logger.getLogger(LoggerDemo.class.getName());

    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("src/data/holidays.json");
        JSONTokener tokener = new JSONTokener(file);
        JSONArray holidays = new JSONArray(tokener);
//        System.out.println(holidays.get(0).toString());

        LogManager.getLogManager().reset();
        FileHandler fileHandler = new FileHandler("src/data/logFile.log");
        logger.addHandler(fileHandler);

        SimpleFormatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);

        //вывести в лог
        for (Object holiday : holidays) {
            String s = ((JSONObject) holiday).getString("name");
            logger.severe(s);
        }
    }
}
