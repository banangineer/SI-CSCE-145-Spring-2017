package exam_review_2_answers;

public class Math {
  
  // Finding the area of a Trapezoid
  public static double findArea(double a, double b, double h) {
    double returnValue = 0.0;
    returnValue = ((a + b) * h) / 2;
    return returnValue;
  }
  
  public static double[] getQuadratic(int a, int b, int c) {
    double[] returnArray = new double[2];
    double temp = 0.0;
    temp = ((b*b) - 4*(a*c));
    // Finding what's under the square root
    temp = java.lang.Math.sqrt(temp); // because the name of the class is Math,
                                      // we need to specify the java sqrt
    returnArray[0] = ((-1*b) + temp) / 2.0;
    returnArray[1] = ((-1*b) - temp) /2.0;
    return returnArray;
  }
  
  public static int getRange (int[] array) {
    int smallest = 999999999;
    int largest = 0;
    
    for (int i = 0; i < array.length; ++i) {
      if (array[i] > largest) {
        largest = array[i];
      }
      else if (array[i] < smallest) {
        smallest = array[i];
      }
    }
    
    return largest - smallest;
  }
}
