import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int arr[] = nums;
           for(int i=0;i<arr.length-2;i++)
           {
            if( i != 0 && arr[i-1] == arr[i])
              continue;
              int j=i+1;
              int k=arr.length-1;
              while(j<k)
              {
                int sum = arr[i]+arr[j]+arr[k];
                if(sum == 0)
                {
                    ans.add(Arrays.asList(arr[i],arr[j++],arr[k--]));
                    while(j<k && arr[j-1]==arr[j]) j++;
                    while(j<k && arr[k+1]==arr[k]) k--;
                    
                }
                else if(sum<0) 
                {
                    j++;
                }
                else 
                {
                    k--;
                }
              }
           }
           return ans;
    }
}