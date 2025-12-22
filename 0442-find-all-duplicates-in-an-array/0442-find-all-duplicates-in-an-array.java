class Solution {
    public List<Integer> findDuplicates(int[] nums) {
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
                arr[temp-1]=temp;
                if(arr[i] == arr[temp-1])
                {
                    i++;
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j] != j+1)
            {
                ans.add(arr[j]);
            }
        }
        return ans;
    }
}