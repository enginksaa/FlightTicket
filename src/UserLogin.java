import java.util.Scanner;

public class UserLogin {

    public static void main(String[] args) {
        String userID = "engin";
        String password = "eng123";

        Scanner input = new Scanner(System.in);
        String enteredPassword;
        boolean isLoggedIn = false;

        do {
            System.out.print("Enter User ID: ");
            String enteredID = input.nextLine();

            System.out.print("Enter Password: ");
            enteredPassword = input.nextLine();

            switch (enteredID) {
                case "engin":
                    if (enteredPassword.equals(password)) {
                        System.out.println("Login Successful!");
                        isLoggedIn = true;
                    } else {
                        System.out.println("Incorrect Password.");
                        System.out.print("Reset Password? (Y/N): ");
                        String resetChoice = input.nextLine();

                        if (resetChoice.equalsIgnoreCase("Y")) {
                            boolean isSamePassword = true;
                            String newPassword;
                            do {
                                System.out.print("Enter New Password: ");
                                newPassword = input.nextLine();
                                if (newPassword.equals(password)) {
                                    System.out.println("New password cannot be the same as the old password.");
                                } else {
                                    password = newPassword;
                                    isSamePassword = false;
                                    System.out.println("Password reset successful!");
                                }
                            } while (isSamePassword);
                        }
                    }
                    break;

                default:
                    System.out.println("Invalid User ID.");
                    break;
            }
        } while (!isLoggedIn);
    }

}
