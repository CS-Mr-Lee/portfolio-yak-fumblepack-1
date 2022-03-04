/**
 * Name: Mike Liang
 * Date: Feb 23 2022
 * Description:
 * In this main file, it calls the static/helper methods in that class and tests
 * them out.
 */

public class TestFraction {
  public static void main(String[] args) {
    Fraction f1 = new Fraction(2, 3);
    Fraction f2 = new Fraction(4, 6);
    Fraction f3 = new Fraction(2, 3);
    Fraction f4 = f1;

    Fraction[] fArray = new Fraction[3];
    fArray[0] = f1;
    fArray[1] = f2;
    fArray[2] = f3;

    // Call the multiply method from the class (uses static because it's a helper
    // method not a method of the object)
    Fraction product = Fraction.multiply(fArray[0], f3);

    // Prints the result of the multiplication
    System.out.println(product);

    // Changes 4/9 to 12/27
    product.setNumerator(product.getNumerator() * 3);
    product.setDenominator(product.getDenominator() * 3);

    // Multiply the fraction by 1, should output the simplified version of 12/27
    // which would be 4/9
    System.out.println(Fraction.multiply(new Fraction(1, 1), product));
  }
}