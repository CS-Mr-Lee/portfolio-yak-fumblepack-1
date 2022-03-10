/**
 * Name: Mr. Lee
 * Date:Mar 7
 * Description: Testing the vehicles
 */

public class TestVehicle {
  public static void main(String[] args) {

    Car myCar = new Car("Honda", "Blue", 2);

    Plane myPlane = new Plane("White", 200);

    // Testing Car

    System.out.println(myCar);

    System.out.println("Accelerate");
    myCar.accelerate(15, 10);
    System.out.println(myCar);

    System.out.println("Add Passenger");
    myCar.addPassenger();
    System.out.println(myCar);

    System.out.println("Stop");
    myCar.stop();
    System.out.println(myCar);

    System.out.println("Add Passenger");
    myCar.addPassenger();
    System.out.println(myCar);

    myCar.honk();

    // Testing Plane
    System.out.println(myPlane);

    System.out.println("Accelerate and set altitude");
    myPlane.accelerate(15, 10);
    myPlane.setAltitude(300);
    System.out.println(myPlane);

    System.out.println("Add Passenger");
    myPlane.addPassenger();
    System.out.println(myPlane);

    System.out.println("Stop");
    myPlane.stop();
    System.out.println(myPlane);

    System.out.println("Add Passenger");
    myPlane.addPassenger();
    System.out.println(myPlane);

    myPlane.roar();

  }
}