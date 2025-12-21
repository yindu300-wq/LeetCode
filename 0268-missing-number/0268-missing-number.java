class Solution {
    public int missingNumber(int[] nums) {
        int arr[] = nums;
        int i = 0;
        while(i<arr.length){
        int cIndex = arr[i];
        if(cIndex < arr.length && arr[i] != arr[cIndex])
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
                if(arr[i] != i) 
                {
                    return i;
                }
            }
        
        return arr.length;
    }
    void swap (int arr[],int i,int j)
    {
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
    }
}