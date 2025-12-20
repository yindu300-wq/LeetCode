class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int arr[] = nums;
        for(int i = 0;i<arr.length-1;i+=2)
        {
            for(int j=0;j<arr.length-2;j+=2)
            {
                if(arr[j] > arr[j+2])
                {
                    swap(arr,j,j+2);
                }
            }
        }
        for(int i=1;i<arr.length;i+=2)
        {
            for(int j=1;j+2<arr.length;j+=2)
            {
                if(arr[j]<arr[j+2])
                {
                    swap(arr,j,j+2);
                }
            }
        }
        return arr;
    }
        void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}