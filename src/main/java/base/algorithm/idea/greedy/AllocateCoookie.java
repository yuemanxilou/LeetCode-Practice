package base.algorithm.idea.greedy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AllocateCoookie {
    public static void main(String[] args) {
        int[] c = {1, 2};
        int[] e = {1, 2, 3};
        System.out.println(solution(c, e));
    }

    private static int solution(int[] c, int[] e) {
        Arrays.sort(c);
        Arrays.sort(e);

        int i = 0;
        int j = 0;

        while (i < c.length && j < e.length) {
            if (c[i] <= e[j]) {
                i++;
            }

            j++;
        }

        return i;
    }
}
