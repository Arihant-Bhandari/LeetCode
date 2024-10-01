class Solution 
{
    public boolean canArrange(int[] arr, int k) 
    {
        HashMap<Integer, Integer> hash = new HashMap<>();

        for(int i : arr)
        {
            int rem = ((i % k) + k) % k;
            hash.put(rem, hash.getOrDefault(rem, 0) + 1);
        }

        for(int i : arr)
        {
            int rem = ((i % k) + k) % k;

            if(rem == 0)
            {
                if(hash.get(rem) % 2 == 1) 
                return false;
            } 

            else if (!Objects.equals(hash.get(rem), hash.get(k - rem))) 
                return false;
        }

        return true;
    }
}