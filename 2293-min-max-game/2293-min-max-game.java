class Solution {
    public int minMaxGame(int[] nums) {
        while(nums.length != 1)
        {
            int newArr[] = new int[nums.length/2]; 
            for(int i=0;i<newArr.length;i++)
            {
                if(i % 2 == 0)
                {
                    newArr[i] = Math.min(nums[2 * i],nums[2 * i + 1]);
                }
                else
                {
                    newArr[i]=Math.max(nums[2 * i], nums[2 * i + 1]);
                }
            }
            nums = newArr;
        }
        return nums[0];
    }
}