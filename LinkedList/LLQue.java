//Remove Nth node from last........

public class LLQue {

    private int size;

    LLQue() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;
        int size;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public Node removeNthNode(Node head, int n) {
        if (head.next == null) {
            return null;
        }
        if (n == size) {
            return head.next;
        }

        int indexToSearch = size - n;
        Node prevNode = head;
        int i = 1;
        while (i < indexToSearch) {
            prevNode = prevNode.next;
            i++;
        }
        prevNode.next = prevNode.next.next;
        return head;
    }

    public static void main(String[] args) {
        // LLQue list = new LLQue();

    }
}
