/*
 Jenkins
 */
package calculadora;

import Services.serviciosCalculadora;
import java.util.Scanner;


public class Calculadora {

   
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Choose operation (+, -, *, /):");
        char operation = scanner.next().charAt(0);

        double result = 0;

        serviciosCalculadora calculatorService = new serviciosCalculadora();

        switch (operation) {
            case '+':
                result = calculatorService.add(num1, num2);
                break;
            case '-':
                result = calculatorService.subtract(num1, num2);
                break;
            case '*':
                result = calculatorService.multiply(num1, num2);
                break;
            case '/':
                result = calculatorService.divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operation.");
                return;
        }

        System.out.println("Result: " + result);
    }
    }
    

