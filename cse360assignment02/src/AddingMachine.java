/**
 * @author Dawson Treese
 */
package cse360assignment02.src; 
public class AddingMachine {
  private int total;
  private String out;
  /**
   * <p> Default contructor of object AddingMachine. Sets 'total' to '0' and the string log to "0"</p>
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    out = "0";
  }

  /**
   * <p> Returns the AddingMachine instance variable's current 'total'</p>
   * @return Retrieve instance's current total
   */
  public int getTotal () {
    return total;
  }

  /**
   * <p> Accepts an integer argument and adds that value to the total variable. Also logs current addition to the 'out' string</p>
   * @param value added to the total
   */
  public void add (int value) {
    total += value;
    out += " + " + Integer.toString(value);
  }

  /**
   * <p> Accepts an integer argument and subtracts that value to the total variable. Also logs current subtraction to the 'out' string</p>
   * @param value subtracted from total
   */
  public void subtract (int value) {
    total -= value;
    out += " - " + Integer.toString(value);
  }

  /**
   * <p> Returns the 'out' string variable which holds a history log of the operations committed to the 'total' variable</p>
   * @return String of adding and subtracting logs
   */
  public String toString () {
    return out;
  }

  /**
   * <p> Void method- clears all operations performed on the total and out variables and returns everything to its original value</p>
   */
  public void clear() {
    total = 0;
    out = "";
  }
}