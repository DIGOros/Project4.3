import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Hi there! Please input something:");
            String input = in.nextLine();

            String reversed = reverseString(input);
            System.out.println("You typed: " + reversed);

            System.out.println("Do you want to continue? If so, type 'Y' or any other letter to stop:");
            String continueAnswer = in.nextLine();

            if (!continueAnswer.equalsIgnoreCase("Y")) {
                System.out.println("Sad to see you go.");
                break;
            }
        }

        in.close(); // Close the scanner when you're done.
    }

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
}
