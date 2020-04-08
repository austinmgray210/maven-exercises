import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class UserPrompt {

    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter something:");
        String userInputString = getInput.nextLine();


        if (!StringUtils.isNumeric(userInputString)) {
            System.out.printf("You entered: \"%s\"\n", userInputString);
            System.out.printf("\"%s\" is not a number\n", userInputString);
            System.out.printf("Flipped Case: %s\n", StringUtils.swapCase(userInputString));
            System.out.printf("Reversed: %s\n", StringUtils.reverse(userInputString));
        } else {
            System.out.println("You entered a number...What am I supposed to do with this??");
        }


    }
}
