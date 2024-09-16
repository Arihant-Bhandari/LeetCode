/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution 
{
    public ListNode[] splitListToParts(ListNode head, int k) 
    {
        ListNode[] listHeads = new ListNode[k];

        int length = 0;
        ListNode current = head;
        while (current != null) 
        {
            length++;
            current = current.next;
        }

        int n = length / k;
        int p = length % k; 

        current = head;
        for (int i = 0; i < k; i++) 
        {
            ListNode headOfPart = current;
            int partSize = n + (i < p ? 1 : 0);

            for (int j = 0; j < partSize - 1; j++) 
            {
                if (current != null) 
                {
                    current = current.next;
                }
            }

            if (current != null) 
            {
                ListNode nextPart = current.next;
                current.next = null;
                current = nextPart;
            }

            listHeads[i] = headOfPart;
        }
        
        return listHeads;
    }
}