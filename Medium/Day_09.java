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
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) 
    {
        int[][] matrix = new int[m][n];

        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;

        ListNode current = head;

        while (top <= bottom && left <= right) 
        {
            for (int i = left; i <= right; i++) 
            {
                if(current==null)
                    {
                        matrix[top][i] = -1;
                    }
                    else
                    {
                        matrix[top][i] = current.val;
                        current = current.next;
                    }
            }
            top++;

            for (int i = top; i <= bottom; i++) 
            {
                if(current==null)
                    {
                        matrix[i][right] = -1;
                    }
                    else
                    {
                        matrix[i][right] = current.val;
                        current = current.next;
                    }
            }
            right--; 

            if (top <= bottom) 
            {
                for (int i = right; i >= left; i--) 
                {
                    if(current==null)
                    {
                        matrix[bottom][i] = -1;
                    }
                    else
                    {
                        matrix[bottom][i] = current.val;
                        current = current.next;
                    }
                }
                bottom--;  
            }

            if (left <= right) 
            {
                for (int i = bottom; i >= top; i--) 
                {
                    if(current==null)
                    {
                        matrix[i][left] = -1;
                    }
                    else
                    {
                        matrix[i][left] = current.val;
                        current = current.next;
                    }
                }
                left++;
            }
        }

        return matrix;
    }
}