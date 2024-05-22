import java.util.*;

public class Main {
    public static int[] getMaxMin(int num) {
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        while (num > 0) {
            int digit = num % 10;
            maxNum = Math.max(maxNum, digit);
            minNum = Math.min(minNum, digit);
            num /= 10;
        }
        return new int[]{maxNum, minNum};
    }

    public static int findSumOfDigit(int num) {
        int[] maxMin = getMaxMin(num);
        int maxNum = maxMin[0];
        int minNum = maxMin[1];
        int sumOfDigit = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit != maxNum && digit != minNum) {
                sumOfDigit += digit;
            }
            num /= 10;
        }
        return sumOfDigit;
    }

    public static void main(String[] args) {
        int[] nums = {1223, 234, 3445, 456};
        int ans = 0;
        for (int num : nums) {
            int sum_digits = findSumOfDigit(num);
            ans += sum_digits;
        }
        System.out.println(ans);
    }
}
