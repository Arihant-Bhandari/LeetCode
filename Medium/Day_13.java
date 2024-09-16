class Solution 
{
    public int[] xorQueries(int[] arr, int[][] queries) 
    {
        int res[] = new int[queries.length];
        
        int prev[] = new int[arr.length+1];

        prev[0] = arr[0];

        for(int i = 0; i < arr.length; i++) 
        {
            prev[i + 1] = prev[i] ^ arr[i];
        }

        for(int i = 0; i < queries.length; i++) 
        {
            res[i] = prev[queries[i][1] + 1] ^ prev[queries[i][0]];
        }

        return res;
    }
}