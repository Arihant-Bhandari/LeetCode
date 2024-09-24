class Solution 
{
    public int longestCommonPrefix(int[] arr1, int[] arr2) 
    {
        HashSet<Integer> hash = new HashSet<Integer>();

        for (int i : arr1) 
        {
            while (!hash.contains(i) && i > 0)
            {
                hash.add(i);
                i /= 10;
            }
        }

        int res = 0;

        for (int i : arr2) 
        {
            while (!hash.contains(i) && i > 0) 
            {
                i /= 10;
            }
            if (i > 0) 
            res = Math.max(res,(int) Math.log10(i) + 1);
        }
        return res;
    }
}