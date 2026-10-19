package linkedlist;

public class RemoveElementFromLinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;


        System.out.println(removeElements(head, 4));
    }

    public static ListNode removeElements(ListNode head, int val) {
        System.out.println(head.hashCode());
        ListNode temp = new ListNode(0);
        System.out.println(temp.hashCode());
        temp.next=head;
        ListNode itr = temp;
        System.out.println(itr.hashCode());

        while(itr.next != null) {
            if (itr.next.val == val) {
                itr.next=itr.next.next;
            } else {
                itr=itr.next;
            }
        }
        return temp.next;
    }

    public static class ListNode {
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

//Next Problem: https://leetcode.com/problems/design-linked-list/description/

