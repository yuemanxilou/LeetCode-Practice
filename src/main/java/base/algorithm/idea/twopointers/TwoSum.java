package base.algorithm.idea.twopointers;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 19;

        solution(nums, target);

    }

    private static void solution(int[] nums, int target) {

        if (nums == null || nums.length == 0) {
            return;
        }

        int i = 0;
        int j = nums.length - 1;

        boolean flag = false;

        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == target) {
                flag = true;
                System.out.println("i: " + i + " " + "j: " + j);
                break;
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        if (!flag) {
            System.out.println("not found");
        }

    }

}
