package br.univille.log;

public class LoggerConsole implements Logger {
    @Override
    public void log(Level level, String message) {
        String color;
        switch (level) {
            case debug:
                color = "\u001B[32m";
                break;
            case aviso:
                color = "\u001B[33m";
                break;
            case erro:
                color = "\u001B[31m";
                break;
            default:
                color = "\u001B[0m";
        }
        System.out.println(color + level + ": " + message + "\u001B[0m");
    }
}
