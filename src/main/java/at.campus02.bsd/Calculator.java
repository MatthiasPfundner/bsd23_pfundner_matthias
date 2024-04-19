/*
 * bsd23_pfundner_matthias
 * Class with methods to implement arithmetic operations
 * Author: Matthias Pfundner
 * Last Change: 18-04-2024
 */

package at.campus02.bsd;

public class Calculator {

    /**
     * Sum up two numbers and returns the result
     * @param number1 first passed floating point number
     * @param number2 second passed floating point number
     * @return the result of the arithmetic operation
     */
    public static double add(double number1, double number2) {
        return number1 + number2;
    }

    /**
     * Subtracts two numbers and returns the result
     * @param number1 first passed floating point number
     * @param number2 second passed floating point number
     * @return the result of the arithmetic operation
     */
    public static double minus(double number1, double number2){
        return number1 - number2;
    }

    /**
     * Divides two numbers and returns the result
     * @param number1 first passed floating point number
     * @param number2 second passed floating point number
     * @return the result of the arithmetic operation
     */
    public static double divide(double number1, double number2){
        return number1 / number2;
    }

    /**
     * Multiplies two numbers and returns the result
     * @param number1 first passed floating point number
     * @param number2 second passed floating point number
     * @return the result of the arithmetic operation
     */
    public static double multiply(double number1, double number2){
        return number1 * number2;
    }
}
