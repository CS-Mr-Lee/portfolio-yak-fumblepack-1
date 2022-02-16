
/**
 * Name: Mike Liang
 * Date: February 8 2022
 * Description:
 * This program will attempt to return the quotient to the user after accepting
 * the numerator and divisor. To make this program not breakable, it will run
 * everything inside a do-while loop. That is, if the first character of the
 * numerator entered is not a "q" or "Q", it will stop the program immediately.
 * Otherwise, it will check whether or not the input of numerator is strictly a
 * number using regex. If it is not, then it will output to the user that bad
 * data has been entered and tell them input it again. Then the process repeats
 * back to the input of the numerator. If it is a number, then the program
 * prompts the user for the divisor. Similarly, it checks for strictly numerical
 * values and then if it isn't it will say that it is bad data and ask the user
 * to input the numerator and denominator again. Otherwise, it will check
 * whether or not the divisor is 0. If it is, then it will say that there is a
 * divide by 0 error. If all is valid, then it will perform the division and
 * then return the result, rounded to 2 decimal places with trailing 0s
 * stripped.
 */

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Liang_Mike_FoolProof {
  public static void main(String[] args) {

    // Declare scanner to get input
    Scanner sc = new Scanner(System.in);

    // Declare string variables to store input
    String numerator;
    String divisor;

    do { // Run the main loop which asks for the numerator and stops the loop if the
         // numerator's first char starts with a "q" or "Q"

      // Prompt for numerator
      System.out.print("Enter the numerator: ");
      numerator = sc.nextLine();

      numerator = numerator.stripLeading();

      if (String.valueOf(numerator
          .charAt(0))
          .equalsIgnoreCase("q")) {
        break;
      }
      if (numerator.matches("[0-9]+")) { // Make sure that the input is only numbers

        // Prompt for divisor
        System.out.print("Enter the divisor: ");
        divisor = sc.nextLine();

        divisor = divisor.stripLeading();

        if (divisor.matches("[0-9]+")) { // Make sure that the input is only numbers

          if (!(Integer.parseInt(divisor) == 0)) { // Make sure that the divisor is NOT a 0
            BigDecimal result; // Use big decimal to store the result because we have to round it to 2 decimal
                               // places and remove trailing 0s

            MathContext precision = new MathContext(3); // Set the precision to 3

            result = new BigDecimal(Double.parseDouble(numerator) / Double.parseDouble(divisor))
                .round(precision); // Round it to 2 decimal places

            // Print out the result
            System.out.println(numerator + "/" + divisor + " is " + result);
            System.out.println("\n");

          } else { // Tell them divide by 0 error
            System.out.println("You can't divide " + numerator + " by " + divisor);
            System.out.println("\n");
          }

        } else { // Tell them they have entered bad data
          System.out.println("You entered bad data.");
          System.out.println("Please try again.");
          System.out.println("\n");
        }

      } else { // Tell them that they have entered bad data
        System.out.println("You entered bad data.");
        System.out.println("Please try again.");
        System.out.println("\n");
      }

    } while (!(String.valueOf(numerator
        .stripLeading()
        .charAt(0))
        .equalsIgnoreCase("q"))); // Condition for breaking out
                                  // of the loop

  }

}