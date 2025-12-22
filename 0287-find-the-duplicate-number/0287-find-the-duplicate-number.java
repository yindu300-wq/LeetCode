class Solution {
    public int findDuplicate(int[] nums) {
        int arr[] = nums;
        int i=0;
        while(i<arr.length)
        {
            if(arr[i] == i+1)
            {
                i++;
            }
            else
            {
                int temp = arr[i];
                arr[i] = arr[temp-1];
                arr[temp-1] = temp;
                if(arr[i] == arr[temp-1])
                return arr[i];
            }
        }
        return arr[i];
    }
}