/**
 * Name: Mike Liang
 * Date: Mar 1 2022
 * Description:
 * This program simulates the eating and consumption of food, Vegetable and
 * Cookie using a Human object. It tests out the instantiation of a Human, a
 * Vegetable, and three Cookies each using a different constructor. It also
 * tests out the methods within the Human class by trying to consume each of
 * these objects, Vegetable and the three Cookie objects. It prints out the
 * Human using the toString() method to see if there are any changes from the
 * original values provided to instantiate the Human object and after it has
 * tried to consume a Vegetable and three Cookie.
 * 
 * @see Human
 * @see Cookie
 * @see Vegetable
 */
public class Liang_Mike_OOQuiz1 {

  public static void main(String[] args) {

    // Create Human object
    Human mrLee = new Human("Mr Lee", 70, 20);
    // Create Vegetable
    Vegetable carrot = new Vegetable("Carrot", 400, 400);

    System.out.println(mrLee.toString()); // Original human info

    // Create variations of cookies using different constructors
    Cookie chocolateCookie = new Cookie("Chocolate chip", 600, 600); // Using the constructor with no isPackaged
                                                                     // parameter
    Cookie whiteCookie = new Cookie("White chocolate", 600, 600, true); // Using the constructor with all attribute
                                                                        // fields
    Cookie nullCookie = new Cookie(); // Null cookie created using default constructor

    mrLee.eat(whiteCookie, 200); // Eat packaged cookie
    mrLee.eat(carrot, 999); // Eat too much vegetable
    mrLee.eat(chocolateCookie, 200); // Try to gain energy and weight from that cookie

    System.out.println(mrLee.toString()); // Compare the previous human info with the human info now. It is different
  }

}
