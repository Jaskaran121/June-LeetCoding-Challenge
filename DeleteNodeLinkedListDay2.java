import java.util.List;

public class DeleteNodeLinkedListDay2 {
    static ListNode head;
    static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
     }

    public static void deleteNode(ListNode node) {
        ListNode nextNode = node.next;
        node.val = nextNode.val;
        ListNode secondNextNode = nextNode.next;
        node.next = secondNextNode;
    }

    public static void printLinkedList(){
        ListNode node = head;
        while(node!=null){
            System.out.println(node.val);
            node = node.next;
        }
    }
    public static void main(String[] args){
        head =  new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        deleteNode(head.next);
        printLinkedList();
    }
}
