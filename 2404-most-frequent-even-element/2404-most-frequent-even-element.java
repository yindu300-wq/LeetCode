class Solution {
    public int mostFrequentEven(int[] nums) {
        int ans = -1;
        int max =0 ;
        HashMap<Integer,Integer>map = new HashMap<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        for(int key : map.keySet())
        {
            if(map.get(key)>max)
            {
                max = map.get(key);
                ans = key;
            }
            else if(map.get(key) == max)
            {
                ans = Math.min(ans,key);
            }
        }
        return ans;

    }
}