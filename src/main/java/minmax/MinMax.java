package minmax;

import static java.util.Arrays.sort;

class MinMax {

    public static int[] minMax(int[] input) {
        sort(input);
        return new int[] {input[0], input[input.length - 1]};
    }

}