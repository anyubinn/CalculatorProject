import java.util.List;
import lv2.Calculator;
import lv2.io.CalculatorInput;
import lv2.io.CalculatorOutput;

public class Main {
    public static void main(String[] args) {
        String input = "";
        Calculator cal = new Calculator();
        while (!input.equals("exit")){
            CalculatorOutput.printDivider();
            CalculatorOutput.printDivider();

            int num1 = CalculatorInput.inputNumber();
            int num2 = CalculatorInput.inputNumber();
            CalculatorOutput.printDivider();

            char operator = CalculatorInput.inputOperator();
            CalculatorOutput.printDivider();

            Integer result = cal.calculator(num1, num2, operator);
            CalculatorOutput.printOneResult(num1, num2, operator, result);
            CalculatorOutput.printDivider();

            List<String> results = cal.getResults();
            CalculatorOutput.printAllResults(results);

            CalculatorOutput.printDivider();
            CalculatorOutput.printDivider();
            input = CalculatorInput.inputAgain();
        }
    }
}