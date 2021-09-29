package problem876;

  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class Solution
{
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int length = 0;

        while(temp.next != null)
        {
            temp = temp.next;
            length++;
        }

        int mid;

        mid = length % 2 == 0 ? (length / 2) : length / 2 + 1;

        int distanceWent = 0;
        ListNode currNode = head;
        while(distanceWent != mid){
            currNode = currNode.next;
            distanceWent++;
        }
        return currNode;
    }
}
