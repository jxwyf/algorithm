/**
 * 描述:
 */
public class LinkedListQueue<E> implements Queue<E>{

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // 入队 从链表尾部入队
    @Override
    public void enqueue(E e) {
        // 判断链表尾是否为空
        if (tail == null) {
            //在尾部插入一个节点
            tail = new Node(e);
            // 头等于尾
            head = tail;
        }else {
            // 元素的下一个
            tail.next = new Node(e);
            tail = tail.next;
        }
        size++;
    }

    //出队
    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Cannot dequeue from an empty queue");
        }
        //出队元素的节点
        Node retNode = head;
        //新的头节点
        head = head.next;
        retNode.next = null;
        if (head == null) {
            tail = null;
        }
        size --;
        return retNode.e;
    }

    @Override
    public E getFront() {
        //判断队列是否为空
        if (isEmpty()) {
            throw new IllegalArgumentException("Cannot dequeue from an empty queue");
        }
        return head.e;
    }

    //节点
    private class Node{
        public E e;
        public Node next;

        public Node(E e, Node next){
            this.e = e;
            this.next = next;
        }

        public Node(E e){
            this(e,null);
        }
        public Node(){
            this(null,null);
        }

        @Override
        public String toString(){
            return e.toString();
        }
    }

    //头节点 尾节点
    private Node head, tail;
    //存储大小
    private int size;

    public LinkedListQueue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }


    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Queue: front ");
        Node cur = head;
        while (cur !=null){
            res.append(cur + "->");
            cur = cur.next;
        }
        res.append("NULL tail");
        return res.toString();
    }

    public static void main(String[] args) {
        LinkedListQueue<Integer> queue = new LinkedListQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
            System.out.println(queue);

            if(i % 3 == 2){
                queue.dequeue();
                System.out.println(queue);
            }
        }
    }
}
