package int_stack1;
import java.util.Random;

public class IntStackDriver {

  public static void main(String[] args) {
    Random random = new Random();
    int stackInitial = 10;
    IntStack stack = new IntStack();
    int popValue = 0;
    
    System.out.println("Inserting numbers into the stack.");
    
    for (int i = 0; i < stackInitial; ++i) {
      stack.push(random.nextInt(8) + 1);
    }
    
    System.out.println("Printing out the Stack:");
    stack.printStack();
    
    System.out.println("Popping off two numbers");
    popValue = stack.pop();
    System.out.println(popValue);
    popValue = stack.pop();
    System.out.println(popValue);
    
    System.out.println("Pushing three random numbers");
    for (int i = 0; i < 3; ++i) {
      stack.push(random.nextInt(8) + 1);
    }
    
    System.out.println("Printing the new stack.");
    stack.printStack();
  }
}
