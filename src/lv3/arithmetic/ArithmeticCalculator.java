package lv3.arithmetic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticCalculator {

    private List<Double> results;

    public ArithmeticCalculator() {
        this.results = new ArrayList<>();
    }

    public <T extends Number> double calculate(T num1, T num2, OperatorType operator) {
        double result = operator.calculate(num1, num2);
        results.add(result);
        removeOldOneResults();
        return result;
    }

    public List<Double> getResults() {
        return results;
    }

    private void removeOldOneResults() {
        if (results.size() > 3) {
            results.remove(0);
        }
    }

    public <T extends Number> List<Double> getBiggerResults(T num1, T num2) {
        return results.stream()
                .filter(results -> results.compareTo((Double) num1) > 0 || results.compareTo((Double) num2) >0)
                .collect(Collectors.toList());
    }
}