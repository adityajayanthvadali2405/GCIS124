package unit02;

import java.util.Arrays;
import java.util.Random;

public class Activities {
    private static final int START_YEAR = 1900;
    private static final int LAST_YEAR = 2024;

    /**
     * Parses a comma serperated string of years into an array of integers 
     * where each int is an individual year
     * @param years String of years
     * @return Array of years
     */
    public static int[] years (String years) {
        String[] theYears = years.split (", ");
        int[] result = new int [theYears.length];
        for (int i = 0; i < result.length; i++) {
            result [i] = Integer.parseInt (theYears [i]);
        }
        return result;
    }

    public static int getRandomYear () {
        Random random = new Random ();
        return random.nextInt (START_YEAR, LAST_YEAR + 1);
    }

    public static void main(String[] args) {
        String years = "2000, 2001, 2002, 2003, 2004, 2005";
        int[] yearsArray = years (years);
        System.out.println (Arrays.toString (yearsArray));

        System.out.println (getRandomYear ());
        System.out.println (getRandomYear ());
        System.out.println (getRandomYear ());
    }
}
