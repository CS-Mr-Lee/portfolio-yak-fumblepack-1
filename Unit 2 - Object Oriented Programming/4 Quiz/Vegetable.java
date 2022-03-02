/**
 * Name: Mike Liang
 * Date: Feb 23 2022
 * Description:
 * This vegetable class defines the attributes of a vegetable: name,
 * calories, weight and some actions that simulates the caloric consumption of a
 * particular vegetable.
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

  /**
   * Empty constructor provides a default Vegetable
   */
  public Vegetable() {
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
  public int getCalories() {
    return this.calories;
  }

  /**
   * Gets the weight of the vegetable in grams
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
   * Changes the weight with the new one supplied through the parameters
   * 
   * @param weight -> the weight to be set
   */
  public void setWeight(double weight) {
    this.weight = weight;
  }

  /*
   * Methods
   */

  /**
   * Try to calculate the caloric amount eaten using weight to be eaten of the
   * Vegetable as a percentage multipled by total calories the Vegetable has. If
   * the weight that is to be eaten exceeds the weight of the Vegetable, then
   * return the WEIGHT_FLAG.
   * 
   * @param weight -> the weight to be eaten
   * @return amountEat -> the caloric amount that was consumed
   */
  public int eaten(double weight) {

    final int WEIGHT_FLAG = -1;

    if (weight > this.weight) {
      return WEIGHT_FLAG;
    } else {
      this.setWeight(this.getWeight() - weight); // The weight to be eaten must be removed from the weight of the
                                                 // Vegetable so the Vegetable is 'eaten'
    }

    double percentWeightRemoved = weight / 100;
    double caloriesRemoved = this.getCalories() * percentWeightRemoved;

    int amountEat = (int) caloriesRemoved;

    return amountEat;
  }

  /**
   * Overrides the default string builder metod and returns a stirng with all the
   * important info of the Vegetable
   * 
   * @return builder -> a string containing all the important info of the
   *         Vegetable
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
