package arrays;

public class LeftRotationOnArray {

    public static void main(String... ar) {

        //Output should be 5 1 2 3 4
        int[] input = new int[]{1, 2, 3, 4, 5};
        int[] output = rotLeft(input, 4);
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]);
        }
    }

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int[] arr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int newPosition = i - d;
            if (newPosition < 0) {
                newPosition = a.length + newPosition;
            }
            arr[newPosition] = a[i];
        }
        return arr;
    }

}
