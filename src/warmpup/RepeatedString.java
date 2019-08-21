package warmpup;

public class RepeatedString {
    public static void main(String... arg) {
        System.out.println(repeatedString("a", 1000000000000l));
    }

    static long repeatedString(String s, long n) {
        int length = s.length();
        long count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        long numberOfStrings = n / length;
        long remainingLength = (int) (n % length);
        count = numberOfStrings * count;
        for (int i = 0; i < remainingLength; i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }
}
