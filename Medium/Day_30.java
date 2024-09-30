class CustomStack 
{
    int arr[];
    int pos;

    public CustomStack(int maxSize) 
    {
        arr = new int[maxSize];
        pos = 0;
    }
    
    public void push(int x) 
    {
        if(pos < arr.length) arr[pos++] = x;
    }
    
    public int pop() 
    {
        if(pos == 0) return -1;
        else return arr[--pos];
    }
    
    public void increment(int k, int val) 
    {
        int limit = Math.min(k, pos);
        for(int i = 0; i < limit; i++) arr[i] += val;
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */