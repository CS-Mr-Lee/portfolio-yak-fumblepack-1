
/**
 * Name: Mike Liang
 * Date: February 8 2022
 * Description:
 * This program will encrypt a message by swapping the first and last characters
 * of every word given in the input while preserving whitespace. To do this,
 * first we split the input by spaces using the regex \s and then iterate over
 * the split words. The resulting split array will look something like
 * ["word_fully_intact","","","","another_word"]
 * Which makes it easy to swap and iterate over. If we encounter an element that
 * has length 0, then it must be a whitespace character. If so then we add that
 * to our encrypted string. Otherwise, we perform the swaps and rotate the
 * middle characters of that word by 2.
 * 
 * After that is all finished, the encrypted string is fully built. Then it is
 * printed out.
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Liang_Mike_Encryption {

  public static void main(String[] args) {

    // Declare scanner for taking in input
    Scanner sc = new Scanner(System.in);

    // Prompt user to enter in their line
    System.out.print("Enter a line to be encrypted: ");
    String toEncrypt = sc.nextLine();

    // Split by single spaces only (since we want to count how many spaces there are
    // in the resulting array)
    String[] wordsTemp = toEncrypt.split("\s");

    // Declare the strings that will be built during the encryption
    String encrypted = "";
    String combinedWord = "";

    // Arraylist to store all the words and spaces from the string array.
    ArrayList<String> words = new ArrayList<>();

    // Copy each element from the string array wordsTemp to the arraylist words
    for (String word : wordsTemp) {
      words.add(word);
    }

    // We want to iterate over every single word in the arraylist words
    for (String word : words) {

      if (word.length() > 0) { // If the element we encounter has length 0, it must be a whitespace so it is
                               // rejected from running this portion of the code

        // Create an arraylist of characters to store the return value from calling the
        // swapFirstLast() method
        ArrayList<Character> swapped = swapFirstLast(word);

        // To push each middle char over by 2, we have to iterate over the characters in
        // the word
        for (int i = 1; i < swapped.size() - 1; i++) { // Since the first and last elements should be untouched, we
                                                       // iterate only up to size() - 1 and from 1
          // Get the current char, shift it by two, and cast it back to a char and then
          // replace the current char in the array.
          swapped.set(i, (char) ((char) swapped.get(i) + 2));
        }

        // Build the string by iterating over every character in the word and appending
        // it to the string
        for (char chr : swapped) {
          combinedWord += String.valueOf(chr);
        }
      } else { // Since it is a whitespace, we must add a corresponding whitespace to the
               // combined string.
        combinedWord += " ";
      }

    }

    // Assign encrypted the value of combinedWord
    encrypted = combinedWord;

    // Print the encrypted string to the user
    System.out.println("The encryption is: " + encrypted);

  }

  /**
   * This method swaps the first character of a string with the last character and
   * returns it in a char array so that it will be easier to manipulate the rest
   * of the string. To do so, the string passed as a param will be mapped to char
   * array and then the first and last elements are then swapped.
   * 
   * The resulting array is returned.
   * 
   * @param str - The string that is passed into this method to have the first and
   *            last characters swapped.
   * @return sCharacters - The resulting character array of the string after the
   *         swap.
   */
  private static ArrayList<Character> swapFirstLast(String str) {
    // str is mapped to a character arraylist called sCharacters
    ArrayList<Character> sCharacters = (ArrayList<Character>) str
        .chars()
        .mapToObj(chr -> (char) chr)
        .collect(Collectors.toList());

    // Obtain the values of the first and last characters from the character
    // arraylist
    char firstChar = sCharacters.get(0);
    char lastChar = sCharacters.get(sCharacters.size() - 1);

    // Swap the first and last chars
    sCharacters.set(0, lastChar);
    sCharacters.set(sCharacters.size() - 1, firstChar);

    // Return the arraylist
    return sCharacters;

  }

}
