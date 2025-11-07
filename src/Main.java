import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secondNumber ;
        System.out.print("Enter a number:");
        int firstNumber = scanner.nextInt();
        System.out.print("Operation: ");
        String userInput = scanner.next();
        List<String> options = Arrays.asList("+","-","*","/");
        while (!options.contains(userInput)){
           System.out.println("invalid operation");
           System.out.print("Operation: ");
            userInput = scanner.next();
       }
       if (Objects.equals(userInput, "+")){
           System.out.print("Enter another number:");
           secondNumber = scanner.nextInt();
           int finalResult = firstNumber + secondNumber;
           System.out.println(finalResult);
       }else if (Objects.equals(userInput, "-")){
           System.out.print("Enter another number:");
           secondNumber = scanner.nextInt();
           int finalResult = firstNumber - secondNumber;
           System.out.println(finalResult);
       }else if (Objects.equals(userInput, "*")){
           System.out.print("Enter another number:");
           secondNumber = scanner.nextInt();
           int finalResult = firstNumber * secondNumber;
           System.out.println(finalResult);

       }else if (Objects.equals(userInput, "/")){
           System.out.print("Enter another number:");
           secondNumber = scanner.nextInt();
           int finalResult = firstNumber / secondNumber;
           System.out.println(finalResult);

       }


        scanner.close();
        }



    }
