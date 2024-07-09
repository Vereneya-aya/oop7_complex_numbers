package service;

import model.ComplexNumber;

public class ComplexNumberService {
    public static ComplexNumber create(double real, double imag) {
        return new ComplexNumber(real, imag);
    }
}
