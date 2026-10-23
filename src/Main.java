import com.Calculator.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(5, 4);
        System.out.println(calculator.getNum1() - calculator.getNum2());
    }
}
