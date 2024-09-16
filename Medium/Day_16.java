class Solution 
{
    public int findMinDifference(List<String> timePoints) 
    {
        int time[] = new int[timePoints.size()];
        int i = 0;
        for(String s : timePoints)
        {
            time[i++] = Integer.parseInt(s.substring(0,2))*60 + Integer.parseInt(s.substring(3));
        }

        Arrays.sort(time);

        int ans = Integer.MAX_VALUE;

        for(i = 0; i < time.length-1; i++)
        {
            ans = Math.min(ans, time[i+1] - time[i]);
        }

        return Math.min(ans, 24*60 - time[time.length-1]+time[0]);
    }
}