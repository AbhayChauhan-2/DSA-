class Solution {
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {

        int m = nums1.length;
        int n = nums2.length;

        int[] best = new int[k];

        // FIX 1: try every split (len1 digits from nums1, len2 from nums2)
        for (int len1 = Math.max(0, k - n); len1 <= Math.min(k, m); len1++) {

            int len2 = k - len1;

            Stack<Integer> stack1 = new Stack<>();
            Stack<Integer> stack2 = new Stack<>();

            int[] ans = new int[k];

            // FIX 2: limit how many elements may be popped
            int drop1 = m - len1;
            for (int i = 0; i < m; i++) {
                while (!stack1.isEmpty() && drop1 > 0 && stack1.peek() < nums1[i]) {
                    stack1.pop();
                    drop1--;
                }
                stack1.push(nums1[i]);
            }

            int drop2 = n - len2;
            for (int i = 0; i < n; i++) {
                while (!stack2.isEmpty() && drop2 > 0 && stack2.peek() < nums2[i]) {
                    stack2.pop();
                    drop2--;
                }
                stack2.push(nums2[i]);
            }

            if (m + n == k) {

                int i = 0;
                int j = 0;
                int count = 0;

                while (i < m && j < n && count < k) {

                    // FIX 3: compare remaining suffixes, not just single elements
                    if (greater(nums1, i, nums2, j)) {
                        ans[count] = nums1[i];
                        count++;
                        i++;
                    } else {
                        ans[count] = nums2[j];
                        count++;
                        j++;
                    }
                }

                while (i < m && count < k) {
                    ans[count] = nums1[i];
                    i++;
                    count++;
                }

                while (j < n && count < k) {
                    ans[count] = nums2[j];
                    j++;
                    count++;
                }

            } else {

                // FIX 4: use exactly len1 / len2 elements (stack can hold extra)
                int mm = len1;
                int nn = len2;

                int[] sta1 = new int[mm];
                int[] sta2 = new int[nn];

                // Convert stack1 → sta1
                for (int x = 0; x < mm; x++) {
                    sta1[x] = stack1.get(x);
                }

                // Convert stack2 → sta2
                for (int x = 0; x < nn; x++) {
                    sta2[x] = stack2.get(x);
                }

                int i = 0;
                int j = 0;
                int count = 0;

                while (i < mm && j < nn && count < k) {

                    // FIX 3 again
                    if (greater(sta1, i, sta2, j)) {
                        ans[count] = sta1[i];
                        count++;
                        i++;
                    } else {
                        ans[count] = sta2[j];
                        count++;
                        j++;
                    }
                }

                while (i < mm && count < k) {
                    ans[count] = sta1[i];
                    i++;
                    count++;
                }

                while (j < nn && count < k) {
                    ans[count] = sta2[j];
                    j++;
                    count++;
                }
            }

            // keep the best candidate across all splits
            if (greater(ans, 0, best, 0)) {
                best = ans;
            }
        }

        return best;
    }

    // true if a[i..] is lexicographically greater than b[j..]
    private boolean greater(int[] a, int i, int[] b, int j) {

    while (i < a.length && j < b.length) {

        if (a[i] > b[j])
            return true;

        if (a[i] < b[j])
            return false;

        i++;
        j++;
    }

    if (i == a.length)
        return false;   // a finished first

    return true;        // b finished first
}
}