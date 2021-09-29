package problem3273;

class ListNode
{
    int val;
    ListNode next;

    ListNode(int x)
    {
        val = x;
    }
}

public class Solution
{
    public void deleteNode(ListNode node)
    {
        // [4, 5, 1, 9]

        while(node.next.next != null)
        {
            node.val = node.next.val;
            node = node.next;
        }

        node.val = node.next.val;
        node.next = null;
    }
}
