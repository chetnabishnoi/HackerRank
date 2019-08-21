package arrays;

public class TwoDArray {

    public static void main(String... ar) {

        /*  1 1 1 0 0 0
            0 1 0 0 0 0
            1 1 1 0 0 0
            0 0 2 4 4 0
            0 0 0 2 0 0
            0 0 1 2 4 0
         */
        int[][] input = new int[][]{{1, 1, 1, 0, 0, 0}, {0, 1, 0, 0, 0, 0,}, {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0,}, {0, 0, 0, 2, 0, 0}, {0, 0, 1, 2, 4, 0}};
        System.out.print(hourglassSum(input));

    }

    static int hourglassSum(int[][] arr) {
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr[0].length-2; i++) {
            for (int j = 0; j < arr[1].length-2; j++) {
                int temp = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                if (temp > sum) {
                    sum = temp;
                }
            }
        }
        return sum;
    }
}
