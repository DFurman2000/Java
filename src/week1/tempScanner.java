package week1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class tempScanner {

    public static void main(String[] args) {

        System.out.println("Welcome to our weather station. Please enter 5 readings in celsius.");

        int numberOfReadings = 5;
        ArrayList<Integer> readings = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String readingIn;
        int value;

        for (int i = 0; i < numberOfReadings; i++) {
            try {
                System.out.println("Enter reading: " + (i + 1));
                readingIn = scanner.nextLine();
                value = Integer.parseInt(readingIn.substring(0, readingIn.length() - 1));
                readings.add(value);

            } catch (NumberFormatException e) {
                System.out.println("Wrong Format. Please add a C next to the temperature.");
                i--;
            }
        }

        int readingsSum = 0;
        for(int reading : readings) {
            readingsSum += reading;
        }

        System.out.println("There are " + readings.size() + " readings.");
        System.out.println("Minimum temperature: " + Collections.min(readings));
        System.out.println("Maximum temperature: " + Collections.max(readings));
        System.out.println("Average temperature: " + (readingsSum / readings.size()));
    }
}