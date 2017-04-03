package exam_review_2_answers_automobile;

public class Truck implements Automobile {
  private double price;
  private double areaOfBed;
  
  public Truck(double price, double areaOfBed) {
    this.price = price;
    this.areaOfBed = areaOfBed;
  }
  public double getAreaOfBed() {
    return areaOfBed;
  }
  public void setAreaOfBed(double areaOfBed) {
    if (areaOfBed > 0.0) {
      this.areaOfBed = areaOfBed;
    }
  }
  public void setPrice(double price) {
    this.price = price;
  }
  public double getPrice() {
    return this.price;
  }
  public String getAutoType() {
    return "truck";
  }
  public String toString() {
    return "Truck [price=" + price + ", areaOfBed=" + areaOfBed + "]";
  }
}
