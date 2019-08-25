package base.algorithm.sort;

public class QuickSort5 {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 6, 2};

        quickSort(array, 0, array.length - 1);


    }

    private static void quickSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }

        int i = left;
        int j = right;

        int value = nums[left];

        while (i < j) {

            while (i < j && value <= nums[j]) {
                j--;
            }

            while (i < j && value >= nums[i]) {
                i++;
            }

            swap(nums, i, j);
        }

        nums[left] = nums[i];
        nums[i] = value;

        quickSort(nums, left, i - 1);
        quickSort(nums, i + 1, right);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}
