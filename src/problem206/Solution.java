package problem206;


  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }



public class Solution
{
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode prevNode = head;
        ListNode currNode = head.next;
        head.next = null;

        while(currNode != null)
        {
            ListNode temp = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = temp;
        }
        head = prevNode;
        return head;
    }
}
