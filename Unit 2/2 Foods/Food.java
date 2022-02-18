/**
 * Name: Mike Liang
 * Date: February 17 2022
 * Description:
 * A Food class that defines a food with the atrributes name - the
 * name of the food, servingTemp - the serving temperature of the
 * food, currTemp - the current temperature of the food and weight
 * - the weight of the food.
 */
public class Food {

  /*
   * Constants related to servingTemp
   */
  private final int COLD = 0;
  private final int WARM = 1;
  private final int HOT = 2;

  /**
   * Constants related to max temperatures to heat up to index is related to the
   * servingTemp
   */
  private final double[] MAX_TEMP = { 41, 135, 200 };

  /*
   * Attributes
   */

  private String name;

  /**
   * used to find the serving temperature for the food
   */
  private int servingTemp;
  /**
   * the current temperature of the food in fahrenheit
   */
  private double currTemp;

  // You shouldn't do this... why not?

  /*
   * Answer:
   * You should not do this because if multiple other programs depend on this
   * class and access this attribute with their custom methods, any change to this
   * attribute or this class might break all those other programs. This is why it
   * is better to define a modifier which will provide the right amount of access
   * to this variable so all other programs can use that modifer layer which
   * preserves continuity.
   */

  /**
   * the current weight of the food in grams
   */
  public double weight;

  /**
   * Constructs a Food object with a name, weight of the food, serving temperature
   * and current temperture.
   * 
   * @param name            - the name of the food
   * @param weight          - the value of the weight of the food
   * @param servingTempText - the serving temperature of the food
   * @param currTemp        - the current temperature of the food in fahrenheit
   */
  public Food(String name, double weight, String servingTempText, double currTemp) {
    this.name = name;
    this.weight = weight;
    this.currTemp = currTemp;

    if (servingTempText.equalsIgnoreCase("cold")) {
      this.servingTemp = COLD;
    } else if (servingTempText.equalsIgnoreCase("warm")) {
      this.servingTemp = WARM;
    } else {
      this.servingTemp = HOT;
    }
  }

  /*
   * Methods - Accessors
   */

  /**
   * Getter method that returns the classes's attribute
   * 
   * @return name - the name attribute of this class
   */
  public String getName() {
    // Returns the name attribute of this class
    return this.name;
  }

  /**
   * Getter method that returns the classes's attribute
   * 
   * @return currTemp - the current temperature attribute of this class
   */
  public double getCurrTemp() {
    // Returns the currTemp attribute of this class
    return this.currTemp;
  }

  /*
   * Methods - Mutators
   */

  /**
   * Heats the food up by 10 degrees, provided it is under the expected heating
   * temp
   * If the temperature will exceed the serving temp, it will only match the
   * serving temperature
   */
  public void heatUp() {
    if (currTemp + 10 > MAX_TEMP[servingTemp]) { // Make sure that the current temperature is right at the maximum
                                                 // serving temperature
      currTemp = MAX_TEMP[servingTemp];
    } else { // Heat up the food by increasing the current temperature.
      currTemp += 10;
    }
  }
}