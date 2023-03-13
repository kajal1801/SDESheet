class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { 
        this.val = val; 
    }
    ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = next; 
    }
}

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode prevNode = null;
        ListNode nextNode = head;
        ListNode temp = head;
        while(nextNode != null){
            nextNode = nextNode.next;
            temp.next = prevNode;
            prevNode = temp;
            temp = nextNode;
        }
        return prevNode;
    }
}
