class Solution 
{
    public List<Integer> lexicalOrder(int n) 
    {
        List<Integer> arr = new LinkedList<>();

        int current = 1;

        for(int i = 0; i < n; i++)
        {
            arr.add(current);

            if(current*10<=n)
            current *= 10;
            else
            {
                while(current % 10 == 9 || current >= n)
                current /=10;

                current +=1;
            }
        }

        return arr;
    }
}