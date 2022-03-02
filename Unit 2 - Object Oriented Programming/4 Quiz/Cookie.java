/**
 * Name: Mike Liang
 * Date: Mar 1 2022
 * Description:
 * This cookie class defines the attributes of a cookie: name,
 * calories, weight, isPackaged and some actions that simulates the caloric
 * consumption of a particular cookie, and the unwrapping of a cookie if the
 * cookie is packaged.
 */
public class Cookie {

  /*
   * Attributes
   */

  /** the name of the cookie */
  String name;
  /** the weight of the cookie */
  double weight;
  /** amount of calories the cookie has */
  int calories;
  /** whether the cookie is packaged or not */
  boolean isPackaged;

  /**
   * Provides a default cookie with attribute values:
   * - name: ""
   * - weight: -1
   * - calories: -1
   * - isPackaged: false
   */
  public Cookie() {
    this.name = "";
    this.weight = -1;
    this.calories = -1;
    this.isPackaged = false;
  }

  /**
   * This filled constructor initializes the name, weight and calories attributes
   * of a Cookie and creates a Cookie object using those attributes
   * 
   * @param name     -> the name of the cookie
   * @param weight   -> the weight of the cookie in grams
   * @param calories -> the amount of calories the cookie has
   */
  public Cookie(String name, double weight, int calories) {
    this.name = name;
    this.weight = weight;
    this.calories = calories;
  }

  /**
   * This filled constructor initializes all the attributes of a Cookie and
   * creates a Cookie object using those attributes with packaging
   * 
   * @param name       -> the name of the cookie
   * @param weight     -> the weight of the cookie in grams
   * @param calories   -> the amount of calories the cookie has
   * @param isPackaged -> true or false value of whether or not the cookie is
   *                   packaged or not
   */
  public Cookie(String name, double weight, int calories, boolean isPackaged) {
    this.name = name;
    this.weight = weight;
    this.calories = calories;
    this.isPackaged = isPackaged;
  }

  /*
   * Accessors
   */

  /**
   * Gets the name of the Cookie
   * 
   * @return the value of the name attribute of the Cookie
   */
  public String getName() {
    return this.name;
  }

  /**
   * Gets the weight of the Cookie
   * 
   * @return the value of the weight attribute of the Cookie
   */
  public double getWeight() {
    return this.weight;
  }

  /**
   * Gets the calories of the Cookie
   * 
   * @return the value of the calories attribute of the Cookie
   */
  public int getCalories() {
    return this.calories;
  }

  /**
   * Gets true or false value of whether or not the Cookie is packaged
   * 
   * @return true or false value of the isPackaged attribute of the Cookie
   */
  public boolean getIsPackaged() {
    return this.isPackaged;
  }

  /*
   * Mutators
   */

  /**
   * This method sets the weight of the Cookie
   * 
   * @param weight -> the weight in grams of the Cookie to be changed
   */
  public void setWeight(double weight) {
    this.weight = weight;
  }

  /*
   * Methods
   */

  /**
   * This method opens the package of a cookie by setting the isPackaged attribute
   * value to false
   */
  public void open() {
    if (this.isPackaged) { // If it is packaged
      this.isPackaged = false; // Set it to false, i.e unpackage it
    }
  }

  /**
   * Try to calculate the caloric amount eaten of the Cookie depending on whether
   * or not there is too much being eaten or whether or not the Cookie is
   * packaged. If the Cookie is packaged it will return a flag of -2 and if the
   * weight eaten is greater than the Cookie it will return a flag of -1.
   * Otherwise, it will return the caloric amount eaten.
   * 
   * @param weight -> the weight of the food eaten in grams
   * @return amountEat -> the caloric amount eaten
   */
  public int eaten(double weight) {

    // the flags are constants
    final int PACKAGE_FLAG = -2;
    final int WEIGHT_FLAG = -1;

    // If it is packaged, it can't be eaten so return PACKAGE_FLAG
    if (this.isPackaged) {
      return PACKAGE_FLAG;
    }

    // If the weight that is to be consumed exceeds the weight of the actual Cookie,
    // there's not enough so return WEIGHT_FLAG
    if (weight > this.weight) {
      return WEIGHT_FLAG;
    } else {
      this.setWeight(this.getWeight() - weight); // The weight to be eaten must be removed from the weight of the Cookie
                                                 // so the Cookie is 'eaten'
    }

    // Percent of Cookie calories to be eaten is the the weight as a percent, so
    // divide the weight that is to be eaten by 100 to obtain the percentage amount
    double percentWeightRemoved = weight / 100;
    double caloriesRemoved = this.getCalories() * percentWeightRemoved; // Multiply the calories the Cookie contains by
                                                                        // this percent to find the amount of calories
                                                                        // that are being consumed right now

    int amountEat = (int) caloriesRemoved; // Cast to int type since the return type is of int

    return amountEat; // return the caloric amount eaten
  }

  /**
   * Overrides the default string method and returns all the important information
   * of the Cookie object in one string.
   * 
   * @return builder -> a string containing all the important information of the
   *         Cookie object
   */
  @Override
  public String toString() {

    // Final string to return
    String builder = "";

    // Append attributes to the string
    builder += "Name: ";
    builder += this.getName();
    builder += "\n";
    builder += "Weight: ";
    builder += this.getWeight();
    builder += "\n";
    builder += "Calories: ";
    builder += this.getCalories();
    builder += "\n";
    builder += "Is packaged: ";
    builder += this.getIsPackaged();
    builder += "\n";

    return builder;
  }

}
