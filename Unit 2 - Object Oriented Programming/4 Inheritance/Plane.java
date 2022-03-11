/**
 * Name: Mike Liang
 * Date: March 7 2022
 * Description:
 * A plane class that inherits the properties of the Vehicle class. The plane
 * class has one attribute specific to itself. It has it's own addPassenger()
 * method that is overriden to make it conform to the actions of a plane.
 * 
 * @see Vehicle
 */
public class Plane extends Vehicle {

  /** Altitude */
  private double altitude;

  /*
   * Default constructor provides a parameter for initialization of a default
   * Plane object that inherits the superclass Vehicle
   * 
   * @param colour -> the colour of the plane
   */
  public Plane(String colour) {
    super(colour);
    this.altitude = 0;
  }

  /**
   * Filled constructor initializes the plane object with all the attributes of a
   * Plane
   * 
   * @param colour        -> colour of the plane
   * @param numPassengers -> number of passengers the plane can carry
   */
  public Plane(String colour, int numPassengers) {
    super(colour, numPassengers);
    this.altitude = 0;
  }

  /* Accessors and Mutators */

  /**
   * Gets the altitude
   * 
   * @return the altitude
   */
  public double getAltitude() {
    return this.altitude;
  }

  /**
   * Sets a new altitude
   * 
   * @param newAltitude -> the new altitude to be set
   */
  public void setAltitude(double newAltitude) {
    this.altitude = newAltitude;
  }

  /* Other methods */

  /**
   * adds a passenger to the plane if it is not moving
   * 
   * @return whether it is successful in adding a passenger
   */
  @Override
  public boolean addPassenger() {
    if (getSpeed() == 0 && altitude == 0) {
      setNumPassengers(getNumPassengers() + 1); // needed to create a method to mutate numPass
      return true;
    } else {
      System.out.println("Cannot add passenger");
      return false;
    }
  }

  /**
   * Prints out a message saying the plane engine roars
   */
  public void roar() {
    System.out.println("The plane engine roars!");
  }

  /**
   * Overrides the default string method and provides all the info of Plane
   */
  @Override
  public String toString() {
    return super.toString() + "; Altitude: " + this.altitude;
  }
}