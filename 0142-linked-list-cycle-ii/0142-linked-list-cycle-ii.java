/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
      //detect cycle
      ListNode slow = head;
      ListNode fast = head;

      while (fast!= null && fast.next!= null){
        slow = slow.next;
        fast =  fast.next.next;

        if (slow == fast){
            // node whre cycle begins 
            slow = head;
            while (slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
        
            return slow;
        }
      }
      // no cycle
      return null;
        }
    }
