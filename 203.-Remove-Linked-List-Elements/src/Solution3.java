/**
 * 描述:
 */
public class Solution3 {
    public ListNode removeElements(ListNode head, int val) {
        //如果头节点为空
        if(head == null){
            return  null;
        }
        ListNode res = removeElements(head.next,val);
        if(head.val == val){
            return res;
        }else {
            head.next = res;
            return head;
        }


    }
}
