import java.util.Objects;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
     int firstNumber = userInputNumber(scanner);
     String sign = operation(scanner);

    while(!Objects.equals(sign, "+")) {
        System.out.println("invalid operation");
        sign = operation(scanner);
    }
     if (Objects.equals(sign, "+")){
            int secondNumber = userInputSecondNumber(scanner);
            int result = firstNumber + secondNumber;
            System.out.println(result);
         }
     }

    public static int userInputNumber(Scanner scanner) {
        System.out.print("Enter a number:");
        return scanner.nextInt();
        
    }
    public static String operation(Scanner scanner) {
        System.out.print("Select Operation:");

      return scanner.next();

    }
    public static int userInputSecondNumber(Scanner scanner) {
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



