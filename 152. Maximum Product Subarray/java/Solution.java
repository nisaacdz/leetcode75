class Solution {
    public int maxProduct(int[] nums) {
        int min = 1, max = 1, ans = Integer.MIN_VALUE;

        for (int num: nums) {
            int temp1 = num * min, temp2 = num * max;
            min = min(num, temp1, temp2);
            max = max(num, temp1, temp2);

            ans = Math.max(ans, max);
        }

        return ans;
    }

    int min(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}