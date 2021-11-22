package day01;

public class IsValidName {

    public boolean isValidName(String name) {
        if (name != null && name.contains(" ")) {
            return true;
        }
        throw new IllegalArgumentException("Invalid name!");
    }
}
