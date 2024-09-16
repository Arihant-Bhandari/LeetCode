class Solution {
    public int longestSubarray(int[] nums) 
    {
        int res = 0;
        int max = 0;
        int count = 0;

        for(int num : nums)
        {
            if(max<num)
            {
                max = num;
                res = 0;
                count = 0;
            }
            if(max==num)
            count++;
            else
            count=0;

            res = Math.max(res, count);
        }

        return res;
    }
}