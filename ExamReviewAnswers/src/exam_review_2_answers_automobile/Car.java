package exam_review_2_answers_automobile;

public class Car implements Automobile {
  private double price;
  private int numberOfSeats;
  

  public Car() {
    this.price = 0.0;
    this.numberOfSeats = 0;
  }
  public Car(double aPrice, int aNumberOfSeats) {
    setPrice(aPrice);
    setNumberOfSeats(aNumberOfSeats);
  }
  
  public String getAutoType() {
    return "car";
  }
  
  public double getPrice() {
    return this.price;
  }
  public int getNumberOfSeats() {
    return numberOfSeats;
  }
  public void setNumberOfSeats(int numberOfSeats) {
    if (numberOfSeats > 0) {
      this.numberOfSeats = numberOfSeats;
    }
    else {
      System.out.println("Where ya gonna sit?");
      this.numberOfSeats = 1;
    }
  }
  public void setPrice(double price) {
    if (price > 0.0) {
      this.price = price;
    }
    else {
      System.out.println("That's too low");
      this.price = 0.0;
    }
  }
  public String toString() {
    return "Car [price=" + price + ", numberOfSeats=" + numberOfSeats + "]";
  }
}
