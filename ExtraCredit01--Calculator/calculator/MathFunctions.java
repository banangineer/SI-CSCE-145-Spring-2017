package calculator;

public class MathFunctions {
  
  public static double addition(double first, double second) {
    return first + second;
  }
  
  public static double subtraction(double first, double second) {
    return first - second;
  }
  
  public static double multiplication(double first, double second) {
    return first * second;
  }
  
  public static double division(double first, double second) {
    return first / second;
  }
  
  public static double sine(double theta) {
    return Math.sin(theta);
  }
  
  public static double cosine(double theta) {
    return Math.cos(theta);
  }
  
  public static double tangent(double theta) {
    return Math.tan(theta);
  }
  
  public static double arcsine(double theta) {
    return Math.asin(theta);
  }
  
  public static double arccosine(double theta) {
    return Math.acos(theta);
  }
  
  public static double arctangent(double theta) {
    return Math.atan(theta);
  }
  
  public static double exponent(double base, double power) {
    return Math.pow(base, power);
  }
  
  public static double squareRoot(double base) {
    return Math.sqrt(base);
  }
  
  public static double log(double factor) {
    return Math.log(factor);
  }
}
