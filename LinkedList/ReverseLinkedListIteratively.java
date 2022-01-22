public class ReverseLinkedListIteratively {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void print() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.println("null");
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void reverseIterate() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            // update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node revereseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = revereseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;

    }

    public static void main(String[] args) {
        ReverseLinkedListIteratively list = new ReverseLinkedListIteratively();
        list.addFirst(5);
        list.addFirst(7);
        list.addFirst(2);
        list.addFirst(9);
        list.print();
        // list.reverseIterate();
        list.head = list.revereseRecursive(list.head);
        list.print();

    }
}
