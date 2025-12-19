class Solution {
    public int majorityElement(int[] nums) {
        int arr[] = nums;
        int ans = arr[0];
        int count = 1;
        for(int i =1;i<arr.length;i++)
        {
            if(count == 0)
            {
                ans = arr[i];
                count = 1;
            }
            else if(arr[i]==ans)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        return ans;
    }
}