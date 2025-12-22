class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int arr[] = nums;
        int i=0;
        while(i<arr.length)
        {
            if(arr[i] == i+1)
            {
                i++;
            }
            else {
            int temp = arr[i];
            arr[i]=arr[temp-1];
            arr[temp-1]=temp;
            if(arr[i] == arr[temp-1])
            {
                ans[0] = arr[i];
                i++;
            }
            }
        }
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j] != j+1)
            {
                ans[1] = j+1;
            }
        }
        return ans;
    }
}