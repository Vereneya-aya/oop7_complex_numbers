package service;


import model.ComplexNumber;

public class ComplexNumberCalculator {
    private Calculate function;

    public ComplexNumberCalculator(Calculate function) {
        this.function = function;
    }

    public void setFunction(Calculate function) {
        this.function = function;
    }

    public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2) {
        return function.calculate(num1, num2);
    }
}
