package br.univille.log;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerFile implements Logger {
    private static final String FILE_NAME = "log.txt";

    @Override
    public void log(Level level, String message) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME, true))) {
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            writer.println(timestamp + " " + level + ": " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
