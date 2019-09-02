package base.algorithm.idea.twopointers;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {2, 0};
        int[] nums2 = {1};

        merge(nums1, 1, nums2, 1);

        System.out.println(nums1);

    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || m == 0){
            System.arraycopy(nums2, 0, nums1, 0, n);
            return;
        }

        if (nums2 == null || nums2.length == 0 || n == 0){
            return;
        }

        int i = m-1;
        int j = n-1;

        int z = m + n -1;

        while (z >= 0 && i >= 0 && j >= 0){
            int num1Value = nums1[i];
            int num2Value = nums2[j];

            if (num1Value >= num2Value){
                nums1[z--] = num1Value;
                i--;
            }else {
                nums1[z--] = num2Value;
                j--;
            }
        }

        if (i+1 == 0 && j >=0 ){
            while (z >=0 && j>=0){
                nums1[z--] = nums2[j--];
            }
        }


        if (j+1 == 0 && i>=0){
            while (z >=0 && j>=0){
                nums1[z--] = nums1[j--];
            }
        }

    }

}
