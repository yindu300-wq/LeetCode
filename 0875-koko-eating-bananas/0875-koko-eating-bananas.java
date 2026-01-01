class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = 0;
        for (int i = 0; i < piles.length; i++) {
            end = Math.max(end, piles[i]);
        }

        int ans = -1;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(isValid(piles,mid,h))
            {
                end = mid-1;
                ans = mid;
            }
            else 
            start = mid+1;
        }
        return ans;
    }
    private boolean isValid(int[] piles, int k, int h) {
        long hours = 0;
        for(int i=0;i<piles.length;i++)
        {
            if(piles[i]%k == 0)
            {
                hours += piles[i]/k;
            }
            else
            {
                hours += (piles[i]/k)+1;
            }
        }
            return hours <= h;
    }
}    