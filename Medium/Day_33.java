class Solution 
{

    public int minSubarray(int[] nums, int p) 
    {
        int total = 0;

        for (int i : nums)
        total = (total + i) % p;

        int res = total % p;

        if (res == 0) return 0;

        HashMap<Integer, Integer> hash = new HashMap<>();

        hash.put(0, -1);
        int current = 0;
        int len = nums.length;

        for (int i = 0; i < nums.length; ++i) 
        {
            current = (current + nums[i]) % p;

            int needed = (current - res + p) % p;

            if (hash.containsKey(needed)) len = Math.min(len, i - hash.get(needed));

            hash.put(current, i);
        }

        return (len == nums.length) ? -1 : len;
    }
}