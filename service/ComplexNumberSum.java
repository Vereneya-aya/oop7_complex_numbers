package service;

import model.ComplexNumber;
import view.ComplexNumberLogger;

public class ComplexNumberSum implements Calculate{

    @Override
    public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2) {
        double real = num1.getReal() + num2.getReal();
        double imag = num1.getImag() + num2.getImag();
        ComplexNumberLogger.getInstance().log("Adding: " + num1 + " + " + num2 + " = " + real + " + " + imag + "i");
        return ComplexNumberService.create(real, imag);
    }
    
}
