
/**
 * Name: Mike Liang
 * Date: February 8 2022
 * Description:
 * This program will parse the JSON file and write the champion with the highest
 * HP and the champion with the lowest armor to a file called MaxChampStats.txt.
 * To do that, three arraylists will be created, each storing the champion
 * names, champion hp, and champion armor. A loop will read through the json
 * file and select names, hp, and armor and append it to the respective arrays.
 * Since we know each champion has to have these stats, their indexes should
 * correspond. So to find the highest hp, we have iterate through the hp array,
 * map the index and hp to the hashmap. Then we sort the arrays, and retrive the
 * index of that hp from the hashmap, thus we have the index of where the
 * highest hp is. We do the same for armor except we retrieve the element with
 * the lowest armor. Then, we write it to the file using buffered writer.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Liang_Mike_ChampionFilter {

  public static void main(String[] args) {

    // Arraylists to hold champion names, champion HP and champion armor
    ArrayList<String> championNames = new ArrayList<>();
    ArrayList<Double> championHps = new ArrayList<>();
    ArrayList<Double> championArmor = new ArrayList<>();

    // Hashmaps to map the hp and armor value as the keys and the index as the value
    HashMap<Double, Double> hpIndexMap = new HashMap<>();
    HashMap<Double, Double> armorIndexMap = new HashMap<>();

    try {
      BufferedReader bufferedReader = new BufferedReader(
          new FileReader("Unit 1/Grade 11 Challenge Exercises/champions.txt")); // Buffered reader to read from this
                                                                                // file

      // A string to store the current line
      String line;

      while ((line = bufferedReader.readLine()) != null) { // Read in all the lines

        // If the line is name then append the sanitised name string to the name
        // arraylist
        if (line.contains("\"name\"")) {
          String name = sanitiseStat(line);
          championNames.add(name);
        }
        // If the line is hp then append the sanitised hp string to the hp arraylist
        if (line.contains("\"hp\"")) {
          String hp = sanitiseStat(line);
          championHps.add(Double.parseDouble(hp));
        }
        // If the line is armor then append the sanitised armor string to the armor
        // arraylist
        if (line.contains("\"armor\"")) {
          String armor = sanitiseStat(line);
          championArmor.add(Double.parseDouble(armor));
        }

      }

      for (int i = 0; i < championNames.size() - 1; i++) { // Iterate through the size of the arrays, which have all the
                                                           // same size
        // Put the key-value pair as the value of the hp or armor, and the the value as
        // the index of it currently.
        hpIndexMap.put(championHps.get(i), Double.parseDouble(String.valueOf(i)));
        armorIndexMap.put(championArmor.get(i), Double.parseDouble(String.valueOf(i)));
      }

    } catch (Exception e) {
      e.printStackTrace();
    }

    // Sort the arraylists
    Collections.sort(championHps);
    Collections.sort(championArmor);

    // Get last element of championHps which will be the greatest value element
    double maxHp = championHps.get(championHps.size() - 1);
    // Get first element of championArmor which will be the smallest value element
    double minArmor = championArmor.get(0);

    // Here we retrieve the champion name with the highest hp by retrieving the
    // index of where the value of maxHp is from the hashmap. Thus, we get the
    // champion name
    String maxHpName = championNames.get(Integer.parseInt(
        String.valueOf(hpIndexMap.get(maxHp))
            .replace(".0", "")));

    // Here we retrieve the champion name with the lowest armor by retrieving the
    // index of where the value of minArmor is from the hashmap. Thus, we get the
    // champion name
    String minArmorName = championNames
        .get(Integer.parseInt(
            String.valueOf(armorIndexMap.get(minArmor))
                .replace(".0", "")));

    // Write to file by passing in the values to generateFile()
    generateFile(maxHpName, minArmorName, maxHp, minArmor);

  }

  /**
   * It accepts a string and then sanitises it by removing the colon, quotation
   * marks, spaces, commas as well as the first part of the line, leaving only the
   * actual champion information.
   * 
   * "name": Yasuo -> Yasuo
   * "hp": 304 -> 304
   * "armor": 21.4 -> 21.4
   * 
   * @param rawStat - The raw line that's not formatted
   * @return stat - The formatted string that contains only the needed information
   */
  private static String sanitiseStat(String rawStat) {
    // String stat to store final formatted string
    String stat = "";

    // Remove colon, comma, quotation marks and take only the actual value of the
    // key value pair in the json string
    stat = rawStat
        .replaceAll("\"", "")
        .replaceAll(",", "")
        .replaceAll(" ", "")
        .split(":")[1];

    // Return the formatted stat
    return stat;
  }

  /**
   * This method writes all the finalised information to a file using
   * bufferedWriter.
   * 
   * @param maxHpName    - The name of the champion with the highest HP
   * @param minArmorName - The name of the champion with the lowest armor
   * @param maxHp        - The highest HP
   * @param minArmor     - The lowest armor
   */
  private static void generateFile(String maxHpName, String minArmorName, double maxHp, double minArmor) {
    try {
      // Create a new BufferedWriter to handle writing to file
      BufferedWriter bufferedWriter = new BufferedWriter(
          new FileWriter("Unit 1/Grade 11 Challenge Exercises/MaxChampStats.txt"));

      // write the max hp and name of champion as well as the min armor and the name
      // of that champion too.
      bufferedWriter.write(maxHpName + " has " + maxHp + " HP");
      bufferedWriter.write("\n");
      bufferedWriter.write(minArmorName + " has " + minArmor + " armor points");

      // Close bufferedWriter
      bufferedWriter.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
