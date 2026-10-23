import com.calculator.Calculator;
import com.strategy.AddStrategy;
import com.strategy.MultiplyStrategy;
import com.strategy.SubtractStrategy;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(5, 4, new AddStrategy());
        System.out.println("Numbers: "  + calculator.getFirstNumber() + ", " + calculator.getSecondNumber() + ".");
        System.out.println("Addition: " + calculator.getResult() + ".");

        calculator.setOperationStrategy(new SubtractStrategy());
        System.out.println("Subtraction: " + calculator.getResult() + ".");

        calculator.setOperationStrategy(new MultiplyStrategy());
        System.out.println("Multiplication: " + calculator.getResult() + ".");
    }
}
