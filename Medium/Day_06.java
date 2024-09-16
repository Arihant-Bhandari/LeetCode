class Solution 
{
    public ListNode modifiedList(int[] nums, ListNode head) 
    {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) 
        {
            set.add(num);
        }
        
        ListNode dummy = new ListNode(0);  
        ListNode x = dummy;  

        ListNode current = head;
        while (current != null) 
        {
            if (!set.contains(current.val)) 
            {
                x.next = current;  
                x = x.next;        
            }
            current = current.next;
        }

        x.next = null;  

        return dummy.next;  
    }
}