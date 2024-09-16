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
    public ListNode insertGreatestCommonDivisors(ListNode head) 
    {
        ListNode current = head;
        ListNode ahead = head.next;

        if(head.next==null)
        return head;

        ListNode temp;

        while(ahead != null)
        {
            temp = new ListNode();

            int gcd = gcd(current.val,ahead.val);

            temp.val = gcd;
            current.next = temp;
            temp.next = ahead;

            current = ahead;
            ahead = ahead.next;
        }

        return head;
    }
    public int gcd(int m, int n)
    {
        if(n==0)
        return m;
        else
        return gcd(n,m%n);
    }
}