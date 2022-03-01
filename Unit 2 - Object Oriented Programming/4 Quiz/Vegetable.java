/**
 * Name: Mike Liang
 * Date: Feb 23 2022
 * Description:
 * This vegetable class defines the attributes of a vegetable: name,
 * calories, weight and some actions that simulates the caloric consumption of a
 * particular vegatable.
 */
public class Vegetable {

  /*
   * Attributes
   */
  /** name of the vegetable */
  String name;
  /** amount of calories the vegetable has */
  int calories;
  /** weight of the vegetable */
  double weight;

  public Vegetable() { // Empty constructor provides a default object
    this.name = "";
    this.weight = -1;
    this.calories = -1;
  }

  /**
   * Filled constructor initializes a vegetable object with the following
   * attributes
   * 
   * @param name     -> the name of the vegetable
   * @param calories -> amount of calories the vegetable has
   * @param weight   -> weight of the vegetable in grams
   */
  public Vegetable(String name, int calories, double weight) {
    this.name = name;
    this.calories = calories;
    this.weight = weight;
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
   * 
   * @return
   */
  public int getCalories() {
    return this.calories;
  }

  /**
   * 
   * @return
   */
  public double getWeight() {
    return this.weight;
  }

  /*
   * Mutators
   */

  /**
   * 
   * @param weight
   * @return
   */
  public void setWeight(double weight) {
    this.weight = weight;
  }

  /*
   * Methods
   */

  /**
   * 
   * @param weight
   * @return
   */
  public int eaten(double weight) {

    final int WEIGHT_FLAG = -1;

    if (weight > this.weight) {
      return WEIGHT_FLAG;
    }

    double percentWeightRemoved = weight / 100;
    double caloriesRemoved = this.getCalories() * percentWeightRemoved;

    int amountEat = (int) caloriesRemoved;

    return amountEat;
  }

  /**
   * 
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

    return builder;
  }

}
