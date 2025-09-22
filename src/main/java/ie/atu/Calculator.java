package ie.atu;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        //Prompt for 1st number
        Scanner scan1 = new Scanner(System.in);

        //Enter first number
        System.out.println("Please enter first number");
        double firstNum = scan1.nextDouble();
        System.out.println("You entered " + firstNum);

        //Enter second number
        System.out.println("Please enter second number");
        double secondNum = scan1.nextDouble();
        System.out.println("You entered " + secondNum);

        double sum = firstNum + secondNum;
        System.out.println("The sum is " + sum);


        System.out.println("Please enter an operation (add,subtract,multiply,divide)");
        String operation = scan1.next();

        double result = switch (operation) {

            case "add" -> firstNum + secondNum;

            case "subtract" ->  firstNum - secondNum;

            case "multiply" -> firstNum * secondNum;

            case "divide" -> firstNum / secondNum;


            default -> {

                System.out.println("Invalid Operation.");
                yield 0;
            }
        };

        System.out.println("The result is " + result);

    }
}

