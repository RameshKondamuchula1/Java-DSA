package linkedlist;

public class DesignSingleLinkedList {
    private ListNode head;
    private int size;
    public static void main(String[] args) {

    }

    public DesignSingleLinkedList() {
         head = new ListNode();
         size = 0;
    }

    public int get(int index) {
        if(index < 0 || index > size) {
            return -1;
        }

        ListNode itr = head;
        for (int i=0;i<index-1;i++) {
              itr = itr.next;
        }
        return itr.val;
    }

    public void addAtHead(int val) {
       add(0, val);
    }

    public void addAtTail(int val) {
        add(size, val);
    }

    public void addAtIndex(int index, int val) {
        add(index, val);
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index > size) {
            return;
        }
        ListNode temp = new ListNode();
        if(index==0) {
            head = head.next;
            return;
        } else {
            ListNode curr = head;
            for (int i = 1; i < index - 1; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
        }
        size--;
    }

    public void add(int index, int val) {
        ListNode listNode = new ListNode(val);
        if(index==0) {
            listNode.next = head;
            head = listNode;
        } else {
            int i = 1;
            ListNode itr = head.next;
            while(i<=index) {
                if(index==i) {
                    if(itr.next == null) {
                        itr.next = listNode;
                    } else {
                        listNode.next = itr;
                        itr = listNode;
                    }
                } else {
                    itr = itr.next;
                }
            }
        }
        size++;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}
