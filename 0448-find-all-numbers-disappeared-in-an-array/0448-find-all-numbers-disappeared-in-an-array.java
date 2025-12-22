class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
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
                {
                    i++;
                }
            }
        }
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j] != j+1)
            {
                ans.add(j+1);
            }
        }
        return ans;
    }
}