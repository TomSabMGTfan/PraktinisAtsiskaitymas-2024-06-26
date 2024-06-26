package utils;

import java.util.Random;

public class RandomGenerator {

    //Random Name//
    public static String generateRandomName() {
        // Create a Random object to generate random numbers
        Random randomGenerator = new Random();
        // Generate a random integer between 0 (inclusive) and 26 (exclusive)
        int randomIndex = randomGenerator.nextInt(26);
        // Convert the randomIndex to a corresponding letter (a-z)
        char randomLetter = (char) ('a' + randomIndex);
        char randomLetter1 = (char) ('c' + randomIndex);
        // Concatenate the random letter with the base name "Tom"
        return "Tom"  + randomLetter + randomLetter1 + ".";
    }

    //Random Password
    public static String generateRandomPasswordV2() {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(1000); // Generate a random number
        String userAdmin = "Admin" + randomNumber; // Generate a random username
        String domain = "ROOT"; // Domain name
        return userAdmin + domain + "@" + ".";
    }





}
