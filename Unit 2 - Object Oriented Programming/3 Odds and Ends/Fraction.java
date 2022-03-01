/**
 * Name: Mike Liang
 * Date:
 * Description:
 */

public class Fraction {

  /*
   * Attributes
   */
  private int numerator;
  private int denominator;

  /**
   * Class Field
   * the number of decimals to display
   */
  public static int numDecimals = 2;

  /*
   * Constructors
   */
  public Fraction() {
    this.numerator = 0;
    this.denominator = 1;
  }

  public Fraction(int numerator, int denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
  }

  /*
   * Accessors
   */
  public int getNumerator() {
    return this.numerator;
  }

  public int getDenominator() {
    return this.denominator;
  }

  /*
   * Mutators
   */
  public void setNumerator(int newNum) {
    this.numerator = newNum;
    newNum = 30;
  }

  public void setDenominator(int newDen) {
    if (newDen != 0) {
      this.denominator = newDen;
    }
  }

  /*
   * Other methods
   */

  /**
   * finds the common denominator between the current fraction and
   * public int simpleDenominator(int otherDen) {
   * return 0;
   * }
   * 
   * /**
   * finds the common denominator between two fractions
   * 
   * @param otherF fraction to compare
   * @return the common denominator
   */
  public int simpleDenominator(Fraction otherF) {
    int commonDem = this.getDenominator() * otherF.getDenominator();
    return commonDem;
  }

  /**
   * finds the common denominator of an array of fractions
   * 
   * @param another fraction to compare
   * @return the common denominator
   */
  public int simpleDenominator(Fraction[] otherF) {

    int commonDem = 1;

    for (int i = 0; i < otherF.length; i++) {
      commonDem = commonDem * otherF[i].getDenominator();
    }

    return commonDem;
  }

  /**
   * Changes a fraction to its simplest form
   * A helper method - used to help do methods, but shouldn't
   * be able to access outside of the class
   * only does this when multiplying
   */
  private void simplify() {
    int gcd = gcd(this.getNumerator(), this.getDenominator());
    this.setNumerator(this.getNumerator() / gcd);
    this.setDenominator(this.getDenominator() / gcd);
  }

  private int gcd(int a, int b) {
    return a % b == 0 ? b : gcd(b, a % b);
  }

  /*
   * Class Method
   */
  /**
   * finds the product of the two fractions; does not change the provided
   * fractions
   * 
   * @param f1 the first fraction to multiply
   * @param f2 the second fraction to multiply
   * @return a new Fraction that is the product of two fractions
   */
  public static Fraction multiply(Fraction f1, Fraction f2) {

    int numerator = f1.getNumerator() * f2.getNumerator();
    int denominator = f1.getDenominator() * f2.getDenominator();

    Fraction newFraction = new Fraction(numerator, denominator);

    return newFraction;
  }

  public static void setNumDecimals(int n) {
    if (n > 0) {
      numDecimals = n;
    }
  }

  /*
   * toString
   */
  @Override
  public String toString() {
    return this.getNumerator() + "/" + this.getDenominator();
  }
}