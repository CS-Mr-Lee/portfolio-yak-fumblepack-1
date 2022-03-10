/**
 * Name: Mike Liang
 * Date: March 7 2022
 * Description:
 * A plane class that inherits the properties of the Vehicle class. The plane
 * class has one attribute specific to itself.
 * 
 * @see Vehicle
 */
public class Plane extends Vehicle {

  /** Altitude */
  private double altitude;

  /*
   * Constructor
   */
  public Plane(String colour) {
    super(colour);
    this.altitude = 0;
  }

  /**
   * 
   * @param colour        ->
   * @param numPassengers ->
   */
  public Plane(String colour, int numPassengers) {
    super(colour, numPassengers);
    this.altitude = 0;
  }

  /* Accessors and Mutators */

  /**
   * 
   * @return
   */
  public double getAltitude() {
    return this.altitude;
  }

  /**
   * 
   * @param newAltitude ->
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
   * 
   */
  public void roar() {
    System.out.println("The plane engine roars!");
  }

  /**
   * 
   */
  @Override
  public String toString() {
    return super.toString() + "; Altitude: " + this.altitude;
  }
}