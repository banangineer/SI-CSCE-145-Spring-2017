package date_exceptions;

//------------------------------------------------------------------------------
/**
* @author judsonjames
* @version 1.0
* @date 04-12-2017
*/
//------------------------------------------------------------------------------
public class DayException extends Exception {
  public DayException() {
    super("This day is in the wrong range for the month provided.");
  }
  public DayException(String msg) {
    super(msg);
  }
}
