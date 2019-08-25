package base.algorithm.idea.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class EraseOverlapIntervals {
    public static void main(String[] args) {
        int[][] nums = {
                {1, 2},
                {1, 2},
                {1, 2}
        };
        int res = solution(nums);
        System.out.println(res);

    }

    private static int solution(int[][] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int cnt = 1;

        Arrays.sort(nums, Comparator.comparing(o -> o[1]));

        int end = nums[0][1];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i][0] < end) {
                continue;
            }
            end = nums[i][1];
            cnt++;
        }
        return nums.length - cnt;
    }
}
