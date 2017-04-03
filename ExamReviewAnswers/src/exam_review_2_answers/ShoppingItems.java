package exam_review_2_answers;

public class ShoppingItems {
  private String name;
  private double price;
  
  public ShoppingItems (String aName, double aPrice) {
    setName(aName);
    setPrice(aPrice);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    if (price > 0.0) {
      this.price = price;
    }
    else {
      System.out.println("Free Item!");
      this.price = 0.0;
    }
  }
  
  
}
