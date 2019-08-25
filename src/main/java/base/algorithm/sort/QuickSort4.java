package base.algorithm.sort;

import java.util.Arrays;

public class QuickSort4 {

    public static void main(String[] args) {
        int[] num = {3, 45, 78, 64, 52, 11, 64, 55, 99, 11, 18};
        System.out.println(arrayToString(num, "未排序"));
        quickSort(0, num.length - 1, num);
        System.out.println(arrayToString(num, "排序"));
        System.out.println("数组个数：" + num.length);
    }

    private static void quickSort(int left, int right, int[] num) {
        if (left >= right) {
            return;
        }

        int i = left;
        int j = right;

        int key = num[left];

        while (i < j) {

            while (i < j && key <= num[j]) {
                j--;
            }

            while (i < j && key >= num[i]) {
                i++;
            }

            int temp = num[i];
            num[i] = num[j];
            num[j] = temp;
        }

        num[left] = num[i];
        num[i] = key;


        quickSort(left, i - 1, num);
        quickSort(i + 1, right, num);
    }

    private static String arrayToString(int[] num, String type) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("数组为(" + type + ")");
        stringBuilder.append(Arrays.toString(num));
        return stringBuilder.toString();
    }
}
