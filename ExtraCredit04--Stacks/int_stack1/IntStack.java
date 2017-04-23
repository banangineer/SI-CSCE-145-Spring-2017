package int_stack1;

public class IntStack {
  // Interior Class -- Private Class
  private class StackNode {
    private int data;
    private StackNode next;
    
    public StackNode() {
      this.data = 0;
      this.next = null;
    }
    
    public StackNode(int aData, StackNode aLink) {
      this.data = aData;
      this.next = aLink;
    }
  } // end of Interior Class
  
  // Start the IntStack
  // Instance Variables
  private StackNode head;
  
  // Constructor
  public IntStack() {
    this.head = null;
  }
    
  // push --> adding to the top of the stack
  public void push(int aData) {
    StackNode newNode = new StackNode(aData, null);
    StackNode oldHead = this.head;
    
    if (this.head == null) {
      this.head = newNode;
      return;
    }
    this.head = newNode;
    this.head.next = oldHead;
  }
  
  // pop --> removing from the top of the stack
  public int pop() {    
    // remove from the top
    if (canPop() == true) {
      StackNode oldHead = this.head;
      this.head = null;
      this.head = oldHead.next;
      return oldHead.data;
    }
    else {
      System.out.println("Cannont Pop, empty Stack");
      return 0;
    }
  }
  
  // canPop --> checks if the head is null, if not, then return true
  public boolean canPop() {
    if (this.head == null) {
      return false;
    }
    return true;
  }
  
  // printStack --> iterates through the IntStack and prints the list.
  public void printStack() {
    StackNode current = this.head;
    while (current != null) {
      System.out.println(current.data);
      current = current.next;
    }
  }
}
