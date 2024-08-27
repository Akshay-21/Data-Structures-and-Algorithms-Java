package LinkedLists;

import com.sun.xml.internal.ws.assembler.jaxws.TerminalTubeFactory;
import org.w3c.dom.NodeList;

import javax.xml.soap.Node;
import java.util.List;

public class LinkedList {

    private static LinkedList linkedList;
    ListNode head;

    public static void main(String[] args) {
        linkedList = new LinkedList();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.insert(50);
        linkedList.insert(60);
        linkedList.insert(70);
        linkedList.insert(80);
//        linkedList.display();
        int length = linkedList.listLength();

      /*  System.out.println("Length of LinkedList: " + length);
        System.out.println();
        linkedList.delete(20);
        linkedList.display();
        System.out.println("Length of LinkedList: " + linkedList.listLength());*/

        System.out.println("==============================================");

       /* linkedList.insertAtBeginning(80);
        linkedList.display();
        System.out.println("Length of LinkedList: " + linkedList.listLength());*/

       /* System.out.println("==============================================");
        linkedList.insertElementInMiddleList(60);
        linkedList.display();
        System.out.println("Length of LinkedList: " + linkedList.listLength());*/

        System.out.println("==============================================");

        linkedList.insertElementSpecificPositionInList(150, 7);

        linkedList.display();
        System.out.println("Length of LinkedList: " + linkedList.listLength());

        System.out.println("==============================================");
        System.out.println("======================= Find Element =======================");
        System.out.println();

        System.out.println(linkedList.findElement(50));

        System.out.println("======================= Find/search an element in the list and return its value =======================");
        System.out.println();

        System.out.println(linkedList.findElementWithReturnItsValue(40));

        System.out.println("======================= Find/search an element in the list and return its position =======================");
        System.out.println();
        System.out.println(linkedList.findElementWithReturnItsPosition(70));
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

    //    Inserting a new node at the middle of the list (random location)
     /*
        e.g.
        10, 20, 30, 40, 50
        insert in middle 60
        10, 20, 30, 60, 40, 50
        */
    public void insertElementInMiddleList(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
        }

        ListNode currentNode = head;

        int length = linkedList.listLength();
        int middle = (length / 2);

        for (int i = 0; i < middle; i++) {
            currentNode = currentNode.getListNode();
        }

        newNode.setListNode(currentNode.getListNode());
        currentNode.setListNode(newNode);
    }

    //    Inserting a new node at the middle of the list (random location)
    public void insertElementSpecificPositionInList(int data, int position) {
        ListNode newNode = new ListNode(data);
        // Edge case: Insert at the head (position 0)
        if (position == 0) {
            head = newNode;
        }

        // Traverse to the node just before the desired position
        ListNode currentNode = head;
        int count = 0;

        // Find the node just before the target position
        while (currentNode != null && count < position - 1) {
            count++;
            currentNode = currentNode.getListNode();
        }

        // If current is null, the position is out of bounds
        if (currentNode == null) {
            throw new IndexOutOfBoundsException("Position exceeds the length of the list.");
        }

        // Insert the new node
        newNode.setListNode(currentNode.getListNode());
        currentNode.setListNode(newNode);

    }

    //      Find/Search Element in the list.
    public boolean findElement(int data) {
        if (head == null) {
            System.out.println("List is Empty!");
            return false;
        }
        ListNode currentNode = head;
        while (currentNode != null) {
            if (currentNode.getData() == data) {
                return true;
            }
            currentNode = currentNode.getListNode();
        }
        return false;
    }


    //    Find/search an element in the list and return its value.
    public int findElementWithReturnItsValue(int data) {
        if (head == null) {
            System.out.println("List is Empty!");
            return -1;
        }
        ListNode currentNode = head;
        while (currentNode != null) {
            if (currentNode.getData() == data) {
                return currentNode.getData();
            }
            currentNode = currentNode.getListNode();
        }
        return -1;
    }

    //    Find/search an element in the list and return its position.
    public int findElementWithReturnItsPosition(int data) {
        int position = 0;
        if (head == null) {
            System.out.println("List is Empty!");
            return -1;
        }
        ListNode currentNode = head;
        while (currentNode != null) {
            if (currentNode.getData() == data) {
                return position;
            }
            currentNode = currentNode.getListNode();
            position++;
        }
        return -1;
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