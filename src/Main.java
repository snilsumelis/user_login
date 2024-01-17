import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String username, password, newPassword;
        int question;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your username: ");
        username = input.nextLine();
        System.out.print("Enter your password: ");
        password = input.nextLine();

        if (username.equals("nms") && password.equals("java123")) {
            System.out.print("Login successful.");
        } else if (username.equals("nms")) {
            System.out.print("Incorrect password. Do you want to change it? Enter 1 for yes, 2 for no: ");
            question = input.nextInt();
            input.nextLine(); // Consume the newline character

            if (question == 1) {
                System.out.print("Enter your new password: ");
                newPassword = input.nextLine();

                if (newPassword.equals("java123")) {
                    System.out.print("You entered the same password. Please try again.");
                } else {
                    System.out.print("Your new password has been set: " + newPassword);
                }
            } else if (question == 2) {
                System.out.print("Goodbye.");
            } else {
                System.out.print("Invalid choice. Goodbye.");
            }
        }
    }
}
