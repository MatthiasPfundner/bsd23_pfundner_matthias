/*
 * bsd23_pfundner_matthias
 * Main class to represent a calculator
 * Author: Matthias Pfundner
 * Last Change: 18-04-2024
 */

package at.campus02.bsd;

public class Main {
    public static void main(String[] args) {
        double numb1 = 10.0;
        double numb2 = 5.0;

        System.out.println(Calculator.add(numb1, numb2));
        System.out.println(Calculator.minus(numb1, numb2));
        System.out.println(Calculator.divide(numb1, numb2));
        System.out.println(Calculator.multiply(numb1, numb2));
    }
}