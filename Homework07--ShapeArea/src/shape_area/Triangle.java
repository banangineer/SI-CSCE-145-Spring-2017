package shape_area;

public class Triangle implements Shape {
  // Instance Variables
  private double base;
  private double height;
  
  // Constructors
  public Triangle () {
    this.base = 0.0;
    this.height = 0.0;
  }
  public Triangle (double aBase, double aHeight) {
    setBase(aBase);
    setHeight(aHeight);
  }
  
  // Implemented Interface Methods
  public double getArea () {
    return ((0.5 * this.height * this.base));
  }
  public String toString () {
    return "Triangle [base=" + this.base + ", height=" + this.height 
        + ", area=" + this.getArea() + "]";
  }
  public String getShapeType () {
    return "Triangle";
  }
  
  // Object-Specific Methods
  public double getBase () {
    return this.base;
  }
  
  public void setBase (double aBase) {
    if (aBase > 0.0) {
      this.base = aBase;
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
