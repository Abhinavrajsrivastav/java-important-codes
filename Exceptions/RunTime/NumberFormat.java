package Exceptions.RunTime;

public class NumberFormat {
    public static void main(String[] args) {
        String invalidNumber = "abc123";

        try {
            // Attempting to convert an invalid string to a number
            int number = Integer.parseInt(invalidNumber);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException!");
            System.out.println("Message: " + e.getMessage());
        }
    }
    
}
