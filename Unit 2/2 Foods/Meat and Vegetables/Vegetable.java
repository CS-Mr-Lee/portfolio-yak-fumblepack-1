/**
 * Name: Mike Liang
 * Date: Feb 23 2022
 * Description:
 * This vegetable class defines the attributes of a vegetable: color, name,
 * calories, weight, edible or not, is green or not. In this exercise we learned
 * how to create our own constructors and mutator and accessor methods to change
 * or access the attributes of this class.
 */
public class Vegetable {

  /*
   * Attributes
   */
  /** Color of the vegetable */
  String color;
  /** name of the vegetable */
  String name;
  /** amount of calories the vegetable has */
  double calories;
  /** weight of the vegetable in grams */
  double weight;
  /** if the vegetable is edible or not */
  boolean isEdible;
  /** if the vegetable is green or not */
  boolean isGreen;

  public Vegetable() { // Empty constructor provides a default object
  }

  /**
   * Filled constructor initializes a vegetable object with the following
   * attributes
   * 
   * @param color    -> the color of the vegetable
   * @param name     -> the name of the vegetable
   * @param calories -> amount of calories the vegetable has
   * @param weight   -> weight of the vegetable in grams
   * @param isEdible -> if the vegetable can be eaten
   * @param isGreen  -> if the vegetable is green
   */
  public Vegetable(String color, String name, double calories, double weight, boolean isEdible, boolean isGreen) {
    this.color = color;
    this.name = name;
    this.isEdible = isEdible;
    this.isGreen = isGreen;

    // Calories cannot be less than 1
    if (calories < 1) {
      this.calories = 1;
    } else {
      this.calories = calories;
    }

    // Weight must not be less than 1
    if (weight < 1) {
      this.weight = 1;
    } else {
      this.weight = weight;
    }
  }

  /**
   * Gets the color of the vegetable
   * 
   * @return the color of the vegetable
   */
  public String getColor() {
    return this.color;
  }

  /**
   * Gets the name of the vegetable
   * 
   * @return the name of the vegetable
   */
  public String getName() {
    return this.name;
  }

  /**
   * Gets the calories of the vegetable
   * 
   * @return the calories of the vegetable
   */
  public double getCalories() {
    return this.calories;
  }

  /**
   * Gets the weight of the vegetable
   * 
   * @return the weight of the vegetable
   */
  public double getWeight() {
    return this.weight;
  }

  /**
   * Changes the weight attribute value with the passed value
   * 
   * @param weight -> the new weight of the vegetable
   */
  public void setWeight(double weight) {
    // Weight cannot be less than 1
    if (weight < 1) {
      this.weight = 1;
    } else {
      this.weight = weight;
    }
  }

  /**
   * Gets whether or not this vegetable can be eaten
   * 
   * @return true or false value of whether or not this vegetable is edible
   */
  public boolean getIsEdible() {
    return this.isEdible;
  }

  /**
   * Gets whether or not this vegetable is green
   * 
   * @return ture or false value of whether or not this vegetable is green
   */
  public boolean getIsGreen() {
    return this.isGreen;
  }

}
