class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        int c = 0;
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
            if(nums[i] != 0)
            {
                int temp = nums[i];
            for(int j = i;j<n;j++)
            {
                nums[j] = nums[j] - temp;
            }
            c++;
            }
        
        }
        return c;
    }
}