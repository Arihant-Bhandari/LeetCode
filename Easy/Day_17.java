class Solution 
{
    public String[] uncommonFromSentences(String s1, String s2) 
    {
        HashMap<String, Integer> hash = new HashMap<>();

        for(String word : s1.split(" "))
            hash.put(word, hash.getOrDefault(word,0)+1);

        for(String word : s2.split(" "))
            hash.put(word, hash.getOrDefault(word,0)+1);

        List<String> arr = new LinkedList();

        for(String word : hash.keySet())
            if(hash.get(word)==1)
                arr.add(word);

        return arr.toArray(new String[arr.size()]);
    }
}