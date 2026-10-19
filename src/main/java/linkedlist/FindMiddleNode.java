package linkedlist;

public class FindMiddleNode {

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

        //System.out.println("Middle Node: " + middleNode(head).val);
        System.out.println("Index Node: " + get(5, head));
        //Try with fast pointer and slow pointer approach
        //System.out.println("MiddleNodeFastPointerSlowPointer: " + middleNodeFastPointerSlowPointer(head).val);
    }

    public static ListNode middleNodeFastPointerSlowPointer(ListNode head) {
        ListNode fastPointer = head;
        ListNode slowPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        return slowPointer;
    }


    public static ListNode middleNode(ListNode head) {
        ListNode itr = head;
        int count = 0;
        while(itr != null) {
            count++;
            itr=itr.next;
        }

        int middle = count/2;

        itr = head;
        while(middle>0 && itr !=null){
            itr=itr.next;
            middle--;
        }
        return itr;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static int get(int index, ListNode head) {
        int val = -1;
        int sIndex=0;
        int fIndex=0;
        ListNode temp = head;
        if(sIndex > index) {
            return val;
        } else if (sIndex == index) {
            return temp.val;
        }
        ListNode slowPointer = temp;
        ListNode fastPointer = temp;
        while(fastPointer !=null && fastPointer.next !=null) {
            slowPointer = slowPointer.next;
            sIndex++;
            fastPointer = fastPointer.next.next;
            fIndex +=2;

            if(sIndex == index) {
                return slowPointer.val;
            } else if(fIndex == index) {
                return fastPointer != null ? fastPointer.val : val;
            } else if (sIndex < index && index < fIndex) {
                fIndex = sIndex;
                fastPointer = slowPointer;
            } else if(fastPointer == null) {
                return val;
            }

        }
        return val;
    }
}
