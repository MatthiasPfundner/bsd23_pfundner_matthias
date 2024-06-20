/*
 * bsd23_pfundner_matthias
 * Class with methods to implement arithmetic operations
 * Author: Matthias Pfundner
 * Last Change: 20-06-2024
 */

package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Calculator class provides methods for basic arithmetic operations
 * and factorial calculation with logging functionality.
 */
public class Calculator {
    /**
     * Logger for logging debug and error messages.
     */
    private static final Logger logger = LogManager.getLogger();

    /**
     * Adds two numbers and returns the result.
     *
     * @param number1 first passed floating point number
     * @param number2 second passed floating point number
     * @return the result of the arithmetic operation between number1 and number2
     */
    public static double add(double number1, double number2) {
        logger.debug("add() called with parameters: number1={}, number2={}", number1, number2);
        return number1 + number2;
    }

    /**
     * Subtracts the second number from the first and returns the result.
     *
     * @param number1 first passed floating point number
     * @param number2 second passed floating point number
     * @return the result of the arithmetic operation between number1 and number2
     */
    public static double minus(double number1, double number2){
        logger.debug("minus() called with parameters: number1={}, number2={}", number1, number2);
        return number1 - number2;
    }

    /**
     * Divides the first number by the second and returns the result.
     *
     * @param number1 first passed floating point number
     * @param number2 second passed floating point number
     * @return the result of the arithmetic operation between number1 and number2
     * @throws ArithmeticException if number2 is zero
     */
    public static double divide(double number1, double number2){
        logger.debug("divide() called with parameters: number1={}, number2={}", number1, number2);
        if (number2 == 0) {
            logger.error("Division by zero!");
            throw new ArithmeticException("Division by zero");
        }
        return number1 / number2;
    }

    /**
     * Multiplies two numbers and returns the result.
     *
     * @param number1 first passed floating point number
     * @param number2 second passed floating point number
     * @return the result of the arithmetic operation between number1 and number2
     */
    public static double multiply(double number1, double number2){
        logger.debug("multiply() called with parameters: number1={}, number2={}", number1, number2);
        return number1 * number2;
    }

    /**
     * Calculates the factorial of a number.
     *
     * @param number passed int number
     * @return the factorial of the number, or 0 if the number is negative
     */
    public int factorial(int number) {
        if(number < 0) {
            return 0;
        }

        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
