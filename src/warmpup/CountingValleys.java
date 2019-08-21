package warmpup;

public class CountingValleys {
    public static void main(String[] args) {
        String steps = "UDDDUDUU";
        System.out.println(countingValleys(steps.length(), steps));
    }

    static int countingValleys(int n, String s) {
        int level = 0;
        int valleys = 0;
        for (char character : s.toCharArray()) {
            if (character == 'U') {
                level++;
            }
            if (character == 'D') {
                level--;
            }

            if (level == 0 && character == 'U') {
                ++valleys;
            }
        }

        return valleys;
    }
}
