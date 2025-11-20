import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class Main {
    //introducing class level variables to efficiently use methods
     static String sign;
     static int firstNumber;
     static int secondNumber;
     static int result1;
     static int result2;
     static int result3;
     static int result4;

    static  List<String> options = Arrays.asList("+","-","*","/");
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        firstNumber = userInputNumber(scanner);
        sign = operation(scanner);
        //putting the method in a variable to be able to use it
        int a = addition();
        System.out.println(a);
        }
        public static int addition() {
            while (!options.contains(sign)) {
                System.out.println("invalid operation");
                //not putting the operation in a variable causes problems
                sign = operation(scanner);
            }

            switch (sign) {
                case "+" -> {
                    secondNumber = userInputSecondNumber(scanner);
                    result1 = firstNumber + secondNumber;
                    return result1;
                }
                case "-" -> {
                    secondNumber = userInputSecondNumber(scanner);
                    result2 = firstNumber - secondNumber;
                }
                case "*" -> {
                    secondNumber = userInputSecondNumber(scanner);
                    result3 = firstNumber * secondNumber;
                    return result3;
                }
                case "/" -> {
                    secondNumber = userInputSecondNumber(scanner);
                    result4 = firstNumber / secondNumber;
                }
            }
            return result4;
        }


        public static int userInputNumber (Scanner scanner){
            System.out.print("Enter a number:");
            return scanner.nextInt();

        }
        public static String operation (Scanner scanner){
            System.out.print("Select Operation:");

            return scanner.next();

        }
        public static int userInputSecondNumber (Scanner scanner){
            System.out.print("Enter another number:");
            return scanner.nextInt();

        }

    }



       /* System.out.print("Enter a number:");
        int firstNumber = scanner.nextInt();
        System.out.print("Operation: ");
        String userInput = scanner.next();
        List<String> options = Arrays.asList("+","-","*","/");
        while (!options.contains(userInput)){
           System.out.println("invalid operation");
           System.out.print("Operation: ");
            userInput = scanner.next();
       }
        switch (userInput) {
            case "+" -> {
                System.out.print("Enter another number:");
                secondNumber = scanner.nextInt();
                int finalResult = firstNumber + secondNumber;
                System.out.println(finalResult);
            }
            case "-" -> {
                System.out.print("Enter another number:");
                secondNumber = scanner.nextInt();
                int finalResult = firstNumber - secondNumber;
                System.out.println(finalResult);
            }
            case "*" -> {
                System.out.print("Enter another number:");
                secondNumber = scanner.nextInt();
                int finalResult = firstNumber * secondNumber;
                System.out.println(finalResult);

            }
            case "/" -> {
                System.out.print("Enter another number:");
                secondNumber = scanner.nextInt();
                int finalResult = firstNumber / secondNumber;
                System.out.println(finalResult);

            }
            case null, default -> {
            }
        }


        scanner.close();
        }
        }
*/



