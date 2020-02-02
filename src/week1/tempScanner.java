// This programme will read in 5 temperatures from the weather station
// Each reading has a value of the temperature and is represented as an integer followed by a single character (e.g. 23C)
// You will need a scanner to read in data, a loop to collect 5 readings, an array list to store the integer values
// and a process of printing the contents of the array list (min, max, average and count.)

package week1;

import java.util.Scanner;

public class tempScanner {
    public static void intro (String name) {
        System.out.println("Welcome to our weather station. Please enter 5 readings in celsius.");
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Next reading: ");
        String s = in.nextLine();
        try {
            for (int i = 0; i < 6; i++) {
                if (s.endsWith("C")) {
                    int temp = Integer.parseInt(s.substring(0, s.length() - 1));
                    System.out.println("Temperature = " + temp);
                } else {
                    throw new NumberFormatException();
                }
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Wrong Format. Please add a C next to the temperature.");
        }
        }
}
