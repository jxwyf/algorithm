/**
 * 描述:
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        //删除头节点
        while (head != null && head.val == val){
            ListNode delNode = head;
            head = head.next;
            delNode.next = null;
        }

        if(head == null){
            return head;
        }

        ListNode prev = head;
        while (prev.next != null){
            if(prev.next.val == val){
                ListNode delNode = prev.next;
                prev.next = delNode.next;
                delNode.next = null;
            }else {
                prev = prev.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        ListNode head = new ListNode(arr);
        System.out.println(head);

        ListNode listNode = new Solution().removeElements(head, 2);
        System.out.println(listNode);
    }
}
