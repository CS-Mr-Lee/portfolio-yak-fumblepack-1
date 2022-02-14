
/**
 * Name: Mike Liang
 * Date: February 7 2022
 * Description:
 * This program finds the smallest angle in an SAS triangle given two sides and
 * an angle measure in between them. The general idea for solving this is the
 * following:
 * 
 * Sides ab, ac, cb
 * 
 * Angle x is between ab and ac
 * Angle y is between ac and bc
 * Angle z is between ab and bc
 * 
 * Angle x is opposite side cb
 * Angle y is opposite side ab
 * Angle z is opposite side ac
 * 
 * Ask what side they would like to input for. Then ask what angle.
 * 
 * Using Cosine Law to find the missing side. Compare those side lengths, check
 * which is the smaller side.
 * 
 * Using Sine Law to find the smaller of the two unknown angles.
 * 
 * Compare all of those angles to find the smallest.
 * 
 * Change to degrees and output the smallest angle.
 * 
 * 
 * I'm actually kinda proud of this solution :D
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Liang_Mike_SASTriangleSolver {
  public static void main(String[] args) {

    // Declare scanner for reading in input
    Scanner sc = new Scanner(System.in);

    // Declare the sides and angles that the user gives us
    double sideOne;
    double sideTwo;
    double knownAngle;

    // Prompt user for the first side
    System.out.print("What is the length of one side: ");
    sideOne = sc.nextDouble();
    sc.nextLine();

    // Prompt user for second side
    System.out.print("What is the length of second side: ");
    sideTwo = sc.nextDouble();
    sc.nextLine();

    // Prompt user for the angle in between the sides
    System.out.print("What is the measure of the known angle: ");
    knownAngle = sc.nextDouble();

    // Declare the variables that we need to find out given the known, side 1, and
    // side 2
    double smallerAngle;
    double missingSide;
    double smallerSide;
    double missingAngle;
    double smallestAngle;

    // Pass given values to cosine law method to obtain missing side
    missingSide = cosineLaw(knownAngle, sideTwo, sideOne);

    // Pass missing side and given sides to the smallestSide() method to find the
    // smallest side
    smallerSide = smallestSide(missingSide, sideOne, sideTwo);

    // Pass the smallest side, known angle, and the side that was figured out using
    // cosine law to sine law
    smallerAngle = sineLaw(smallerSide, knownAngle, missingSide);

    // Convert the resulting value to degrees
    smallerAngle = radianToDegree(smallerAngle);

    // Convert the known angle to degrees
    knownAngle = radianToDegree(knownAngle);

    // Figure out the missing angle by using 180 - angle 1 - angle 2
    missingAngle = 180 - smallerAngle - knownAngle;

    // Pass the missing angle, smaller angle figured out using sine law, and known
    // angle to the smallestAngle() method to find the
    // smallest angle
    smallestAngle = smallestAngle(missingAngle, smallerAngle, knownAngle);

    // Print out the smallest angle to two decimal places.
    System.out.println(String.format("%.2f", smallestAngle));

  }

  /**
   * Given multiple sides, this method will sort these sides to find the smallest
   * one and return it.
   * 
   * @param missingSide - A side of the triangle
   * @param sideOne     - A side of the triangle
   * @param sideTwo     - A side of the triangle
   * @return minSide - The smallest side of the triangle
   */
  private static double smallestSide(double missingSide, double sideOne, double sideTwo) {
    // Declare arraylist to store the sides
    ArrayList<Double> sides = new ArrayList<>();

    // Append the sides to the arraylist
    sides.add(missingSide);
    sides.add(sideOne);
    sides.add(sideTwo);

    // Sort the arraylist
    Collections.sort(sides);

    // Grab the smallest side
    double minSide = sides.get(0);

    // Return it
    return minSide;
  }

  /**
   * Given multiple angles, this method will sort these angles to find the
   * smallest angle and return it.
   * 
   * @param missingAngle - An angle of the triangle
   * @param smallerAngle - An angle of the triangle
   * @param knownAngle   - An angle of the triangle
   * @return minAngle - The smallest angle of the triangle
   */
  private static double smallestAngle(double missingAngle, double smallerAngle, double knownAngle) {
    // Declare arraylist to store the angles
    ArrayList<Double> angles = new ArrayList<>();

    // Append each angle to the arraylist
    angles.add(missingAngle);
    angles.add(smallerAngle);
    angles.add(knownAngle);

    // Sort the arraylist
    Collections.sort(angles);

    // Grab the smallest angle
    double minAngle = angles.get(0);

    // Return it
    return minAngle;
  }

  /**
   * This method finds out the missing third side and returns it using Cosine Law.
   * 
   * Cosine law states that for unknown side a:
   * a^2 = b^2 + c ^2 - 2bc * cos(A)
   * 
   * where A is the known angle and b, c are the two known sides. Plugging in the
   * values provided, we sqaure root the result to get the length of the unknown
   * side.
   * 
   * @param knownAngle - The given angle from the input
   * @param sideB      - The first given side length
   * @param sideC      - The second given side length
   * @return missingSide - The value of the missing side.
   */
  private static double cosineLaw(double knownAngle,
      double sideB, double sideC) {
    double missingSideSquared = ((sideB * sideB) + (sideC * sideC))
        - (2 * (sideB * sideC) * Math.cos(knownAngle));
    double missingSide = Math.sqrt(missingSideSquared);

    return missingSide;
  }

  /**
   * To calculate the second angle, we have to use sine law. And using sine law
   * here, we'll find the smaller of the two unknown angles.
   * 
   * Sine law states: sin (B) / b = sin (C) / c = sin (A) / a
   * 
   * Since we have A, a and b as the givenAngle, sideOppGivenAngle, and
   * shorterSide and we can rearrange the law as such:
   * 
   * B = arcsin(b * (sin(A)/a))
   * 
   * This method uses the above equation to solve for the smaller angle of the two
   * unknowns and then returns it.
   * 
   * @param shorterSide       - The shortest side of all three
   * @param givenAngle        - The given angle from input
   * @param sideOppGivenAngle - This side will always be the missing angle that
   *                          was found out using cosine law
   * @return smallerAngle - The radian value of the smaller angle of the two
   *         unknown
   */
  private static double sineLaw(double shorterSide, double givenAngle, double sideOppGivenAngle) {
    double smallerAngle = Math.asin(shorterSide * (Math.sin(givenAngle) / sideOppGivenAngle));
    return smallerAngle;
  }

  /**
   * This method returns the degree value of a radian
   * 
   * @param rad - a radian value
   * @return a degree value of the radian value
   */
  private static double radianToDegree(double rad) {
    return Math.toDegrees(rad);
  }

}
