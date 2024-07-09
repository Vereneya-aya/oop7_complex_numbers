package service;

import model.ComplexNumber;
import view.ComplexNumberLogger;

public class ComplexNumberMultiplication implements Calculate {

    @Override
    public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2) {
        double real = num1.getReal() * num2.getReal() - num1.getImag() * num2.getImag();
        double imag = num1.getReal() * num2.getImag() + num1.getImag() * num2.getReal();
        ComplexNumberLogger.getInstance().log("Multiplying: " + num1 + " * " + num2 + " = " + real + " + " + imag + "i");
        return ComplexNumberService.create(real, imag);
    }
}
