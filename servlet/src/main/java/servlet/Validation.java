package servlet;

public class Validation {

    public static boolean isValidName(String name) {

        return name != null && name.matches("^[A-Z][a-zA-Z]{2,}$");
    }
}
