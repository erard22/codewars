package equal_sides_of_an_array;

import java.util.Arrays;

class EqualSidesOfAnArray {

     static int findEvenIndex(int[] arr) {

        for(int i = 0; i < arr.length-1; i++) {
            int[] left = Arrays.copyOf(arr, i + 1);
            int[] right = Arrays.copyOfRange(arr, i + 2, arr.length);
            int sumLeft = sum(left);
            int sumRight = sum(right);
            if (sumLeft == sumRight) {
                return i + 1;
            }
        }
        return -1;
    }

    private static int sum(int[] arr) {
        return Arrays.stream(arr).reduce(0, (a, b) -> a + b);
    }

}
