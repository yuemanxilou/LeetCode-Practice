package base.algorithm.idea.sort;

import java.util.Arrays;
import java.util.PriorityQueue;

public class FindKthElement {
    private static PriorityQueue<Integer> queue = new PriorityQueue<>();

    public static void main(String[] args) {

        int[] nums = {3,2,1,5,6,4};
        int k = 2;

        int res = solution1(nums, k);

        System.out.println(res);

    }

    private static int solution(int[] nums, int k){
        if (nums == null || nums.length == 0){
            throw new RuntimeException("error");
        }

        Arrays.sort(nums);

        int len = nums.length;
        return nums[len - k];
    }

    private static int solution1(int[] nums, int k){
        if (nums == null || nums.length == 0){
            throw new RuntimeException("error");
        }

        for (int num : nums){
            queue.add(num);
            if (queue.size() > k){
                queue.poll();
            }
        }

        return queue.peek();

    }
}
