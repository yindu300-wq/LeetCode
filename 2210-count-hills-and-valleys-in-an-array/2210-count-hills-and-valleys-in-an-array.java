class Solution {
    public int countHillValley(int[] nums) {
        int n = nums.length;
        int c=0;
        int  prev = nums[0];
        for(int i = 1;i<n-1;i++)
        {
            if (nums[i] == nums[i + 1]) continue;
            if(  ((prev < nums[i]) && (nums[i+1] < nums[i])) || ((prev > nums[i]) && (nums[i+1] > nums[i])) ) {
                c++;
                
            }
            prev = nums[i];
        }
        
        return c;
    }
}