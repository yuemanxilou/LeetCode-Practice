package base.algorithm.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 3, 4, 5};
        int index = search(nums, 2);

        System.out.println(index);
    }

    private static int search(int[] nums, int value) {

        int l = 0;
        int h = nums.length - 1;

        while (l <= h) {

            int mid = l + (h - l) / 2;
            int midValue = nums[mid];

            if (value == midValue) {
                return mid;
            } else if (value > midValue) {
                l = mid + 1;
            } else {
                h = mid - 1;

            }
        }

        return -1;
    }
}
