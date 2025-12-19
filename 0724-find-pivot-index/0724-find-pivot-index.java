class Solution {
    public int pivotIndex(int[] nums) {
        int x = 0;
        for(int i=0;i<nums.length;i++)
        {
            x += nums[i];
        }
        int y=0;
        for(int k=0;k<nums.length;k++)
        {
        if(y == x-y-nums[k])
        {
            return k;
        }
          y += nums[k];
        }
        return -1;
    }
}