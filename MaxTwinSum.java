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
    public int pairSum(ListNode head) {
        
        ArrayList<Integer> list = new ArrayList<>();
        while(head != null)
        {
            list.add(head.val);
            head = head.next;
        }
        int maxSum = 0;
        int i= 0;
        int j = list.size()-1;
        while(i<j)
        {
            maxSum = Math.max(maxSum,list.get(i)+list.get(j));
            i++;
            j--;
        }
        return maxSum;
    }
}