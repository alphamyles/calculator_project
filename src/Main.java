import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
      userInputNumber(scanner);
      operation(scanner);
      userInputSecondNumber(scanner);
    }
    
    public static void userInputNumber(Scanner scanner) {
        System.out.print("Enter a number:");
        scanner.nextInt();

    }
    public static void operation(Scanner scanner) {
        System.out.print("Select Operation:");
        scanner.nextInt();

    }
    public static void userInputSecondNumber(Scanner scanner) {
        System.out.print("Enter another number:");
        scanner.nextInt();

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



