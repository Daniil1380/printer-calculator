package main;

import calculator.MathCalculator;
import history.HistoryService;
import history.HistoryServiceImpl;
import parser.StringParser;
import printer.ConsolePrinter;
import printer.FilePrinter;
import printer.Printer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HistoryService historyService = new HistoryServiceImpl();
        Printer printer = new ConsolePrinter();
        MathCalculator mathCalculator = new MathCalculator(printer, historyService);
        Scanner scanner = new Scanner(System.in);
        StringParser stringParser = new StringParser(mathCalculator, scanner, historyService);

        while (true) {
            stringParser.parse();
        }
    }
}
