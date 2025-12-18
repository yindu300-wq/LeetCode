class Solution {
    public int maxArea(int[] height) {
        int arr[] = height;
        int maxArea = 0;
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            maxArea = Math.max(maxArea,Math.min(arr[i],arr[j])*(j-i));
            if(arr[i]<arr[j])
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return maxArea;
    }
}