public class LL {

    Node head;
    private int size;

    void ll() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add to first
    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add at last of LinkedList
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // delete at first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("Can not delate anything");
            return;
        }
        size--;
        head = head.next;
    }

    // delete at last

    public void deleteLast() {
        if (head == null) {
            System.out.println("Can not delate anything");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            secondLast = secondLast.next;
            lastNode = lastNode.next;
        }
        secondLast.next = null;
    }

    // get size
    public int getSize() {
        return size;
    }

    // print LinkedList
    public void printLinkedList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("This");
        list.addFirst("is");
        list.printLinkedList();

        list.addLast("list");
        list.printLinkedList();

    }
}