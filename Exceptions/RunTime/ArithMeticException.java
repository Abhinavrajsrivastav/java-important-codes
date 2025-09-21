package Exceptions.RunTime;

public class ArithMeticException {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will cause ArithmeticException
            System.out.println("Result: " + result);
        // } catch (ArithmeticException e) {
        //     System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }
        //******how to handle errors in java code....
         catch (Throwable e) {
            System.out.println("Caught an Exception: " + e.getMessage());
        }
}
}
