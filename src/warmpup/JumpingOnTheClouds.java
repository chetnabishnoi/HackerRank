package warmpup;

public class JumpingOnTheClouds {
    public static void main(String[] args) {
        int[] input = new int[]{0, 0, 0, 1, 0, 0};
        System.out.println(jumpingOnClouds(input));
    }

    static int jumpingOnClouds(int[] c) {
        int count = -1;
        int n = c.length;
        for (int i = 0; i < n; i++, count++) {
            if (i < n - 2 && c[i + 2] == 0) {
                i = i + 1;
            }
        }
        return count;
    }
}
