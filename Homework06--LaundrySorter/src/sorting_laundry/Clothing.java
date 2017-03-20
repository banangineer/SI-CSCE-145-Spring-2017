package sorting_laundry;

//---------------------------------------------------------------------------
/**
* 
* @author judsonjames
* @version 1.1
* @since 03-15-2017
* 
* <h1><b>CSCE 145 -- Homework 06 -- Sorting Laundry</b></h1>
* <h2><i>Clothing -- Object Class</i></h2>
* 
* <p>
* This class is designed to act as an object for the Dresser and 
* DresserFrontEnd classes. It is a wrapper for two Strings, the type and the
* color of the Clothing.
* </p>
*/
//---------------------------------------------------------------------------
public class Clothing {
  private String type;
  private String color;

  // Default Constructor
  public Clothing () {
    this.type = "";
    this.color = "";
  }

  // Parameterized Constructor
  public Clothing (String aType, String aColor) {
    setType(aType);
    setColor(aColor);
  }

  public String getType () {
    return this.type;
  }
  public String getColor () {
    return this.color;
  }

  public void setType (String aType) {
    String[] validTypes = {"undergarment", "socks", "stockings",
                            "top", "bottom", "cape"};
    for (int i = 0; i < validTypes.length; ++i) {
      if (aType.toLowerCase().equals(validTypes[i])) {
        this.type = aType.toLowerCase();
        return; 
      }
    }
    this.type = "";
  } // end setType

  public void setColor (String aColor) {
    String[] validColors = {"brown", "red", "pink", "orange", "green", 
                             "blue", "purple", "grey"};
    for (int i = 0; i < validColors.length; ++i) {
      if (aColor.toLowerCase().equals(validColors[i])) {
        this.color = aColor.toLowerCase();
        return;
      }
    }
    this.color = "";
  } // end setColor

  public String toString () {
    return "Clothing [type=" + type + ", color=" + color + "]";
  }

  public boolean equals (Clothing aClothing) {
    if (this.type.equals(aClothing.getType())
        && this.color.equals(aClothing.getColor())) {
    return true;
  }
  return false;
  }
} // end of Clothing class