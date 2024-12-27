import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a string : ");
        String userInput = scanner.nextLine();

        String reverseString = "";
        for (int i = userInput.length() - 1; i >=0; i--){
            reverseString += userInput.charAt(i);
        }

        System.out.println("Reverse string : " + reverseString);

        scanner.close();
    }
}