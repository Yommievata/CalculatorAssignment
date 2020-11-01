package Se.Lexicon.Michael;

import java.util.Scanner;

/**
 * Calculator!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        long number1 = 0;
        long number2 = 0;
        char operator;
        double result = 0.0;
        char yesNo;


        Scanner calculator = new Scanner(System.in);
        boolean myCalculator = true;

    while (myCalculator) {
        System.out.println("******Welcome to Michael's Calculator*******");
        System.out.println("Input first number");
        number1 = calculator.nextInt();
        System.out.println("Input second number");
        number2 = calculator.nextInt();
        System.out.println("What Operator");
        operator = calculator.next().charAt(0);

        switch (operator) {

            case '+':
                result = (number1 + number2);
                break;

            case '-':
                result = (number1 - number2);
                break;

            case '*':
                result = (number1 * number2);
                break;

            case '/':
                result = (number1 / number2);
                break;

        }
        System.out.println(number1 + " " + operator + " " + number2 + " = " + result);

        System.out.println("Do you want to do another calculation?: Y/N");
          yesNo = calculator.next().charAt(0);

          switch (yesNo) {
        case 'Y':
            myCalculator = true;
            continue;

              case 'N':
                  System.out.println("Terminated");
                  myCalculator = false;
                  break;
        }
    }

    }

    }

