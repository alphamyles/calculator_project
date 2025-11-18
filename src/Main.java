import java.util.Objects;
import java.util.Scanner;



public class Main {
    //introducing class level variables to efficiently use methods
     static String sign;
     static int firstNumber;
     static int secondNumber;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        firstNumber = userInputNumber(scanner);
        sign = operation(scanner);
        //putting the method in a variable to be able to use it
        int a = addition();
        System.out.println(a);
        }
        public static int addition(){
            while (!Objects.equals(sign, "+")) {
                System.out.println("invalid operation");
                //not putting the operation in a variable causes problems
                sign = operation(scanner);
            }
            if (sign.equals("+"))
                secondNumber = userInputSecondNumber(scanner);
            return firstNumber + secondNumber;
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



