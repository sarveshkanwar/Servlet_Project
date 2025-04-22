package servlet;


public class Password {

    public static boolean isValidPassword(String password) {
        if (password.length() < 8) return false;

        if (!password.matches(".*[A-Z].*")) return false;
        if (!password.matches(".*\\d.*")) return false;


        String specialChars = password.replaceAll("[a-zA-Z0-9]", "");
        if (specialChars.length() != 1) return false;

        return true;
    }
}