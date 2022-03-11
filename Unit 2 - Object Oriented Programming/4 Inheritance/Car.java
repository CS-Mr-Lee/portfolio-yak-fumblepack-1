/**
 * Name: Mike Liang
 * Date: March 7 2022
 * Description:
 * This class Car inherits the attributes of its superclass Vehicle. It has its
 * own specific attribute as well, which is brand. It overrides the superclass
 * string method of Vehicle to include info about the brand attribute.
 */
public class Car extends Vehicle {

  /** the brand of the car */
  private String brand;

  /**
   * Default constructor provides a parameter for initialization of a default Car
   * object that inherits the superclass Vehicle
   * 
   * @param colour -> the colour of the car
   */
  public Car(String colour) {
    super(colour);
    this.brand = "";
  }

  /**
   * Filled constructor initializes the car object with all the attributes of a
   * Car
   * 
   * @param brand         -> brand of the car
   * @param colour        -> color of the car
   * @param numPassengers -> amount of passengers the car can hold
   */
  public Car(String brand, String colour, int numPassengers) {
    super(colour, numPassengers);
    this.brand = brand;
  }

  /**
   * gets the brand of the car
   * 
   * @return the brand attribute
   */
  public String getBrand() {
    return this.brand;
  }

  /**
   * Prints out honk to show that the car has honked
   */
  public void honk() {
    System.out.println("Honk Honk!");
  }

  /**
   * Overrides the default string method of the super class to provide all the
   * info of Car
   * 
   * @return the info of Car
   */
  @Override
  public String toString() {
    return super.toString() + "; Brand: " + this.brand;
  }

}