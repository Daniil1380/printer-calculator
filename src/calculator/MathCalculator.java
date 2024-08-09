package calculator;


import history.HistoryLine;
import history.HistoryService;
import operator.Operator;
import printer.Printer;

import java.time.LocalDateTime;

public class MathCalculator implements Calculator {

    private final Printer printer;
    private final HistoryService historyService;

    public MathCalculator(Printer consolePrinter, HistoryService historyService) {
        this.printer = consolePrinter;
        this.historyService = historyService;
    }

    public void calculate(double first, double second, Operator operator) {
        double result = 0.0;

        switch (operator) {
            case Operator.SUM -> result = first + second;
            case Operator.SUBTRACTION -> result = first - second;
            case Operator.DIVIDE -> result = first / second;
            case Operator.MULTIPLY -> result = first * second;
        }


        HistoryLine historyLine = new HistoryLine(first, second, result, operator, LocalDateTime.now());

        historyService.addToHistory(historyLine);
        printer.print(result);


    }
}
