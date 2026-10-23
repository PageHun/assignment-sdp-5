import com.calculator.Calculator;
import com.strategy.AddStrategy;
import com.strategy.OperationStrategy;
import com.strategy.SubstractStrategy;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(5, 4, new AddStrategy());
        System.out.println(calculator.getResult());
        calculator.setOperationStrategy(new SubstractStrategy());
        System.out.println(calculator.getResult());
    }
}
