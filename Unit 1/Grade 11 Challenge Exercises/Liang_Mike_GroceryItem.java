
/**
 * Name: Mike Liang
 * Date: February 7 2022
 * Description:
 * This program takes in two grocery items, and prints out those items along
 * with their respective prices all formatted. To do so, it uses the scanner to
 * take in input for the item names with nextLine() and then using nextDouble()
 * to parse the prices. Then using printf(), it formats every price to have 2
 * decimal places with trailing zeros if necessary and prints out the name left
 * justified, while the item price is right justified. Each is padded to their
 * respective maximum lengths to ensure that this looks formatted for any item
 * and price not exceeding 20 chars and 5 chars respectively.
 */

import java.util.Scanner;

public class Liang_Mike_GroceryItem {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in); // Scanner to take in input

    // Declare variables to hold the names of the items and their prices
    String fItem;
    String sItem;
    double fItemPrice;
    double sItemPrice;

    // Prompt for input and store input in fItem
    System.out.print("Enter the first item name: ");
    fItem = sc.nextLine();

    // Prompt for input and store input in sItem
    System.out.print("Enter the second item name: ");
    sItem = sc.nextLine();

    // Prompt for input and store input in fItemPrice using double parsing
    System.out.print("Enter in the price of " + fItem + ": ");
    fItemPrice = sc.nextDouble();
    sc.nextLine();

    // Prompt for input and store input in fItemPrice using double parsing
    System.out.print("Enter in the price of " + sItem + ": ");
    sItemPrice = sc.nextDouble();
    sc.nextLine();

    // Use printf to format the output
    // Since the largest amount of characters is 26 + space + 6, the divider has
    // length 27 chars
    // The item name will never exceed 20 chars, so it is left justified and padded
    // to 20 chars
    // The item price will only ever be 6 chars at most so it is right justified and
    // padded to 6 chars
    System.out.printf("---------------------------%n"); // Print divider
    System.out.printf("%-20s %6s", fItem, "$" + String.format("%.2f", fItemPrice)); // Use string format to format all
                                                                                    // whole numbers to 2 decimal places
                                                                                    // with trailing 0s if needed
    System.out.printf("%n"); // Print newline character so sItem is on newline
    System.out.printf("%-20s %6s", sItem, "$" + String.format("%.2f", sItemPrice));
    System.out.printf("%n"); // Print newline character so divider is on newline
    System.out.printf("---------------------------"); // Print divider

    sc.close();

  }
}