/**
 * Name: Mike Liang
 * Date:
 * Description:
 * 
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

    System.out.println(f1);
    System.out.println();
    System.out.println(f4);
  }
}