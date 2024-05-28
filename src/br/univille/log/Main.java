package br.univille.log;

public class Main {
    public static void main(String[] args) {
        Logger consoleLogger = LoggerFactory.onConsole();
        consoleLogger.log(Level.debug, "Tudo ocorreu bem!");
        consoleLogger.log(Level.aviso, "Cuidado! Está pergiso!");
        consoleLogger.log(Level.erro, "Existe um erro aí!");

        Logger fileLogger = LoggerFactory.onFile();
        fileLogger.log(Level.debug, "Tudo ocorreu bem!");
        fileLogger.log(Level.aviso, "Cuidado! Está pergiso!");
        fileLogger.log(Level.erro, "Existe um erro aí!");
    }
}
