package shape_area;

public class Circle implements Shape {
  private double radius;
  
  // Constructors
  public Circle () {
    radius = 0.0;
  }
  
  public Circle (double aRadius) {
    setRadius(aRadius);
  }
  
  public double getArea() {
    return (Math.PI * Math.pow(radius, 2.0));
  }

  public String toString() {
    return "Circle [radius=" + radius + ", area=" + this.getArea() + "]";
  }
  
  public String getShapeType() {
    return "Circle";
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double aRadius) {
    if (aRadius > 0.0) {
      this.radius = aRadius;
    } else {
      System.out.println("Invalid Radius");
      this.radius = 0.0;
    }
  }
} // end of Circle
