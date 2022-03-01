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

  public Human() { // Empty constructor provides a default human
    this.name = "";
    this.weight = -1;
    this.energyLevel = -1;
  }

  /**
   * attributes of human in a filled constructor
   *
   * @param name        -> name of the human
   * @param energyLevel -> energy of the human
   * @param weight      -> amount of weight
   */
  public Human(String name, double weight, int energyLevel) {
    this.name = name;
    this.weight = weight;
    this.energyLevel = energyLevel;

  }

  /*
   * Accessors
   */

  public String getName() {
    return this.name;
  }

  public int getEnergyLevel() {
    return this.energyLevel;
  }

  public double getWeight() {
    return this.weight;
  }

  /*
   * Mutators
   */

  /**
   * 
   * @param energyLevel
   */
  public void setEnergyLevel(int energyLevel) {
    this.energyLevel = energyLevel;
  }

  /**
   * 
   * @param weight
   */
  public void setWeight(double weight) {
    this.weight = weight;
  }

  /*
   * Methods
   */

  /**
   * 
   * @param hours
   */
  public void sleep(int hours) {
    double energySlept;

    energySlept = (hours * (10 / 100));
    this.setEnergyLevel((int) (this.getEnergyLevel() + energySlept)); // Cast our double back to int value
  }

  /**
   * 
   * @param km
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
   * 
   * @param veg
   * @param grams
   */
  public void eat(Vegetable veg, double grams) {
    int caloriesConsumed = veg.eaten(grams);
    if (caloriesConsumed == -1) {
      System.out.println("I don't have that much food");
    } else {
      this.setEnergyLevel(caloriesConsumed);
      this.setWeight(this.getWeight() + (grams / 1000));
    }
  }

  /**
   * 
   * @param food
   * @param grams
   */
  public void eat(Cookie food, double grams) {
    int caloriesConsumed = food.eaten(grams);
    if (caloriesConsumed == -1) {
      System.out.println("I don't have that much food");
    } else if (caloriesConsumed == -2) {
      System.out.println("I can't eat the bag");
    } else {

      int percentEnergyLevel = (int) ((caloriesConsumed / 15) / 100);

      this.setEnergyLevel(this.getEnergyLevel() + (this.getEnergyLevel() * percentEnergyLevel));

      this.setWeight(this.getWeight() + (grams / 1000));
    }
  }

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
