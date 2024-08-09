package parser;

import calculator.Calculator;
import history.HistoryLine;
import history.HistoryService;
import history.HistoryServiceImpl;
import operator.Operator;

import java.util.Scanner;

public class StringParser implements Parser {

    private final Calculator calculator;
    private final Scanner scanner;
    private final HistoryService historyService;

    public StringParser(Calculator calculator, Scanner scanner, HistoryService historyService) {
        this.calculator = calculator;
        this.scanner = scanner;
        this.historyService = historyService;
    }

    public void parse() {
        String stringToCalculate = scanner.nextLine();

        if (stringToCalculate.equals("GET_HISTORY")) {
            System.out.println(historyService.getHistory());
            return;
        }


        String[] operands = stringToCalculate.split(" ");

        String firstOperand = operands[0]; //первое число
        String secondOperand = operands[2]; //второе число
        String operatorString = operands[1]; //знак

        Operator operator = Operator.findByString(operatorString);
        Double first = Double.parseDouble(firstOperand);
        Double second = Double.parseDouble(secondOperand);

        calculator.calculate(first, second, operator);
    }
}
