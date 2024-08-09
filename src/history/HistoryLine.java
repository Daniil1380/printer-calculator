package history;

import operator.Operator;

import java.time.LocalDateTime;
import java.util.Objects;

public class HistoryLine {

    private double firstOperand;

    private double secondOperand;

    private double result;

    private Operator operator;

    private LocalDateTime localDateTime;


    public HistoryLine(double firstOperand, double secondOperand, double result, Operator operator, LocalDateTime localDateTime) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.result = result;
        this.operator = operator;
        this.localDateTime = localDateTime;
    }

    @Override
    public String toString() {
        return "HistoryLine{" +
                "firstOperand=" + firstOperand +
                ", secondOperand=" + secondOperand +
                ", result=" + result +
                ", operator=" + operator +
                ", localDateTime=" + localDateTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HistoryLine that = (HistoryLine) o;
        return Double.compare(getFirstOperand(), that.getFirstOperand()) == 0 && Double.compare(getSecondOperand(), that.getSecondOperand()) == 0 && Double.compare(getResult(), that.getResult()) == 0 && getOperator() == that.getOperator() && Objects.equals(getLocalDateTime(), that.getLocalDateTime());
    }

    @Override
    public int hashCode() {
        int result1 = Double.hashCode(getFirstOperand());
        result1 = 31 * result1 + Double.hashCode(getSecondOperand());
        result1 = 31 * result1 + Double.hashCode(getResult());
        result1 = 31 * result1 + Objects.hashCode(getOperator());
        result1 = 31 * result1 + Objects.hashCode(getLocalDateTime());
        return result1;
    }

    public double getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(double firstOperand) {
        this.firstOperand = firstOperand;
    }

    public double getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(double secondOperand) {
        this.secondOperand = secondOperand;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
