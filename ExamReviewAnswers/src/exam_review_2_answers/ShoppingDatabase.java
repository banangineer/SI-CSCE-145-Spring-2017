package exam_review_2_answers;

public class ShoppingDatabase {
  private ShoppingItems[] items = new ShoppingItems[10];
  
  public ShoppingDatabase () {
    for (int i = 0; i < items.length; ++i) {
      items[i] = null;
    }
  }
  
  public double getTotalPrice() {
    double totalPrice = 0.0;
    
    for (int i = 0; items[i] != null; ++i) {
      totalPrice += items[i].getPrice();
    }
    
    return totalPrice;
  }
  
  public void addItemToList(ShoppingItems anItem) {
    int i = 0;
    for (i = 0; items[i] != null; ++i);
    
    if (i > items.length-1) {
      System.out.println("Too many items!");
      return;
    }
    
    items[i] = anItem;
  }
  
  public void clearList() {
    for (int i = 0; i < items.length; ++i) {
      items[i] = null;
    }
  }
}