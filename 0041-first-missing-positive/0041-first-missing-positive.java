class Solution {
    public int firstMissingPositive(int[] nums) {
        int arr[] = nums;
        int i = 0;
        while(i<arr.length)
        {
            int cIndex = arr[i]-1;
            if(arr[i]>0 && arr[i]<=arr.length && arr[i] != arr[cIndex])
            {
                swap(arr,i,cIndex);
            }
            else
            {
                i++;
            }
        }
        for(i=0;i<arr.length;i++)
        {
            if(arr[i] != i+1)
            {
                return i+1;
            }
        }
        return arr.length+1;
    }
    void swap(int arr[],int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}