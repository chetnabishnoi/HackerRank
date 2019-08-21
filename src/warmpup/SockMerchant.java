package warmpup;

import java.util.HashSet;

public class SockMerchant {

    public static void main(String[] args) {
        int array[] = new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20};
        System.out.println(sockMerchant(9, array));
    }


    private static int sockMerchant(int n, int[] ar) {
        HashSet<Integer> set = new HashSet<>();
        int pairs = 0;
        for (int i = 0; i < n; i++) {
            if (set.contains(ar[i])) {
                set.remove(ar[i]);
                pairs++;
            } else {
                set.add(ar[i]);
            }
        }
        return pairs;
    }
}
