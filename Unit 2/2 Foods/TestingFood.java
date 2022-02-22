/**
 * Name: Mike Liang
 * Date: February 17 2022
 * Description:
 * In this exercise we learned how to access different methods and variables
 * from classes and why we might not be able to access some variables or
 * methods. The reason is that some methods or variables have different access
 * levels that are specified with an access modifier and that limits use outside
 * of that class.
 */

public class TestingFood {
  public static void main(String[] args) {

    // create a food
    Food mrLeesFood = new Food("Lasagna", 400, "hot", 150);
    System.out.println(mrLeesFood.getName() + " is now " + mrLeesFood.getCurrTemp() + " degrees fahrenheit.");
    mrLeesFood.heatUp();
    System.out.println(mrLeesFood.getName() + " is now " + mrLeesFood.getCurrTemp() + " degrees fahrenheit.");
    System.out.println(mrLeesFood.getName() + " is " + mrLeesFood.weight + "g.");

    // 1. Create your own food.

    Food mikesFood = new Food("Glizzy", 69, "hot", 150);

    // 2. Try to print out the name of your food.

    System.out.println(mikesFood.getName());

    // Can you print it with a method? (Does the method currently exist)

    /*
     * Answer:
     * Yes I can print it out since the method to retrieve the variable exists
     */

    // Can you print it with the attribute?

    /*
     * Answer:
     * No I cannot because there is no public name attribute, so I cannot access it
     * to print it out.
     */

    // 3. Try to print out the weight of the food.
    // Can you print it with a method? (Does the method currently exist)

    /*
     * Answer:
     * No I cannot print it out because the method to retrieve the weight of the
     * food directly does not exist, so I cannot use it to print out the weight.
     */

    // Can you print it with the attribute?

    System.out.println(mikesFood.weight);

    // 4. Can you change the name of the food?

    /*
     * Answer:
     * No I cannot do that without creating a new mikesFood because this Food class
     * has no public setter that changes the name.
     */

    // Why might we not want to change the food name?

    /*
     * Answer:
     * Because the food is already decided, and the only variables that can affect
     * the food is temperature and weight. However, what the food actually is still
     * remains the same. E.g pizza is still pizza and can't be changed to broccoli;
     * however, the temperature of the pizza can change.
     */

    // 5. In the food class, is the access modifier for weight public or private?

    /*
     * Answer:
     * The access modifier for weight is public.
     */

    // 6. Change the weight to -50, and print it out. Is it possible?

    mikesFood.weight = -50;
    System.out.println(mikesFood.weight);

    /*
     * Answer:
     * It is possible because the access modifier for weight is public so it exposes
     * the variable to other classes.
     */

    // 7. Why might we not want to have a public attribute?

    /*
     * Answer:
     * This is because other classes can directly access the actual attribute which
     * will affect how other classes are using this class instance. In addition, if
     * there was a change made to this base class, all other classes that depend on
     * that attribute will have to change. So, to preserve continuity it is better
     * to declare a method that will access these values.
     */

    // What could be a suitable method to allow us to change the attribute?

    /*
     * Answer:
     * 
     * We can create a method like:
     * 
     * public setWeight(double weight) {
     * this.weight = weight;
     * }
     * 
     * Here we can access and set the local attribute weight using a setter which
     * will not break other programs using this class if we were to change the
     * attributes of this class.
     */

    // 8. Can you heat up the food? Alternate heating up the food and printing the
    // temperature.

    while (mikesFood.getCurrTemp() < 200) {
      mikesFood.heatUp();
      System.out.println(mikesFood.getName() + " is now " + mikesFood.getCurrTemp() + " degrees fahrenheit.");
    }

    // How does it act?

    /*
     * Answer:
     * It calls the heatUp() method first, and then accesses the object's attribute
     * of name and current temperature and prints it out. It changes everytime
     * because the object's attribute is being set after calling the heatUp()
     * method.
     */

    // 9. Finish adding commenting to the Food class.
  }
}
