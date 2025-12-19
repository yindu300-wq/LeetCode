class Solution {
    public int[] productExceptSelf(int[] nums) {
       int arr[] = nums;
       int ans[] = new int[arr.length];
       int zero = 0;
       int product = 1;
       for(int i=0;i<arr.length;i++)
       {
        if(arr[i] == 0)
        {
            zero++;
        }
        else
        {
            product *= arr[i];
        }
       }
       for(int i=0;i<arr.length;i++)
       {
        if(zero > 1)
        {
            ans[i] = 0;
        }
        else if (nums[i] == 0) {
                ans[i] = product;
            }
            else {
                ans[i] = (zero == 1) ? 0 : product / nums[i];
            }
        }

        return ans;
       
    }
}