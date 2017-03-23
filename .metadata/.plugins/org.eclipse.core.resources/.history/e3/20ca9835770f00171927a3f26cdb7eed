package shape_area;

public class Triangle implements Shape {
  // Instance Variables
  private double length;
  private double height;
  
  // Constructors
  public Triangle () {
    this.length = 0.0;
    this.height = 0.0;
  }
  public Triangle (double aLength, double aHeight) {
    setLength(aLength);
    setHeight(aHeight);
  }
  
  // Implemented Interface Methods
  public double getArea () {
    return ((0.5 * this.height * this.length));
  }
  public String toString () {
    return "Triangle [length=" + length + ", height=" + height 
        + ", area=" + this.getArea() + "]";
  }
  public String getShapeType () {
    return "Triangle";
  }
  
  // Object-Specific Methods
  public double getLength () {
    return this.length;
  }
  
  public void setLength (double aLength) {
    if (aLength > 0.0) {
      this.length = aLength;
    } else {
      System.out.println("Invalid Length.");
    }
  }
  
  public double getHeight () {
    return this.height;
  }
  
  public void setHeight (double aHeight) {
    if (aHeight > 0.0) {
      this.height = aHeight;
    }
  }
} // end of Triangle
