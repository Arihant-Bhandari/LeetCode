class Solution 
{
    public int[] missingRolls(int[] rolls, int mean, int n) 
    {
        int oMean = 0;
        for(int i = 0; i<rolls.length; i++)
        {
            oMean += rolls[i];
        }

        int sum = mean*(rolls.length+n)-oMean;

        if(sum>(6*n) || sum < n)
        {
            return new int[0];
        }

        int result[] = new int[n];

        int rem = sum%n;
        int val = sum/n;

        for(int i = 0; i<n; i++)
        {
            result[i] = val + (i < rem ? 1 : 0);
        }

        return result;
    }
}