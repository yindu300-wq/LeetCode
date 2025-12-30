class Solution {
    private static int search(int nums[],int start,int end,int target)
    {
          if(start <= end){
          int mid = start + (end - start)/2;
          if(nums[mid] == target)
           return mid;
           if(nums[mid]<target)
           return search(nums,mid+1,end,target);
           else 
           return search(nums,start,mid-1,target);
          }
          return -1;
    }
    public int search(int[] nums, int target) {
        int answer = search(nums,0,nums.length-1,target);
         return answer;
    }
}