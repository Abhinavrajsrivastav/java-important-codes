package Exceptions.RunTime;

class NullPointerExc {
    public static void main(String[] args) {
        String str = null; // null reference

        try {
            // This will throw NullPointerException
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException!");
            System.out.println("Message: " + e.getMessage());
        }
    }
}
