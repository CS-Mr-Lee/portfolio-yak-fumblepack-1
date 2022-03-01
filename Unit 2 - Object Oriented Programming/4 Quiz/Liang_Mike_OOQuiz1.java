/**
 * Name: Mike Liang
 * Date: Mar 1 2022
 * Description:
 * 
 */
public class Liang_Mike_OOQuiz1 {

  public static void main(String[] args) {

    // Create objects of human and vegetable
    Human mrLee = new Human("Mr Lee", 20, 70);
    Vegetable carrot = new Vegetable("Carrot", 400, 400);

    System.out.println(mrLee.toString()); // Original human info

    // Create variations of cookies using different constructors
    Cookie chocolateCookie = new Cookie("Chocolate chip", 200, 600, false);
    Cookie whiteCookie = new Cookie("White chocolate", 200, 600, true);
    Cookie nullCookie = new Cookie(); // Null cookie created using default constructor

    mrLee.eat(whiteCookie, 100); // Eat packaged cookie
    mrLee.eat(carrot, 999); // Eat too much vegetable
    mrLee.eat(chocolateCookie, 100); // Try to gain energy and weight from that cookie

    System.out.println(mrLee.toString()); // Compare the previous human info with the human info now. It is different

  }

}
