class Solution 
{
    public int minExtraChar(String s, String[] dictionary) 
    {
        HashSet<String> dictionarySet = new HashSet<>(Arrays.asList(dictionary));

        int dp[] = new int[s.length() + 1];

        for (int start = s.length() - 1; start >= 0; start--) 
        {
            dp[start] = dp[start + 1] + 1;

            for (int end = start; end < s.length(); end++) 
            {
                var curr = s.substring(start, end + 1);

                if (dictionarySet.contains(curr)) 
                    dp[start] = Math.min(dp[start], dp[end + 1]);
            }
        }

        return dp[0];
    }
}