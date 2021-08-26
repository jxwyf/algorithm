/**
 * 描述:
 */
public class Solution2 {
    public ListNode removeElements(ListNode head, int val) {

        //创建虚拟节点
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        ListNode prev = dummyHead;
        while (prev.next != null){
            if(prev.next.val == val){
                prev.next = prev.next.next;
            }else {
                prev = prev.next;
            }
        }
        return head;
    }
}
