import java.util.Arrays;

class Solution {
    public int nextGreaterElement(int n) {
        String s = String.valueOf(n);
        char[] digits = s.toCharArray();

        int index = -1;

        for (int i = digits.length - 1; i >= 1; i--) {
            if (digits[i] > digits[i - 1]) {
                index = i - 1;
                break;
            }
        }

        if (index == -1) {
            return -1;
        }

        int smallind = -1;

        for (int i = digits.length - 1; i >= index + 1; i--) {
            if (digits[i] > digits[index]) {
                if (smallind == -1 || digits[i] < digits[smallind]) {
                    smallind = i;
                }
            }
        }

        char temp = digits[index];
        digits[index] = digits[smallind];
        digits[smallind] = temp;

        Arrays.sort(digits, index + 1, digits.length);

        String st = new String(digits);
        long result = Long.parseLong(st);

        if (result > Integer.MAX_VALUE) {
            return -1;
        }

        return (int) result;
    }
}