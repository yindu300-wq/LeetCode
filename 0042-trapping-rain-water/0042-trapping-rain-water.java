class Solution {
    public int trap(int[] height) {
        int arr[] = height;
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        int maxLeft = arr[0];
        int maxRight = arr[arr.length - 1];
        left[0] = maxLeft;
        right[arr.length - 1] = maxRight;
        int ans = 0;
        for (int i = 1; i < arr.length; i++) {
            maxLeft = Math.max(maxLeft, arr[i]);
            left[i] = maxLeft;
        }
        for (int i = arr.length - 2; i >= 0; i--) {
            maxRight = Math.max(maxRight, arr[i]);
            right[i] = maxRight;
        }
        for (int i = 0; i < arr.length; i++) {
            ans += Math.min(left[i], right[i]) - arr[i];
        }
        return ans;
    }
}