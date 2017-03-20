package sorting_laundry;
import java.util.Scanner;
//-----------------------------------------------------------------------------
/**
 * @author judsonjames
 * @version 1.1
 * @since 03-15-2017
 * 
 * <h1><b>CSCE 145 -- Homework 06 -- Sorting Laundry</b></h1>
 * <h2><i>Dresser Front End -- User Interface</i></h2>
 * <p>
 * This class acts as the User-End of the program, being able to collect
 * user-input from the Scanner package and then using the input to connect
 * to the corresponding action. This program, however, does not currently check
 * for invalid type inputs (inputing "socks" instead of a number.)
 * </p>
 */
//-----------------------------------------------------------------------------

public class DresserFrontEnd {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String userType = "";
    String userColor = "";
    int userInt = 0;
    Dresser dresser = new Dresser();

    System.out.println("Welcome to the Dresser!");
    while (userInt != 9) {
      System.out.println("\nEnter 1: to add an item\n" 
          + "Enter 2: to remove an item\n"
          + "Enter 3: to print out the dresser contents\n"
          + "Enter 9: to quit");
      userInt = keyboard.nextInt();
      keyboard.nextLine();
      switch (userInt) {
        case 1:
          System.out.println("\nAdd Item Selected.");
          System.out.println("Enter the type\n"
              + "It may be undergarment, socks, stockings, top, "
              + "bottom, or cape");
          userType = keyboard.nextLine();
          System.out.println("Enter a color\n"
              + "It may be brown, pink, orange, green, blue, purple, or grey");
          userColor = keyboard.nextLine();
          Clothing addClothing = new Clothing(userType, userColor);
          dresser.add(addClothing);
          break;
        case 2:
          System.out.println("\nRemove Item Selected.");
          System.out.println("Enter the type\n"
              + "It may be undergarment, socks, stockings, top, "
              + "bottom, or cape");
          userType = keyboard.nextLine();
          System.out.println("Enter a color\n"
              + "It may be brown, pink, orange, green, blue, purple, or grey");
          userColor = keyboard.nextLine();
          Clothing removeClothing = new Clothing(userType, userColor);
          dresser.remove(removeClothing);
          break;
        case 3:
          dresser.print();
          break;
        case 9:
          break;
        default:
          System.out.println("Invalide input");
          break;
      } // end switch statement
    } // end looping
    System.out.println("Goodbye.");
    keyboard.close();
  } // end main method
}