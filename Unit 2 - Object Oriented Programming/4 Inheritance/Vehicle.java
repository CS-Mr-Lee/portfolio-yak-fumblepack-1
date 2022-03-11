/**
 * Name: Mr. Lee
 * Date: Mar 7
 * Description: the vehicle class (abstract)
 */
public class Vehicle {

  /*
   * Attributes
   */

  /** The color of the vehicle */
  private String colour;
  /** the amount of passengers the vehicle can carry */
  private int numPassengers;
  /** speed of the vehicle currently */
  private double speed;
  /** direction of the vehicle */
  private double direction;

  /*
   * Constructors
   */

  /**
   * Empty constructor provides default values
   * 
   * @param colour -> the color of the vehicle
   */
  public Vehicle(String colour) {
    this.colour = colour;
    this.numPassengers = -1;
    this.speed = -1;
    this.direction = -1;
  }

  /**
   * Filled constructor initializes a vehicle with a color and the amount of
   * passengers it can carry
   * 
   * @param colour        -> color of the vehicle
   * @param numPassengers -> amount of passengers the vehicle can hold
   */
  public Vehicle(String colour, int numPassengers) {
    this.colour = colour;
    this.numPassengers = numPassengers;
    this.speed = 0;
    this.direction = 0;
  }

  /* Accessors and Mutators */

  /**
   * Gets the color
   * 
   * @return the value of the color attribute
   */
  public String getColour() {
    return this.colour;
  }

  /**
   * Gets the amount of passengers
   * 
   * @return the value of the numPassengers attribute
   */
  public int getNumPassengers() {
    return this.numPassengers;
  }

  /**
   * Gets the speed
   * 
   * @return the value of the speed attribute
   */
  public double getSpeed() {
    return this.speed;
  }

  /**
   * Gets the direction
   * 
   * @return the value of the direction attribute
   */
  public String getDirection() {
    return "" + this.direction;
  }

  /**
   * Sets the new speed
   * 
   * @param newSpeed -> new speed to be set
   */
  public void setSpeed(double newSpeed) {
    this.speed = newSpeed;
  }

  /**
   * Sets the new direction
   * 
   * @param newDirection -> new direction to be set
   */
  public void setDirection(double newDirection) {
    this.direction = newDirection;
  }

  /*
   * new method for subclasses
   */

  /**
   * Sets the new amount of passengers
   * 
   * @param newNum -> new amount of passengers to be set
   */
  public void setNumPassengers(int newNum) {
    this.numPassengers = newNum;
  }

  /* Other methods */

  /**
   * Accelerate the car by setting the speed using parameters of acceleration and
   * time passed into the method
   * 
   * @param accel -> acceleration
   * @param time  -> time
   */
  public void accelerate(double accel, double time) {
    this.speed += accel * time;
  }

  /**
   * Sets the speed to 0 indicating the the vehicle has stopped
   */
  public void stop() {
    this.speed = 0;
  }

  /**
   * adds a passenger to the car if it is not moving
   * 
   * @return whether it is successful in adding a passenger
   */
  public boolean addPassenger() {
    if (speed == 0) {
      this.numPassengers++;
      return true;
    } else {
      System.out.println("Cannot add passenger");
      return false;
    }
  }

  /**
   * Overrides the default string method to provide all the info of the Vehicle
   * class
   */
  @Override
  public String toString() {
    return "Colour: " + this.colour + "; Passengers: " + this.numPassengers +
        "; Speed: " + this.speed + "; Direction: " + this.direction;
  }

}