package problem3334;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 

public class Solution
{
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        ListNode prevNode = null;

        if(head == null)
            return null;

       while(temp.next != null)
        {
            if(temp.val == temp.next.val)
            {
                if(prevNode == null){
                    ListNode tempSecond = temp;
                    temp = temp.next;
                    head = temp;
                    tempSecond.next = null;
                }
                 else {
                    prevNode.next  = temp.next;
                    ListNode tempSecond = temp;
                    temp = temp.next;
                    tempSecond.next = null;
                }
            }

            else {
                prevNode = temp;
                temp = temp.next;
            }


        }
        return  head;
    }
}
