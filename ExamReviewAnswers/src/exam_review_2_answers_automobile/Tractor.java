package exam_review_2_answers_automobile;

public class Tractor implements Automobile{
  private double price;
  private double haulWeight;
  
  public double getPrice() {
    return this.price;
  }
  public String getAutoType() {
    return "tractor";
  }
  public Tractor(double price, double haulWeight) {
    setPrice(price);
    setHaulWeight(haulWeight);
  }
  public double getHaulWeight() {
    return haulWeight;
  }
  public void setHaulWeight(double haulWeight) {
    if (haulWeight > 0.0) {
      this.haulWeight = haulWeight;
    }
  }
  public void setPrice(double price) {
    this.price = price;
  }
  public String toString() {
    return "Tractor [price=" + price + ", haulWeight=" + haulWeight + "]";
  }
}
