package date_exceptions;

//------------------------------------------------------------------------------
/**
* @author judsonjames
* @version 1.0
* @date 04-12-2017
*/
//------------------------------------------------------------------------------
public class MonthException extends Exception {
  public MonthException() {
    super("Months must between 1 and 12 inclusively.");
  }
  public MonthException(String msg) {
    super(msg);
  }
}
