import model.ComplexNumber;
import service.ComplexNumberCalculator;
import service.ComplexNumberDivision;
import service.ComplexNumberMultiplication;
import service.ComplexNumberService;
import service.ComplexNumberSum;

public class Main {
    public static void main(String[] args) {
        ComplexNumber num1 = ComplexNumberService.create(2, 3);
        ComplexNumber num2 = ComplexNumberService.create(1, 4);

        ComplexNumberCalculator calculator = new ComplexNumberCalculator(new ComplexNumberSum());
        ComplexNumber result = calculator.calculate(num1, num2);
        System.out.println("Addition result: " + result);

        calculator.setFunction(new ComplexNumberMultiplication());
        result = calculator.calculate(num1, num2);
        System.out.println("Multiplication result: " + result);

        calculator.setFunction(new ComplexNumberDivision());
        result = calculator.calculate(num1, num2);
        System.out.println("Division result: " + result);
    }
}