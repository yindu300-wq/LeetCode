class Solution {
    private static int searchInsert(int[] nums,int start,int end,int target)
    {
        if(start<=end){
        int mid = start + (end-start)/2;
        if(nums[mid] == target)
        return mid;
        if(nums[mid] < target)
        return searchInsert(nums,mid+1,end,target);
        else 
        return searchInsert(nums,start,mid-1,target);
        }
        return start;
    }
    public int searchInsert(int[] nums, int target) {
        int answer = searchInsert(nums,0,nums.length-1,target);
        return answer;
    }
}