package Easy;
class Solution 
{
    public int countConsistentStrings(String allowed, String[] words) 
    {
        HashMap<Character,Character> hash = new HashMap<>();

        for(int i = 0; i<allowed.length(); i++)
        {
            hash.put(allowed.charAt(i),allowed.charAt(i));
        }

        int count = 0;
        boolean flag = true;
        for(int i = 0; i<words.length; i++)
        {
            for(int j = 0; j<words[i].length(); j++)
            {
                if(hash.getOrDefault(words[i].charAt(j),'-')!='-')
                {
                    continue;
                }
                else
                {
                    flag = false;
                    break;
                }
            }
            if(flag==true)
            {
                count+=1;
            }

            flag = true;
        }

        return count;
    }
}