package service;

import model.ComplexNumber;
import view.ComplexNumberLogger;

public class ComplexNumberDivision implements Calculate {

    @Override
    public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2) {
        
        double denom = num2.getReal() * num2.getReal() + num2.getImag() * num2.getImag();
        double real = (num1.getReal() * num2.getReal() + num1.getImag() * num2.getImag()) / denom;
        double imag = (num1.getImag() * num2.getReal() - num1.getReal() * num2.getImag()) / denom;
        ComplexNumberLogger.getInstance().log("Dividing: " + num1 + " / " + num2 + " = " + real + " + " + imag + "i");
        return ComplexNumberService.create(real, imag);
    }
    
}
