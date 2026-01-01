      class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length)
            return -1;

        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;
        for (int i = 0; i < bloomDay.length; i++) {
            start = Math.min(start, bloomDay[i]);
            end = Math.max(end, bloomDay[i]);
        }
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (possible(bloomDay, m, k, mid)) {
                end = mid;       
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
    private boolean possible(int[] bloomDay, int m, int k, int day) {
        int bouquet = 0;
        int count = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= day) {
                count++;
                if (count == k) {
                    bouquet++;
                    count = 0;
                }
            } else {
                count = 0;
            }
        }

        return bouquet >= m;
    }
}
