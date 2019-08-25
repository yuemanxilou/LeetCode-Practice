package base.algorithm.practice;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNum {

    private static Map<Integer, Integer> maps = new HashMap<>(16);

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5};
        int res = solution(nums);
        System.out.println(res);

        int[] arr = new int[1];
        boolean flag = solution2(nums, arr);
        System.out.println(flag);
        if (flag) {
            System.out.println(arr[0]);
        }
    }

    private static int solution(int[] nums) {
        int res = -1;
        if (nums == null || nums.length == 0) {
            return res;
        }

        int len = nums.length;

        for (int i = 0; i < len; i++) {
            int value = nums[i];
            if (maps.containsKey(value)) {
                res = value;
                break;
            } else {
                maps.put(nums[i], i);
            }
        }
        return res;
    }

    private static boolean solution2(int[] nums, int[] res) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            int value = nums[nums[i]];

            if (nums[i] == value) {
                res[0] = value;
                return true;
            } else {
                swap(nums, i, nums[i]);
            }

        }
        return false;
    }


    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
