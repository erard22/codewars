package smallest_integer;

import java.util.stream.IntStream;

public class SmallestInteger {

    public static int findSmallestInt(int[] args) {
        return IntStream.of(args).min().getAsInt();
    }

}
