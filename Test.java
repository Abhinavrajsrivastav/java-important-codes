public class Test {
    public static void main(String[] args) {
        String str = "hello";
        char[] arr = new char[str.length()];

        char[] num = {'1','2','3'};
        String s;

        // arr = str.toCharArray();
        s = String.copyValueOf(num);
        System.out.println("hey!! "+s);
    }
}
