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
   * Provides a default cookie
   */
  public Cookie() {
    this.name = "";
    this.weight = -1;
    this.calories = -1;
    this.isPackaged = false;
  }

  /**
   * 
   * @param name
   * @param weight
   * @param calories
   * @param isPackaged
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
   * 
   * @return
   */
  public String getName() {
    return this.name;
  }

  /**
   * Gets the weight of the cookie
   * 
   * @return the weight of the cookie
   */
  public double getWeight() {
    return this.weight;
  }

  /**
   * Gets the calories of the cookie
   * 
   * @return the calories of the cookie
   */
  public int getCalories() {
    return this.calories;
  }

  /**
   * Gets whether or not the cookie is packaged
   * 
   * @return true or false value of whether or not the cookie is packaged
   */
  public boolean getIsPackaged() {
    return this.isPackaged;
  }

  /*
   * Mutators
   */

  /**
   * This method sets the weight of a cookie
   * 
   * @param weight -> the weight in grams of the cookie to be changed
   */
  public void setWeight(double weight) {
    this.weight = weight;
  }

  /*
   * Methods
   */

  /**
   * This method opens the package of a cookie
   */
  public void open() {
    if (this.isPackaged) {
      this.isPackaged = false;
    }
  }

  /**
   * Try to eat the cookie depending on whether or not there is too much being
   * eaten or whether or not the cookie is packaged. If the cookie is packaged it
   * will return a flag of -2 and if the weight eaten is greater than the cookie
   * it will return a flag of -1. Otherwise, it will return the caloric amount
   * eaten.
   * 
   * @param weight -> the weight of the food eaten in grams
   * @return the caloric amount eaten
   */
  public int eaten(double weight) {

    final int PACKAGE_FLAG = -2;
    final int WEIGHT_FLAG = -1;

    if (this.isPackaged) {
      return PACKAGE_FLAG;
    }

    if (weight > this.weight) {
      return WEIGHT_FLAG;
    }

    double percentWeightRemoved = weight / 100;
    double caloriesRemoved = this.getCalories() * percentWeightRemoved;

    int amountEat = (int) caloriesRemoved;

    return amountEat;
  }

  /**
   * Overrides the default string method and returns all the important information
   * of the cookie object in one string.
   * 
   * @return a string containing all the important information of the cookie
   *         object
   */
  @Override
  public String toString() {
    String builder = "";

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
