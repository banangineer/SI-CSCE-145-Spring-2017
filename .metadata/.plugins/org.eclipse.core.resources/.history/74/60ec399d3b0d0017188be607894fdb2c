package sorting_laundry;

//---------------------------------------------------------------------------
/**
* 
* @author judsonjames
* @version 1.1
* @since 03-15-2017
* 
* <h1><b>CSCE 145 -- Homework 06 -- Sorting Laundry</b></h1>
* <h2><i>Dresser -- Database Collection of Clothing</i></h2>
* 
* <p>
* This class will be used to hold the Clothing objects in a two-dimensional
* array. The first dimension is used for "drawers" within the Dresser, and
* the second dimension is used for the "spots" within each "drawer."
* </p>
*/
//---------------------------------------------------------------------------

public class Dresser {
// We will use Constants to keep good coding practice (no magic numbers)
private final int DRAWERS = 5;
private final int SPOTS = 10;
private Clothing[][] clothes = new Clothing[DRAWERS][SPOTS];

// Default Constructor
public Dresser () {
  for (int i = 0; i < clothes.length; ++i) {
    for (int j = 0; j < clothes[i].length; ++j) {
      clothes[i][j] = null;
    }
  }
} // end Default Constructor

//---------------------------------------------------------------------------
/**
 * The print method is designed to complete the following tasks:
 * 1) Print out all clothing objects until a null index is found. The remove
 * method shifts the next index forward, so there will never be a gap between
 * the objects.
 */
//---------------------------------------------------------------------------
public void print () {
  for (int i = 0; i < clothes.length; ++i) {
    System.out.println("Drawer #" + (i+1));
    for (int j = 0; clothes[i][j] != null; ++j) {
      System.out.println(clothes[i][j]);
    }
    System.out.println();
  }
} // end print method
//---------------------------------------------------------------------------
/**
 * The add method is designed to complete the following tasks:
 * 1) Determine what drawer to put the Clothing item and valid entry.
 * 2) Check to make sure that the drawer is not full.
 * 3) Calculate the next spot in the drawer to add the clothing.
 * 4) Add the clothing in the next available spot.
 * @param aClothing
 */
//---------------------------------------------------------------------------
public void add (Clothing aClothing) {
  int drawer = 0;
  int spot = 0;
  
  // We check for valid clothing types so that we can try to 
  // put the aClothing parameter into it's correct drawer.
  if (aClothing.getType().equals("") || aClothing.getColor().equals("")) {
    System.out.println("Invalid Entry.");
    return;
  } else if (aClothing.getType().equalsIgnoreCase("undergarment")) {
    drawer = 0;
  } else if (aClothing.getType().equalsIgnoreCase("socks") 
      || aClothing.getType().equals("stockings")) {
    drawer = 1;
  } else if (aClothing.getType().equalsIgnoreCase("top")) {
    drawer = 2;
  } else if (aClothing.getType().equalsIgnoreCase("bottom")) {
    drawer = 3;
  } else if (aClothing.getType().equalsIgnoreCase("cape")) {
    drawer = 4;
  }
  
  // This checks to see if the drawer is full or not.
  if (clothes[drawer][SPOTS-1] != null) {
    System.out.println("You can't add any more!");
    return;
  }
  
  // We have to calculate the spot where we can add the next 
  for (spot = 0; 
      clothes[drawer][spot] != null && spot < clothes[spot].length; ++spot);
  
  clothes[drawer][spot] = aClothing;
} // end add method

//---------------------------------------------------------------------------
/**
 * The remove method is designed to complete the following tasks:
 * 1) Determine what drawer the clothing item has to go in.
 * 2) Determine if it is possible to remove from the drawer.
 * 3) Determine the location of the clothing object to remove.
 * 4) Set the value of the removed object to null.
 * 5) Shift any null Clothing items forward so that there are no gaps between
 * clothing.
 * @param aClothing
 */
//---------------------------------------------------------------------------
public void remove (Clothing aClothing) {
  int drawer = 0;
  int spot = 0;
  
  // The same check from add (Clothing aClothing) is used here so that the
  // program can narrow the search for what drawer to remove from.
  if (aClothing.getType().equals("") || aClothing.getColor().equals("")) {
    System.out.println("Invalid Entry.");
    return;
  } else if (aClothing.getType().equals("undergarment")) {
    drawer = 0;
  } else if (aClothing.getType().equals("socks") 
      || aClothing.getType().equals("stockings")) {
    drawer = 1;
  } else if (aClothing.getType().equals("top")) {
    drawer = 2;
  } else if (aClothing.getType().equals("bottom")) {
    drawer = 3;
  } else if (aClothing.getType().equals("cape")) {
    drawer = 4;
  }
  
  // If there are no clothing items in the drawer, we should not remove clothing.
  if (clothes[drawer][0] == null) {
    System.out.println("There is nothing to remove!");
    return;
  }
  
  // If there are still items in the drawer, we have to go through the drawer
  // to find the corresponding clothing item.
  while (clothes[drawer][spot] != null
      && clothes[drawer][spot].equals(aClothing) == false) {
    ++spot;
  }
  
  // Once we know what item to remove, we will make the instance of the
  // array equal to null.
  clothes[drawer][spot] = null;
  
  // Once an object has been removed from the list, then we have to shift 
  // the drawer to where there are no empty spaces between articles of
  // clothing. This is because of the way that the print() method is written.
  for (int i = 0; i < clothes[drawer].length-1; ++i) {
    if (clothes[drawer][i] == null && clothes[drawer][i+1] != null) {
      Clothing temp = clothes[drawer][i];
      clothes[drawer][i] = clothes[drawer][i+1];
      clothes[drawer][i+1] = temp;
    }
  }
} // end remove method
} // end Dresser class