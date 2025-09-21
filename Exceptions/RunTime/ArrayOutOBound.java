package Exceptions.RunTime;

public class ArrayOutOBound {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        try {
            // Accessing an out-of-bounds index
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException!");
            System.out.println("Message: " + e.getMessage());
        }
    }
    
}
