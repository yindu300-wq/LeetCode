class Solution {
    public int[] numberOfPairs(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int pair = 0;
        for(int i =0;i<n-1; )
        {
            if(nums[i] == nums[i+1])
            {
                pair++;
                i += 2;
            }
            else
            i++;
        }
        return new int[]{pair, (n-(2*pair))};
    }
}