/**
 * Name: Mike Liang
 * Date: Mar 1 2022
 * Description:
 * A human class that has attributes of a human: sex, name, energy, weight, and
 * height. There are actions that human can perform like run() and sleep() and
 * they lose weight and energy, and gain back energy respectively.
 *
 */
public class Human {

  /*
   * attributes
   */
  /** name of the human */
  private String name;

  /** energy of the human */
  private int energyLevel;

  /** amount of weight */
  private double weight;

  /*
   * Constructors
   */

  /**
   * Empty constructor provides a default human
   */
  public Human() {
    this.name = "";
    this.weight = -1;
    this.energyLevel = -1;
  }

  /**
   * attributes of human in a filled constructor
   *
   * @param name        -> name of the human
   * @param weight      -> amount of weight
   * @param energyLevel -> energy of the human
   */
  public Human(String name, double weight, int energyLevel) {
    this.name = name;
    this.weight = weight;
    this.energyLevel = energyLevel;

  }

  /*
   * Accessors
   */

  /**
   * Gets the name of the human
   * 
   * @return the name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Gets the energy level of the human
   * 
   * @return energy level
   */
  public int getEnergyLevel() {
    return this.energyLevel;
  }

  /**
   * Gets the weight of the human
   * 
   * @return the weight of the human in kg
   */
  public double getWeight() {
    return this.weight;
  }

  /*
   * Mutators
   */

  /**
   * Changes the current energy level to a new value, but cannot exceed 100.
   * 
   * @param energyLevel -> the new energy level to be set
   */
  public void setEnergyLevel(int energyLevel) {
    if (energyLevel > 100) {
      this.energyLevel = 100;
    } else {
      this.energyLevel = energyLevel;
    }
  }

  /**
   * Changes the current weight to a new value
   * 
   * @param weight -> the new weight to be set
   */
  public void setWeight(double weight) {
    this.weight = weight;
  }

  /*
   * Methods
   */

  /**
   * This method raises the energy level of the person by hours * 10%
   * 
   * @param hours -> hours of sleep
   */
  public void sleep(int hours) {
    double energySlept;

    energySlept = (hours * (10 / 100));
    this.setEnergyLevel((int) (this.getEnergyLevel() + energySlept)); // Cast our double back to int value
  }

  /**
   * This method decreases the energy level and the weight of the human
   * 1km = 3%
   * 
   * @param km -> the kilometers the human runs
   */
  public void run(double km) {
    // Decrease energy
    double percents = (km * 3) / 100;
    double newEnergy = this.getEnergyLevel() * percents;
    this.setEnergyLevel((int) (this.getEnergyLevel() - newEnergy)); // Cast our double back to int value

    // Decrease weight
    double k = 1;
    double newWeight = 0;
    while (k <= km) {
      newWeight += 0.001;
    }
    this.setWeight(this.getWeight() - newWeight);
  }

  /**
   * This method simulates the consumption of a Vegetable and increases the energy
   * level by 1% for every 15 calories the Vegetable gives. Also increases the
   * human's weight by the weight of the Vegetable consumed.
   * 
   * @param veg   -> A Vegetable to be consumed
   * @param grams -> the amount of grams of that Vegetable veg to be consumed
   */
  public void eat(Vegetable veg, double grams) {
    double caloriesConsumed = veg.eaten(grams);
    if (caloriesConsumed == -1) { // If the weight flag is present
      System.out.println("I don't have that much food");
    } else {

      // Turns the caloric amount consumed into energy and sets the new energy

      double percentConsumed = (caloriesConsumed / 15) / 100;

      int newEnergy = (int) (this.getEnergyLevel() + (this.getEnergyLevel() * percentConsumed));

      this.setEnergyLevel(newEnergy);

      this.setWeight(this.getWeight() + (grams / 1000));
    }
  }

  /**
   * This method simulates the consumption of a Cookie and increases the energy
   * level by 1% for every 15 calories the Cookie gives. Also increases the
   * human's weight by the weight of the Cookie consumed.
   * 
   * @param food  -> a Cookie to be consumed
   * @param grams -> the amount of grams of that Cookie food to be consumed
   */
  public void eat(Cookie food, double grams) {
    double caloriesConsumed = food.eaten(grams);
    if (caloriesConsumed == -1) { // If it returns the weight flag
      System.out.println("I don't have that much food");
    } else if (caloriesConsumed == -2) { // If it returns the packaged flag
      System.out.println("I can't eat the bag");
    } else {
      // Turns the caloric amount consumed into energy and sets the new energy
      double percentConsumed = (caloriesConsumed / 15) / 100;

      int newEnergy = (int) (this.getEnergyLevel() + (this.getEnergyLevel() * percentConsumed));

      this.setEnergyLevel(newEnergy);

      this.setWeight(this.getWeight() + (grams / 1000));
    }
  }

  /**
   * Overrides the default string builder metod and returns a stirng with all the
   * important info of the Human
   * 
   * @return builder -> a string containing all the important info of the Human
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
    builder += "Energy Level: ";
    builder += this.getEnergyLevel();
    builder += "\n";

    return builder;
  }

}
