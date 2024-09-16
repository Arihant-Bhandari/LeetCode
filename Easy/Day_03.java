package Easy;
class Solution 
{
    public int getLucky(String s, int k) 
    {
        String str = "";
        int j = 0;
        for(int i = 0; i<s.length(); i++)
        {
            str = str + Integer.toString(((int)s.charAt(i))%96);
        }
        int res = 0;
        while(j<k)
        {
            for(int i = 0; i<str.length(); i++)
            {
                res += Character.getNumericValue(str.charAt(i));
            }
            str = Integer.toString(res);
            j++;
            res = 0;
        }
        return Integer.parseInt(String.valueOf(str));
    }
}