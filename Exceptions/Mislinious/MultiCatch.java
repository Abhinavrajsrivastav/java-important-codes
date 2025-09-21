package Exceptions.Mislinious;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            // Code that may throw different exceptions
            // String s = null;
            // System.out.println(s.length());

            // int[] arr = new int[3];
            // System.out.println(arr[5]); 

            // int num = Integer.parseInt("abc"); 
            int a = 10 / 0; 

        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (Exception e) { 
            System.out.println("Caught some other Exception: " + e.getMessage());
        }

        System.out.println("Program continues after try-catch blocks...");
    }
}
