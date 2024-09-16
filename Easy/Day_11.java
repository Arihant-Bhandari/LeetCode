package Easy;
class Solution 
{
    public int minBitFlips(int start, int goal) 
    {
        String x = Integer.toBinaryString(start^goal);

        int count = 0;

        for(int i = 0; i<x.length(); i++)
        {
            if(x.charAt(i)=='1')
            {
                count+=1;
            }
        }

        return count;
    }
}