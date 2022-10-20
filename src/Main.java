import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String input;
        String answer;
        int i;
        String reverse = "";
        boolean go = true;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Hi there! Please input something");
            input = in.nextLine();

            for (i = input.length() - 1; i >= 0; i--) {
                reverse = reverse + input.charAt(i);

            }


            System.out.println("You typed: " + reverse);
            System.out.println("Do you want to continue? If so type Y or type any other letter to stop.");
            answer = in.nextLine();


            if (!(answer.equalsIgnoreCase("y"))) {
                System.out.println("Sad to see you go.");
                go = false;
            }

        } while (go);
    }
}