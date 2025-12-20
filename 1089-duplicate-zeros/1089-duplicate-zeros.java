class Solution {
    public void duplicateZeros(int[] arr) {
        int count = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                count++;
            }
        }
        int j = (arr.length+count-1);
        int k = (arr.length-1);
        while(k!=j && k>=0)
        {
            if(j<arr.length)
            {
                arr[j]=arr[k];
            }
            j--;
            if(arr[k]==0)
            {
                if(j<arr.length)
                {
                    arr[j]=arr[k];
                }
                j--;
            }
            k--;
        }
    }
}