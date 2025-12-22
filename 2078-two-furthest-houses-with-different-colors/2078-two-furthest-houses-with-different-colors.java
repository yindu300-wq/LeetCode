class Solution {
    public int maxDistance(int[] colors) {
        int maxd = 0;
        for(int i=0;i<colors.length;i++)
        {
            for(int j=i+1;j<colors.length;j++)
            {
                if(colors[i] != colors[j])
                {
                    int currentd = j-i;
                    maxd = Math.max(currentd,maxd);
                }
            }
        }
        return maxd;
    }
}