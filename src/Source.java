public class Source {
    public static void main(String[] args) {
        int num = 67;
        System.out.println(numberToString(num).equals("67"));
    }
    public static String numberToString(int num) {
        return String.valueOf(num);
    }
}
