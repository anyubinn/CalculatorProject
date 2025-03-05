package lv3;

import java.util.ArrayList;
import java.util.List;

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
}