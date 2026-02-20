/**
@author Raunaq Kapoor
@version February 19, 2026

This class has a method that checks password strength.
 */

package Block2Project;

public class PasswordStrengthChecker {

    /**
    This method checks if the string password has at least one uppercase letter,
    at least one special character, and is 8 characters or longer.
    @param password - the string password the user is checking
    @return checkerMessage - a string version of the StringBuilder object containing
    either the warnings of what needs to be changed with the password or a statement saying
    that the password is strong.
     */
    public static String StrengthChecker(String password) {

        String checkerMessage;
        StringBuilder sb = new StringBuilder();
        boolean hasUppercase = password.matches(".*[A-Z].*");
        boolean hasSpecialChar = password.matches(".*[!@#$%&?].*");
        if (!hasUppercase) {
            sb.append("\n The password must contain at least one uppercase letter");
        }

        if (!hasSpecialChar) {
            sb.append("\n The password must contain at least one special character letter");
        }

        if (password.length() < 8) {
            sb.append("\n The password must have at least 8 characters");
        }

        if(password.length()>=8 && hasUppercase && hasSpecialChar){
            sb.append("\n Strong password!");
        }

        checkerMessage = sb.toString();

        return checkerMessage;

    }

    public static void main(String[] args) {
        System.out.println(StrengthChecker("Rkapoor15620405!"));
    }

}
