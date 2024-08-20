package LinkedLists;

public class LinkedList {

    ListNode head;

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.display();
        int length = linkedList.listLength();
        System.out.println("Length of LinkedList: " + length);
        System.out.println();
        linkedList.delete(20);
        linkedList.display();
        System.out.println("Length of LinkedList: " + linkedList.listLength());

        linkedList.insertAtBeginning(80);
        linkedList.display();
        System.out.println("Length of LinkedList: " + linkedList.listLength());
    }

    //  Inserting the first node and subsequent nodes into the Singly Linked list. (Insert Function)
    //  Insert a new node at the end OR append node into the list.
    public void insert(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
        } else {
            ListNode currentNode = head;
            while (currentNode.getListNode() != null) {
                currentNode = currentNode.getListNode();
            }
            currentNode.setListNode(newNode);
        }
    }

    //    Inserting a new node before the head (at the beginning)
    public void insertAtBeginning(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
        }
        ListNode currentNode = head;
        head = newNode;
        newNode.setListNode(currentNode);
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("List is Empty!");
            return;
        }

        if (head.getData() == data) {
            head = head.getListNode();
            return;
        }

        ListNode currentNode = head;
        while (currentNode.getListNode() != null && currentNode.getListNode().getData() != data) {
            currentNode = currentNode.getListNode();
        }

        if (currentNode.getListNode() == null) {
            System.out.println("Node with values " + data + " not found !");
        } else {
            currentNode.setListNode(currentNode.getListNode().getListNode());
        }

    }

    protected void display() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        ListNode currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.getData());
            currentNode = currentNode.getListNode();
        }

        System.out.println();
    }

    // Get the length of the linked list.
    protected int listLength() {
        int count = 0;
        if (head == null) {
            return count;
        } else {
            ListNode currentNode = head;
            while (currentNode != null) {
                count++;
                currentNode = currentNode.getListNode();
            }
        }
        return count;
    }

    //  check if the linked list is empty.
    protected boolean isEmpty() {
        return head == null;
    }
}

// Node of Linked List
class ListNode {
    private int data;
    private ListNode listNode;

    public ListNode(int data) {
        this.data = data;
        this.listNode = null;
    }

    protected int getData() {
        return data;
    }

    protected void setData(int data) {
        this.data = data;
    }

    protected ListNode getListNode() {
        return listNode;
    }

    protected void setListNode(ListNode listNode) {
        this.listNode = listNode;
    }
}