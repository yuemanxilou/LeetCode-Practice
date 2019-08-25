package base.algorithm.idea.twopointers;

public class JudgeSquareSum {
    public static void main(String[] args) {
        int num = 6;
        if (solution(num)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        System.out.println(Math.sqrt(num));

    }

    private static boolean solution(int num) {
        boolean res = false;

        int i = 1;
        int max = num / 2;

        int count = 0;

        while (i <= max) {
            count += i * i;
            if (count == num) {
                res = true;
            } else if (count < num) {
                i++;
            } else {
                break;
            }

        }

        return res;
    }
}
