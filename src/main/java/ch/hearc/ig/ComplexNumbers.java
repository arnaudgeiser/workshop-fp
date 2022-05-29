package ch.hearc.ig;

public class ComplexNumbers {

  record ComplexNumber(double real, double imaginary) {}

  public double real(ComplexNumber complexNumber) {
    return complexNumber.real;
  }

  public static double abs(ComplexNumber complexNumber) {
    return Math.sqrt(Math.pow(complexNumber.real,2) + Math.pow(complexNumber.imaginary, 2));
  }

  public static ComplexNumber conjucate(ComplexNumber complexNumber) {
    return new ComplexNumber(complexNumber.real, -complexNumber.imaginary);
  }

  public static ComplexNumber add(ComplexNumber complexNumber1, ComplexNumber complexNumber2) {
    return new ComplexNumber(complexNumber1.real + complexNumber2.real, complexNumber1.imaginary + complexNumber2.imaginary);
  }

  public static ComplexNumber sub(ComplexNumber complexNumber1, ComplexNumber complexNumber2) {
    return new ComplexNumber(complexNumber1.real - complexNumber2.real, complexNumber1.imaginary - complexNumber2.imaginary);
  }

  public static ComplexNumber mul(ComplexNumber complexNumber1, ComplexNumber complexNumber2) {
    return new ComplexNumber(complexNumber1.real *  complexNumber2.real - complexNumber1.imaginary * complexNumber2.imaginary, complexNumber1.imaginary * complexNumber2.real + complexNumber1.real * complexNumber2.imaginary);
  }

  public static ComplexNumber div(ComplexNumber complexNumber1, ComplexNumber complexNumber2) {
    return new ComplexNumber((complexNumber1.real *  complexNumber2.real + complexNumber1.imaginary * complexNumber2.imaginary) /
        (Math.pow(complexNumber2.real,2) + Math.pow(complexNumber2.imaginary, 2)),
        (complexNumber1.imaginary * complexNumber2.real - complexNumber1.real * complexNumber2.imaginary) / (Math.pow(complexNumber2.real,2) + Math.pow(complexNumber2.imaginary, 2)));
  }
}
