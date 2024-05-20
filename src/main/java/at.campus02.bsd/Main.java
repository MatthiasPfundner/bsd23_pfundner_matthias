/*
 * bsd23_pfundner_matthias
 * Main class to represent a calculator
 * Author: Matthias Pfundner
 * Last Change: 20-05-2024
 */

package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * main method to execute calculations and print the results.
 */
public class Main {
    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        double numb1 = 10.0;
        double numb2 = 5.0;

        System.out.println("Matthias Pfundner");
        System.out.println(Calculator.add(numb1, numb2));
        System.out.println(Calculator.minus(numb1, numb2));
        System.out.println(Calculator.divide(numb1, numb2));
        System.out.println(Calculator.multiply(numb1, numb2));

        logger.info("This is a info-log entry.");
        logger.error("This is a error-log entry.");
    }
}
